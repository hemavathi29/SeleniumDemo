package Test;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotCode {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		
		//Take the screenshot of particular page
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);		
//		File dstfile = new File("C:\\Users\\HEMA\\eclipse-workspace\\Selenium\\Screenshot\\june24.png");
//		FileUtils.copyFile(src, dstfile);
		
		//different way to take a screenshot
//		EventFiringWebDriver e = new EventFiringWebDriver(driver);
//		File srcfile = e.getScreenshotAs(OutputType.FILE);
//		File dstfile = new File("C:\\Users\\HEMA\\eclipse-workspace\\Selenium\\Screenshot\\june24(2).png");
//		FileUtils.copyFile(srcfile, dstfile);
		
		Screenshot scrshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(scrshot.getImage(),"PNG", new File("C:\\Users\\HEMA\\eclipse-workspace\\Selenium\\Screenshot\\full.png"));
	}
}
