package com.selenium.assignment;

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
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bluestone.com/");
		WebElement ring = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[2]/a"));
		
		FileInputStream scr1 = new FileInputStream("..//Selenium/ChromeDriver/Scenario5.xlsx");
		Workbook wb = WorkbookFactory.create(scr1);
		Sheet sht1 = wb.getSheet("Shee1");
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.moveToElement(ring).build().perform();
		
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[2]/div/ul/li[1]/div/ul/li[2]/a")).click();
		//Thread.sleep(2000);
		
		List<WebElement> defprice = driver.findElements(By.xpath("//div[@id = 'grid-view-result']//li//span[@class = 'p-wrap']//span[@id = 'bst-discounted-price']"));
		int defprisize = defprice.size();
		System.out.println(defprisize);
		
		System.out.println("Default Prices");
		for (int i = 0; i < defprisize-1; i++) 
		{
			String defname = defprice.get(i).getText();
			System.out.println(defname);
			Row rw1 = sht1.createRow(i);
			Cell cw1 = rw1.createCell(0);
			cw1.setCellValue(defname);
		}
		
		FileOutputStream fout1 = new FileOutputStream("..//Selenium/ChromeDriver/Scenario5.xlsx");
		wb.write(fout1);
		
		//price of sort order 
		Thread.sleep(2000);
		WebElement pri =  driver.findElement(By.xpath("//div[@id = 'top-filter']//span[text() = 'Price']"));
		
		act.moveToElement(pri).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[4]/div/div[1]/div/div[1]/aside/div/div[1]/div[2]/section/div/div/form/div/div[2]/span")).click();
		Thread.sleep(2000);
	
		List<WebElement> sortpric = driver.findElements(By.xpath("//div[@id = 'grid-view-result']//li//span[@class = 'b-price-wrapper']//span[@id = 'bst-discounted-price']"));
		int srtprisize = sortpric.size();
		
		Sheet sht2 = wb.getSheet("Sheet2");
		
		System.out.println("Sort price form low to high");
		for (int i = 0; i < srtprisize; i++) {
			String sortname =  sortpric.get(i).getText();
			System.out.println(sortname);
			Row rw2 = sht2.createRow(i);
			Cell cw2 = rw2.createCell(0);
			cw2.setCellValue(sortname);
		}	
		
		FileOutputStream fout2 = new FileOutputStream("..//Selenium/ChromeDriver/Scenario5.xlsx");
		wb.write(fout2);
		wb.close();
	}
}
