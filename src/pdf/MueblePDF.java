/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf;


import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class MueblePDF {
    
    private String fechaActual="";
    
    
    //metodo para generar PDF
    public void generarPDF() throws FileNotFoundException, BadElementException, IOException{
        Document documento = new Document();
        try {
            
            //cargar fecha actual
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
            
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Reporte_Muebles.pdf"));
            Image header = Image.getInstance("src/img/logoPeda.png");
            header.setAlignment(Chunk.ALIGN_CENTER);
            //formato al texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("ESCUELA DE EDUCACIÓN SUPERIOR PEDAGÓGICA PÚBLICA \nCHIMBOTE \n"+fechaActual+"\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma",18,Font.BOLD,BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Muebles \n\n");
            
            documento.open();
            
            documento.add(header);
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(8);
            tabla.addCell("Nro Orden");
            tabla.addCell("Cod Patrimonial");
            tabla.addCell("Tipo");
            tabla.addCell("Unidad Medida");
            tabla.addCell("Estado");
            tabla.addCell("Procedencia");
            tabla.addCell("Ubicacion");
            tabla.addCell("Observacion");
            
            try {
                Connection cn = conexion.Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select nrOrden,CodigoPatrimonial,tipo,unidadMedida,estado,procedencia,ubicacion,observacion from muebles");
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    do{
                        tabla.addCell(String.valueOf(rs.getInt(1)));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        tabla.addCell(rs.getString(8));
                    }while(rs.next());
                    documento.add(tabla);
                }
                
                
            } catch (SQLException e) {
                System.out.println("Error en: "+e);
            }
            
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
            
        } catch (DocumentException e) {
            JOptionPane.showMessageDialog(null, "Error en: "+e);
        }
    }
}
