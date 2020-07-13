package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountrySelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/HEMA/Desktop/self%20learning%20training/Country.html");
		WebElement listbox = driver.findElement(By.xpath("//select"));
		
		Select s1 = new Select(listbox);
		//s1.selectByIndex(3);
		//s1.selectByVisibleText("Algeria");
		//s1.selectByValue("Albania");
		
		List<WebElement> opt = s1.getOptions();
		int count = opt.size();
		
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = opt.get(i).getText();
			System.out.println(text);
		}
	}
}






