package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends BasePage{

	public myAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//h2[normalize-space()='My Account'])[1]") 
	WebElement myAccount_header;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") 
	WebElement logout_btn;
	
	
	public boolean isMyAcoountPageExist()
	{
		try {
		return myAccount_header.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public void clickLogout()
	{
		logout_btn.click();
	}
    
}
