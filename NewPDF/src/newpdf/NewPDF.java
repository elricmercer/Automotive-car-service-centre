/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpdf;
import java.io.FileOutputStream;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
/**
 *
 * @author guan.kiat
 */
public class NewPDF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Document document = new Document();
	    PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("testing.pdf"));
            document.open();
            PdfContentByte cb = writer.getDirectContent();
            cb.beginText();
            BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA,
            BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
            cb.setFontAndSize(bf, 39);
            cb.setRGBColorFill(0xcc, 0x66, 0x66);
            cb.showTextAligned(Element.ALIGN_LEFT, "Hello World :)", 36, 788, 0);
            cb.endText();
            document.close();
        } catch (Exception e){
            System.out.println(e);
        }        
    }
    
}
