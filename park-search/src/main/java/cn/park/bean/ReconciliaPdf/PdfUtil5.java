package cn.park.bean.ReconciliaPdf;

import cn.park.pojo.Reconcilia;
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

public class PdfUtil5 {
    public void createPDF(Document document, PdfWriter writer, List<Reconcilia> reconcilias) throws IOException {
        try {
            document.addTitle("对账统计信息");
            document.addAuthor("scurry");
            document.addSubject("product sheet.");
            document.addKeywords("product.");
            document.open();
            PdfPTable table = createTable(writer, reconcilias);
            document.add(table);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }


    public static PdfPTable createTable(PdfWriter writer, List<Reconcilia> reconcilias) throws IOException, DocumentException {
        PdfPTable table = new PdfPTable(7);//生成一个两列的表格
        PdfPCell cell;
        int size = 70;
        Font font = new Font(BaseFont.createFont("C://Windows//Fonts//simfang.ttf", BaseFont.IDENTITY_H,
                BaseFont.NOT_EMBEDDED));
        for (int i = 0; i < reconcilias.size(); i++) {
            cell = new PdfPCell(new Phrase(reconcilias.get(i).getCname()+ "", font));//序号
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(reconcilias.get(i).getAname(), font));//城市
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(reconcilias.get(i).getPname(), font));//区域
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(reconcilias.get(i).getHappen()+"", font));//停车场名称
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(reconcilias.get(i).getPayType(), font));//停车场类型
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(reconcilias.get(i).getDescrible() + "", font));//原始车位
            cell.setFixedHeight(size);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase(reconcilias.get(i).getPrice()+ "", font));//新车位
            cell.setFixedHeight(size);
            table.addCell(cell);
        }
        return table;
    }
}
