package Test;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "..//Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		//1st link having one button
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		
		System.out.println(alt.getText());
		alt.accept();

//		
//		//2nd link has 2button press
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
//		
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("/html/body/button")).click();
//		
//		Thread.sleep(2000);
//		Alert alte = driver.switchTo().alert();
//		Thread.sleep(2000);
//	
//		System.out.println(alte.getText());
//		alte.dismiss();
		
		//3rd link 
//		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
//		driver.switchTo().frame("iframeResult");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("C:\\Users\\HEMA\\Downloads\\Documentum\\Hemavathi.docx");;
//		Thread.sleep(2000);		
	}
}


