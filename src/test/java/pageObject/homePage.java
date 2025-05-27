package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class homePage extends BasePage {

    WebDriver driver;
	public homePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//span[text()='My Account']") WebElement clkaccount;
	@FindBy(xpath="(//a[normalize-space()='Register'])[1]") WebElement register;
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement login;
	
	public void myAccount()
	{
		
		//span[text()='My Account']
		clkaccount.click();
	}
	
	public void cliclRegister()
	{
		register.click();		
	}
	public void clickLogin()
	{
		login.click();
		
	}
	
}
