package cn.park.bean.LogPdf;

import cn.park.pojo.PilLog;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class PdfUtil4 {
    public void createPDF(Document document, PdfWriter writer, List<PilLog> pilLogs) throws IOException {
        try {
            document.addTitle("停车日志记录");
            document.addAuthor("scurry");
            document.addSubject("product sheet.");
            document.addKeywords("product.");
            document.open();
            PdfPTable table = createTable(writer, pilLogs);
            document.add(table);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }


    public static PdfPTable createTable(PdfWriter writer, List<PilLog> pilLogs) throws IOException, DocumentException {
        PdfPTable table = new PdfPTable(9);//生成一个两列的表格
        PdfPCell cell;
        int size =60;
        Font font = new Font(BaseFont.createFont("C://Windows//Fonts//simfang.ttf", BaseFont.IDENTITY_H,
                BaseFont.NOT_EMBEDDED));
        for (int i = 0; i < pilLogs.size(); i++) {
            cell = new PdfPCell(new Phrase(pilLogs.get(i).getId() + "", font));//序号
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(pilLogs.get(i).getAid(), font));//城市
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(pilLogs.get(i).getTime()+"", font));//区域
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(pilLogs.get(i).getContent(), font));//停车场名称
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(pilLogs.get(i).getFunction(), font));//停车场类型
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(pilLogs.get(i).getResult()+ "", font));//原始车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(pilLogs.get(i).getTerminalIp() + "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(pilLogs.get(i).getTerminalName() + "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(pilLogs.get(i).getMac()+ "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
        }
        return table;
    }
}
