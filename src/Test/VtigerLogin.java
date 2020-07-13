package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VtigerLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name = 'user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name = 'user_password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id = 'submitButton']")).click();	
		
		WebElement selectvalue =  driver.findElement(By.xpath("//select[@id = 'qccombo']"));
		
		Select s1 = new Select(selectvalue);
		List<WebElement> opt = s1.getOptions();
		
		ArrayList<String> a1 = new ArrayList<>();
		
		int listsize = opt.size();
		for (int i = 0; i < listsize; i++) {
			String text = opt.get(i).getText();
			System.out.println(text);	
			//s1.selectByIndex(i);
			a1.add(text);
		}

		System.out.println("-----------------------");
		
		Collections.sort(a1);
		
		for (String hema : a1) {
			System.out.println(hema);
		}
		
		s1.selectByVisibleText("New Event");
	}
}
