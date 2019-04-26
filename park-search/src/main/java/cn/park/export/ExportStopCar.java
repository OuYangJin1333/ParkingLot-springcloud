package cn.park.export;

import cn.park.pojo.StopCar;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * 导出停车信息表
 */
public class ExportStopCar {
    /**
     * 导出数据
     * @return
     */
    public static ResponseEntity<byte[]> exportExcel(List<StopCar> stopCars) {
        HttpHeaders headers = null;
        ByteArrayOutputStream baos = null;
        try {
            //1.创建Excel文档
            HSSFWorkbook workbook = new HSSFWorkbook();
            //2.创建文档摘要
            workbook.createInformationProperties();
            //3.获取文档信息，并配置
            DocumentSummaryInformation dsi = workbook.getDocumentSummaryInformation();
            //3.1文档类别
            dsi.setCategory("停车记录信息");
            //3.2设置文档管理员
            dsi.setManager("shoufei");
            //3.3设置组织机构
            dsi.setCompany("停车管理系统");
            //4.获取摘要信息并配置
            SummaryInformation si = workbook.getSummaryInformation();
            //4.1设置文档主题
            si.setSubject("停车记录");
            //4.2.设置文档标题
            si.setTitle("停车信息");
            //4.3 设置文档作者
            si.setAuthor("shoufei");
            //4.4设置文档备注
            si.setComments("暂无");
            //创建Excel表单
            HSSFSheet sheet = workbook.createSheet("停车管理系统");
            //创建日期显示格式
            HSSFCellStyle dateCellStyle = workbook.createCellStyle();
            dateCellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
            //创建标题的显示样式
            HSSFCellStyle headerStyle = workbook.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.BLUE_GREY.index);
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            //定义列的宽度
            sheet.setColumnWidth(0, 20 * 256);
            sheet.setColumnWidth(1, 20 * 256);
            sheet.setColumnWidth(2, 20 * 256);
            sheet.setColumnWidth(3, 20 * 256);
            sheet.setColumnWidth(4, 20 * 256);
            sheet.setColumnWidth(5, 20 * 256);
            sheet.setColumnWidth(6, 20 * 256);
            //5.设置表头
            HSSFRow headerRow = sheet.createRow(0);
            //创建第一条数据
            HSSFCell cell1 = headerRow.createCell(0);
            cell1.setCellValue("城市");
            cell1.setCellStyle(headerStyle);
            HSSFCell cell2 = headerRow.createCell(1);
            cell2.setCellValue("区域");
            cell2.setCellStyle(headerStyle);
            HSSFCell cell3 = headerRow.createCell(2);
            cell3.setCellValue("停车场");
            cell3.setCellStyle(headerStyle);
            HSSFCell cell4 = headerRow.createCell(3);
            cell4.setCellValue("车牌");
            cell4.setCellStyle(headerStyle);
            HSSFCell cell5 = headerRow.createCell(4);
            cell5.setCellValue("会员账号");
            cell5.setCellStyle(headerStyle);
            HSSFCell cell6 = headerRow.createCell(5);
            cell6.setCellValue("停车开始时间");
            cell6.setCellStyle(headerStyle);
            HSSFCell cell7 = headerRow.createCell(6);
            cell7.setCellValue("离场时间");
            cell7.setCellStyle(headerStyle);
            HSSFCell cell8 = headerRow.createCell(7);
            //6.装数据
            for (int i = 0; i < stopCars.size(); i++) {
                HSSFRow row = sheet.createRow(i + 1);
                StopCar stopCar = stopCars.get(i);
                row.createCell(0).setCellValue(stopCar.getCname());
                row.createCell(1).setCellValue(stopCar.getAname());
                row.createCell(2).setCellValue(stopCar.getPartName());
                row.createCell(3).setCellValue(stopCar.getCarNumber());
                row.createCell(4).setCellValue(stopCar.getVid());
                HSSFCell beginCell = row.createCell(5);
                beginCell.setCellValue(stopCar.getBeginTime());
                beginCell.setCellStyle(dateCellStyle);
                HSSFCell endCell = row.createCell(6);
                beginCell.setCellValue(stopCar.getEndTime());
                beginCell.setCellStyle(dateCellStyle);
            }
            headers = new HttpHeaders();
            headers.setContentDispositionFormData("attachment",
                    new String("停车记录表.xls".getBytes("UTF-8"), "iso-8859-1"));
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);        //响应头信息
            //将Excel写到ByteArrayOutputStream中
            baos = new ByteArrayOutputStream();
            workbook.write(baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<byte[]>(baos.toByteArray(), headers, HttpStatus.CREATED);
    }
}
