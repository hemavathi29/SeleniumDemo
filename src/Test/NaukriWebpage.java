package Test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NaukriWebpage {
	@Test
	public void naukri()throws InterruptedException {
		
		//public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.naukri.com/");
			String parwind =  driver.getWindowHandle();
			
			Set<String> allwind = driver.getWindowHandles();
			System.out.println("No of window opened = "+ allwind.size());
			
			for (String windows : allwind) {
				if (!parwind.equalsIgnoreCase(windows))
				{
					driver.switchTo().window(windows);//switch to child window
					driver.manage().window().maximize();
					
					Thread.sleep(2000);
					System.out.println("Child window = "+ driver.getTitle());
					//driver.close();
				}
			}	
			driver.switchTo().window(parwind);
			System.out.println("Parenet window = "+driver.getTitle());
			//driver.close();
			driver.quit();
		}
	}

