package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InbuildMethods {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/HEMA/Desktop/self%20learning%20training/method.html");
		WebElement textbox =  driver.findElement(By.xpath("//textarea[@name = 'myTextBox']"));
		
		//clear() 
		//textbox.clear();
		
		//select all the element (ctrl+a)
		textbox.sendKeys(Keys.CONTROL + "a");
		Thread.sleep(2000);
		
		//to delete the contains in the textbox
		textbox.sendKeys(Keys.BACK_SPACE);
		
		//getAttribute() method
		System.out.println("value present - "+ textbox.getAttribute("value"));
	}
}

