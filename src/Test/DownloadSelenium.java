package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadSelenium {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/p[1]/a")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\HEMA\\Desktop\\downloadsel.exe");
	}
}
