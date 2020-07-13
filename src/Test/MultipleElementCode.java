package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementCode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "../Selenium/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/HEMA/Desktop/self%20learning%20training/MultipleElement.html");
		List<WebElement> chkout = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		
		//size() -> provide the size of the webelement present in the WebElement list.
		int checkcout = chkout.size();
		System.out.println(checkcout);
		
		for (int i = 0; i < checkcout; i++) 
		{
			chkout.get(i).click();//get() -> checking for each element
			Thread.sleep(200);
			//chkout.isSelected() option is not displayed as it will be not hve any meaning.
			System.out.println(chkout.get(i).isSelected());
		}
		
		//Getting the links 
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int linkcount =  allLinks.size();
		System.out.println("No of link in webpag - "+ linkcount);
		
		for (int i = 0; i < linkcount; i++) 
		{
			String text = allLinks.get(i).getText();
			System.out.println("-->"+text);		
		}
		
		//allLinks.get(1).click();//we can use click() also in the findElements()
		//System.out.println(driver.getTitle());
		
		//Getting the value present in the table 
		List<WebElement> tablecontent = driver.findElements(By.xpath("//td"));
		
		int tablecount = tablecontent.size();
		System.out.println("No of column- "+ tablecount);
	
//		for (int i = 0; i < tablecount; i++) 
//		{
//			String text = tablecontent.get(i).getText();
//			System.out.println("-->"+text);		
//		}
		
		for(WebElement hema : tablecontent)
		{
			System.out.println(hema.getText());
		}
	}
 }

