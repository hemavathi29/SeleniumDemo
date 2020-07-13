package Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.switchTo().frame(1);
		driver.switchTo().frame("iframeResult");
		WebElement element = driver.findElement(By.xpath("/html/body/button"));
		
		Thread.sleep(1000);
		element.click();

		Set<String> allwin = driver.getWindowHandles();
		System.out.println("Totol window opened" + allwin.size());
		
		for (String hema : allwin) {
			driver.switchTo().window(hema);
			System.out.println(driver.getTitle());
		}
	}
}
