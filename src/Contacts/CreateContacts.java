package Contacts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContacts extends Base
{
	@BeforeMethod
	public void launch() throws IOException
	{
		Chromedriver();
		launchURL();
		loginapp();
	}

	@AfterMethod
	public void quit() 
	{
		driver.quit();
	}
	
	@Test
	public void Contacts() throws InterruptedException
	{
		//String parentwindow = driver.getWindowHandle();
		
		//click on the Contacts options.
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/table/tbody/tr/td[8]/a")).click();
		implicitwati();
		
		//click on +symbol on contact page to create new contact 
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[1]/a/img")).click();
		implicitwati();
		
		//To select the full Name
		WebElement sirname = driver.findElement(By.xpath("//select[@name = 'salutationtype']"));
		selectbyVisibletext(sirname,"Mr.");
		
		//Enter the firstname
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Ganesha");
		
		//enter the lastnanme
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("S");

		//Enter the phone number 
		driver.findElement(By.xpath("//input[@id = 'phone']")).sendKeys("1234253673");
		
		//click on +symbol to load child window 
		driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td[2]/div/form/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/img")).click();
		
		switchtochild();
		
		//Hardcoded the value of organization i.e test1
		driver.findElement(By.xpath("//input[@name = 'search_text']")).sendKeys("test1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'search']")).click();
		
		implicitwati();
		//click on that contact 
		driver.findElement(By.xpath("//*[@id=\"1\"]")).click();
		
		//driver.switchTo().window(parentwindow);
		switchtoparenet();

		//click on Save button
		driver.findElement(By.xpath("//table[@class = 'dvtContentSpace']//input[@title= 'Save [Alt+S]']")).click();
		
		Thread.sleep(3000);
	}
}
