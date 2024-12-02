package com.ashokit.pdf;


import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.stream.Stream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPHeaderCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import comashokit.pojo.Student;

public class GeneratePDF_File {
	public void generatePdf(List<Student> students) throws Exception {
		File f=new File("Students.pdf");
		FileOutputStream fos=new FileOutputStream(f);
		
		Document doc=new Document();
		PdfWriter.getInstance(doc, fos);
		doc.open();
		
		// Add table
        float[] columnWidths = {50, 150, 200};
        PdfPTable table=new PdfPTable(3);
        PdfPHeaderCell phc=new PdfPHeaderCell();
        Stream.of("SID","NAME","LOCATION").forEach(headerTitle->{
        	PdfPCell header=new PdfPCell();
        	Font headFont=FontFactory.getFont(FontFactory.TIMES_BOLD);
        	//header.setBackgroundColor(Color.CYAN);
        	//header.setBorder(Color.CYAN);
        	header.setHorizontalAlignment(Element.ALIGN_CENTER);
        	header.setBorderWidth(2);
        	header.setPhrase(new Phrase(headerTitle,headFont));
        	table.addCell(header);
        
        });
        
        for(Student s:students) {
            PdfPCell idCell = new PdfPCell(new Phrase(String.valueOf(s.getSId()))); // Convert SID to String
        	idCell.setPaddingLeft(4);
        	table.addCell(idCell);
        	PdfPCell nameCell =new PdfPCell(new Phrase(s.getSName()));
        	table.addCell(nameCell);
        	PdfPCell locationCell=new PdfPCell(new Phrase(s.getLocation()));
        	table.addCell(locationCell);
        }
        doc.add(table);
               
		/*
		 * // Add table headers table.addCell("ID"); table.addCell("Name");
		 * table.addCell("Location"); for (Student user : students) {
		 * table.addCell(String.valueOf(user.getSId())); table.addCell(user.getSName());
		 * table.addCell(user.getLocation()); }
		 * 
		 * // Add table to document doc.add(table);
		 */

        // Close document
        doc.close();
        System.out.println("PDF generated at: " + f);
	}

}
