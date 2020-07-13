package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaWriteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fin = new FileInputStream("..//Selenium/ChromeDriver/SeleniumProject.xlsx");
		
		Workbook wb = WorkbookFactory.create(fin);
		Sheet sht = wb.getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver","..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		List<WebElement> row = driver.findElements(By.xpath("//div[@class = 'brandmenu-v2 light l-box clearfix']/ul/li"));
		
		int rowno = row.size();
		System.out.println(rowno);
		
		for (int i = 0; i < rowno; i++) 
		{
			 String name = row.get(i).getText();
			 System.out.println(name);
			 Row rw = sht.createRow(i);
			 Cell cw = rw.createCell(0);
			 System.out.println(cw);
			 cw.setCellValue(name);
		}		
		FileOutputStream fout = new FileOutputStream("..//Selenium/ChromeDriver/SeleniumProject.xlsx");
		wb.write(fout);
		wb.close();
	}
}
