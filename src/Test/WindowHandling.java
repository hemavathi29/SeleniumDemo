package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/button")).click();
		
		//String parentwind =  driver.getWindowHandle();
		
		Set<String> allwind = driver.getWindowHandles();
		
		Iterator<String> it =  allwind.iterator();
		String pw = it.next();
		String cw = it.next();
		
		int allwindsize = allwind.size();
		System.out.println("Total windows opened = " + allwindsize);
	
			if(!pw.equalsIgnoreCase(cw))
			{
				//Switch to the respective web-page
				driver.switchTo().window(cw);
				System.out.println("Child window = " + (driver.getTitle()));
				
				driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[1]/a[1]")).click();
				Thread.sleep(2000);
				System.out.println("child window after clicking = "+ driver.getTitle());	
			}
			
		Thread.sleep(2000);
		
		//if the child window closed then parent window is not closed so we need to switch to the parent web-page
		driver.switchTo().window(pw);
		driver.findElement(By.xpath("/html/body/div[5]/div/a[5]")).click();//click on Themes
		driver.getTitle();
	}
}

