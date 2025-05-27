package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {

	public loginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='input-email']") WebElement inputEmail_login;
	@FindBy(xpath="//input[@id='input-password']") WebElement passWord_login;
	@FindBy(xpath="//input[@value='Login']") WebElement login_btn;
	
	public void login_email(String email)
	{
		inputEmail_login.sendKeys(email);
	}
	public void login_pass(String password)
	{
		passWord_login.sendKeys(password);
	}
	public void login_btn()
	{
		login_btn.click();
	}
	
	

}
