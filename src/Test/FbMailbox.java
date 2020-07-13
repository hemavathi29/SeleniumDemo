package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbMailbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("hemavathi024@gmail.com");
		
		//due to security reason we can't login to the gmail mail box
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/span/span")).click();
		
		//driver.findElement(By.xpath("//div[@class = 'Cp']//tr[@class = 'zA zE'][3]//span[@class = 'bA4']/span[text() = 'Naukri']")).click();
	}
}
