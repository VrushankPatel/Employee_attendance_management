package com.reportgenerator;

import java.sql.ResultSet;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.*;
import java.io.FileOutputStream;
import javax.swing.JTable;

public class GenerateReportMonthly {
    public void generateMonthReport(String filename,String employeeId,String date,int totalWorkingDays,int presentDays,int totalDays,JTable dataset){
        Document report = new Document(PageSize.A3);
        report.addAuthor("Vrushank Patel");
        report.addTitle("Employee Attendance  Management System");        
        try{
            PdfWriter.getInstance(report, new FileOutputStream(filename));
            report.open();            
            Paragraph para = new Paragraph("");                      
            para.setIndentationLeft(20);
            para.setIndentationRight(10);
            para.setAlignment(Paragraph.ALIGN_CENTER);
            para.add(new Paragraph("                    EAMS Monthly Attendance Summary\n",new Font(Font.getFamily("Segoe UI"), 25,Font.BOLD)));            
            para.add(new Paragraph("\nEmployee Id : "+employeeId,new Font(Font.getFamily("Segoe UI"), 15,Font.NORMAL)));                                                
            para.add(new Paragraph("\nDate : "+date,new Font(Font.getFamily("Segoe UI"), 15,Font.NORMAL)));                                    
            para.add(new Paragraph("Attendance percentage : "+String.valueOf(((100*presentDays)/totalWorkingDays))+"%",new Font(Font.getFamily("Segoe UI"), 15,Font.NORMAL)));                                                
            para.add(new Paragraph("Total Days : "+totalDays+"\nTotal Working Days : "+totalWorkingDays+"\nAttended Days : "+presentDays+"\n\n\n\n",new Font(Font.getFamily("Segoe UI"), 15,Font.NORMAL)));                                                            
            PdfPTable table = new PdfPTable(2);                                   
            table.addCell(new PdfPCell(new Paragraph("Date",new Font(Font.getFamily("Segoe UI"), 17.5f,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Attendance Status\n\n",new Font(Font.getFamily("Segoe UI"), 17.5f,Font.BOLD))));            
            for(int row = 0;row<dataset.getRowCount();row++){
                for(int column = 0;column<dataset.getColumnCount();column++){
                    table.addCell(new PdfPCell(new Paragraph(dataset.getValueAt(row, column)+"\n",new Font(Font.getFamily("Segoe UI"), 17.5f,Font.BOLD))));                    
                }
            }
            para.add(table);
            report.add(para);
          
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        report.close(); 
    }
}

