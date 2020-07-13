package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//FileInputSream and FileOutputStream must be same arguments ex.File file.
		FileInputStream fi = new FileInputStream("..//Selenium/ChromeDriver/SeleniumProject.xlsx");
		
		Workbook wb = WorkbookFactory.create(fi);
		
		Sheet sht = wb.getSheet("Sheet1");
		Row rw = sht.createRow(7);
		Cell cw = rw.createCell(9);
		
		cw.setCellValue("Selenium");
		
		//path to show where we need to write is given by FileOutputStream and to save purpose we will use it
		FileOutputStream fou = new FileOutputStream("..//Selenium/ChromeDriver/SeleniumProject.xlsx");
		wb.write(fou);//Actual write operation done here
	}
}
