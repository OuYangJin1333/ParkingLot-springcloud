package cn.park.bean.ChargePdf;

import cn.park.pojo.Charge;
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

public class PdfUtil3 {
    public void createPDF(Document document, PdfWriter writer, List<Charge> charges) throws IOException {
        try {
            document.addTitle("停车收费记录表");
            document.addAuthor("scurry");
            document.addSubject("product sheet.");
            document.addKeywords("product.");
            document.open();
            PdfPTable table = createTable(writer, charges);
            document.add(table);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }


    public static PdfPTable createTable(PdfWriter writer, List<Charge> charges) throws IOException, DocumentException {
        PdfPTable table = new PdfPTable(11);//生成一个两列的表格
        PdfPCell cell;
        int size =65;
        Font font = new Font(BaseFont.createFont("C://Windows//Fonts//simfang.ttf", BaseFont.IDENTITY_H,
                BaseFont.NOT_EMBEDDED));
        for (int i = 0; i < charges.size(); i++) {
            cell = new PdfPCell(new Phrase(charges.get(i).getName(), font));//序号
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getAname(), font));//城市
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getPartName(), font));//区域
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getCarNumber(), font));//停车场名称
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getPayType(), font));//停车场类型
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getVid() + "", font));//原始车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getBeginTime() + "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getEndTime()+ "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getMoney() + "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getGivePrice() + "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(charges.get(i).getLostPrice() + "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
        }
        return table;
    }
}
