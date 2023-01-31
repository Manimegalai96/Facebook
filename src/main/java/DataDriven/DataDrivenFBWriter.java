package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFBWriter {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\Users\\Manimegalai\\Desktop\\DatadrivenFacebook.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet cs = w.createSheet("FBWriter");
		Row r=cs.createRow(0);
		Cell ce = r.createCell(0);
		ce.setCellValue("Manimegalai");
		w.getSheet("FBWriter").createRow(1).createCell(1).setCellValue("M@ni");
FileOutputStream fos=new FileOutputStream(f);
w.write(fos);
w.close();
		
		
		

}}
