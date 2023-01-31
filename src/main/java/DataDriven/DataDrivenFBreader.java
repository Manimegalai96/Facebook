package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import properties.Configurationhelper;

public class DataDrivenFBreader {
	
	public static String value;

	public static String singleData(String name, int row, int cell) throws InvalidFormatException, IOException {
		File f = new File(Configurationhelper.getInstanceCR().getSheetpath());
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet(name);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		CellType ct = c.getCellType();
		if (ct.equals(ct.STRING)) {
			 value = c.getStringCellValue();
			

		}else if(ct.equals(ct.NUMERIC)) {
			
			double numericCellValue = c.getNumericCellValue();
			int a=(int)numericCellValue;
			 value = String.valueOf(a);
			
			
		} 
		
		return value;
		}
	public static void allData() throws IOException {
		
		File f= new File("C:\\Users\\Manimegalai\\Desktop\\Selenium\\Facebook\\DataDriven\\DatadrivenFacebook.xlsx");
		FileInputStream fis =new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fis);
		Sheet s = w.getSheet("Facebook");
		int rows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			Row r = s.getRow(i);
			
			int cells = r.getPhysicalNumberOfCells();
			for (int j = 0; j < cells ; j++) {
				
				Cell c = r.getCell(j);
				
				CellType ce = c.getCellType();
				
				if (ce.equals(CellType.STRING)) {
					System.out.print(c.getStringCellValue()+" | ");
					
				}
				
			}System.out.println();
			
			
			}
		
		
		
		
		

	}
	
	
		
			

	public static void main(String[] args) throws IOException {
		allData();
		
	}
	


}