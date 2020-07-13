package listners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestNG_Listners.class)
public class GetTitle extends Base
{
	@BeforeMethod
	public void launch()
	{
		chromedriver();
		launchURL();
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
	@Test
	public void getErrormes() throws InterruptedException
	{
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		String errormsg =  driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]/div[1]/form/div/div[5]")).getText();
		String expectedmsg = "You have specifiy";
		assertEquals(errormsg, expectedmsg);
	}
	
	@Test
	public void login() 
	{
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("1245");
		driver.findElement(By.id("submitButton")).click();
		String homeact= driver.getTitle();
		String expected = "VTiger Home";
		assertEquals(homeact, expected ," Login Failed");
	}
}