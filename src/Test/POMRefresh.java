package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMRefresh extends RefreshWindow
{
	WebDriver driver;
	
	@FindBy(id = "emailOrMobile")
	WebElement username;
	
	public POMRefresh(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUsername()
	{
		return username;
	}	
}
