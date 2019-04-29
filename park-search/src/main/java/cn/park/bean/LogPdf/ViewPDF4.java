package cn.park.bean.LogPdf;

import cn.park.pojo.PilLog;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ViewPDF4 extends AbstractPdfView {

  @Override
  protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
                                  HttpServletRequest request, HttpServletResponse response) throws Exception {
      
      String fileName = new Date().getTime()+"_quotation.pdf"; // 设置response方式,使执行此controller时候自动出现下载页面,而非直接使用excel打开
      response.setCharacterEncoding("UTF-8");
      response.setContentType("application/pdf");
      response.setHeader("Content-Disposition","attachment;filename=" + new String(fileName.getBytes(), "iso8859-1"));
      List<PilLog> pilLogs = (List<PilLog>) model.get("sheet4");
      PdfUtil4 pdfUtil = new PdfUtil4();
      pdfUtil.createPDF(document, writer, pilLogs);
  }
}