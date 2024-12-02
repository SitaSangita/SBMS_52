package com.ashokit.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.ashokit.beans.IStudentDaoImpl;
import com.ashokit.excel.ExcelFileGenerator;
import com.ashokit.pdf.GeneratePDF_File;

import comashokit.pojo.Student;

public class StudentService {
	private IStudentDaoImpl iStudentDaoImpl;
	private GeneratePDF_File generatePdfFile;
	private ExcelFileGenerator excelFileGenerator;
	public StudentService(IStudentDaoImpl iStudentDaoImpl,GeneratePDF_File generatePdfFile,ExcelFileGenerator excelFileGenerator) {
		this.iStudentDaoImpl=iStudentDaoImpl;
		this.excelFileGenerator=excelFileGenerator;
		this.generatePdfFile=generatePdfFile;
	}
	public void getFileData(String filePath) throws IOException {
		File f=new File(filePath);
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line = br.readLine();
		while(line !=null) {
			String[] split = line.split(",");
			Integer sid=Integer.parseInt(split[0]);
			String sname=split[1];
			String location=split[2];			
			iStudentDaoImpl.inserDataInDataBase(sid, sname, location);
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}
	public void getStudents() throws IOException {
		List<Student> students=iStudentDaoImpl.getStudent();
				excelFileGenerator.excelFileGenerator(students);
				students.forEach(student->{
				System.out.println(student);});
	}
	public void generatePdf() throws Exception {
		List<Student> students=iStudentDaoImpl.getStudent();
				generatePdfFile.generatePdf(students);
				students.forEach(student->{
					System.out.println(student);});
	}
}