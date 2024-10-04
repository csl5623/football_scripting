package com.api.futbol.service;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfTable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public abstract class ExportAbstractService {
    
    public HttpServletResponse initialResponseForExportPdf(HttpServletResponse response,String filemane){

        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat();

        String currentDateTime = dateFormat.format(new Date());

        String headerKey = "Content-Disposition";

        String headerValue = "attachment; filename=pdf_" + filemane+ "_" + currentDateTime  + ".pdf";

        response.setHeader(headerKey, headerValue);

        return response;
    }

    public void writeTableHeaderPDF(PdfPTable  table, String[] headers){
        
       table.setWidthPercentage(100);

        // cell
        PdfPCell cell = new PdfPCell();

        for (int i = 0; i< headers.length;i++){
            cell.setPhrase(new Phrase(headers[i],getFontContent()));
            table.addCell(cell);
        }

    }

    public Font getFontTitle() {
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        return font;
    }


    public Font getFontSubtitle() {
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setSize(12);
        return font;
    }

    public Font getFontContent() {
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setSize(10);
        return font;
    }

    public void enterSpace(Document document) {
        Paragraph space = new Paragraph(" ", getFontSubtitle());
        space.setAlignment(Paragraph.ALIGN_LEFT);
        document.add(space);
    }


    public XSSFWorkbook workbook;

    public XSSFSheet sheet;

    public void newReportExcel(){

        workbook = new XSSFWorkbook();
    }

    public HttpServletResponse initResponseForExportExcel(HttpServletResponse response, String fileName) {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=" + fileName + "_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
        return response;
    }

}
