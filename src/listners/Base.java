package listners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void chromedriver()
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	public static void launchURL()
	{
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
	}
	
	public void takeScreenshot(String testmethodname) throws IOException
	{
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dstfile = new File("C:\\Users\\HEMA\\eclipse-workspace\\Selenium\\Screenshot\\"+testmethodname+"_"+".png");
		FileUtils.copyFile(scrfile, dstfile);
	}
}


