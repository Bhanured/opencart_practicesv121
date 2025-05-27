package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountRegister extends BasePage {

	public accountRegister(WebDriver driver)
	{
		super(driver);
		
	}

	
	//@FindBy(xpath="//input[@id='input-telephone']") WebElement telePhone;
	@FindBy(xpath="//input[@id='input-firstname']") WebElement firstName;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement lastName;
	@FindBy(xpath="//input[@id='input-email']") WebElement eMail;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement telePhone;
	@FindBy(xpath="//input[@id='input-password']") WebElement passWord;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement confirmPassword;
	@FindBy(xpath="//input[@name='agree']") WebElement agree;
	@FindBy(xpath="//input[@value='Continue']") WebElement clickButton;
	@FindBy(xpath="//div[@class='col-sm-9']//h1[1]") WebElement success;


public void setfirstName(String firstname)
{
	firstName.sendKeys(firstname);
}
public void lName(String lastname)
{
	lastName.sendKeys(lastname);
}
public void setEmailrName(String email)
{
	eMail.sendKeys(email);
}

public void setTelephone(String numPhone)
{
	telePhone.sendKeys(numPhone);
}

public void setPassword(String pwd)
{
	passWord.sendKeys(pwd);
}

public void setConfirmPassword(String confirmpwd)
{
	confirmPassword.sendKeys(confirmpwd);
}

public void agreed()
{
	agree.click();
}


public void clickbtn()
{
	clickButton.click();
}

public String getConfrimMsg()
{
	try
	{
		return(success.getText());
	}
	catch(Exception e)
	{
		return (e.getMessage());
		
	}
	
}
}


