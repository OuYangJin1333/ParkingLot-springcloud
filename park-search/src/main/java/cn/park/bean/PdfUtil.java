package cn.park.bean;

import cn.park.pojo.Part;
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

public class PdfUtil {

    public void createPDF(Document document, PdfWriter writer, List<Part> parts) throws IOException {
        try {
            document.addTitle("停车报表记录");
            document.addAuthor("scurry");
            document.addSubject("product sheet.");
            document.addKeywords("product.");
            document.open();
            PdfPTable table = createTable(writer, parts);
            document.add(table);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }


    public static PdfPTable createTable(PdfWriter writer, List<Part> parts) throws IOException, DocumentException {
        Document document=new Document();
        document.addTitle("停车报表记录");
        int size =50;
        PdfPTable table = new PdfPTable(7);//生成一个两列的表格
        PdfPCell cell;
        Font font = new Font(BaseFont.createFont("C://Windows//Fonts//simfang.ttf", BaseFont.IDENTITY_H,
                BaseFont.NOT_EMBEDDED));
        for (int i = 0; i < parts.size(); i++) {
            cell = new PdfPCell(new Phrase(parts.get(i).getId() + "", font));//序号
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(parts.get(i).getCname(), font));//城市
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(parts.get(i).getAname(), font));//区域
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(parts.get(i).getPartName(), font));//停车场名称
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(parts.get(i).getType(), font));//停车场类型
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(parts.get(i).getOldCount() + "", font));//原始车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(parts.get(i).getCount() + "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
        }
        return table;
    }
}