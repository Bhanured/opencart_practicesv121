package testCases;

import pageObject.accountRegister;
import pageObject.homePage;
import org.testng.Assert;
import org.testng.annotations.*;

public class TC_accountRegistration_001 extends base{
	//WebDriver driver;
	
@Test(groups={"Regression","Master"})
	public void verify_acc()
	{
	try {
	logger.info("**** Starting TC001_ACCOUNTREGISTRATIONTEST ****");
	homePage home=new homePage(driver);
	home.myAccount();
	logger.info("**** CLICKED ON MYACCOUNT ****");
	
	home.cliclRegister();
	logger.info("**** CLICKED ON REGISTER ****");
	
	accountRegister registerpage=new accountRegister(driver);
	logger.info("**** PROVIDING USER DETAILS ****");
	registerpage.setfirstName(randomString().toUpperCase());
	registerpage.lName(randomString().toUpperCase());
	registerpage.setEmailrName(randomString()+"@gmail.com");
	registerpage.setTelephone(randomNumeric());
	
	
	String s=randomAlphaNumeric();
	registerpage.setPassword(s);
	registerpage.setConfirmPassword(s);
	registerpage.agreed();
	registerpage.clickbtn();
	String cofmsg=registerpage.getConfrimMsg();
	if(cofmsg.equals("Your Account Has Been Created!"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		logger.error("test failed...");
		logger.debug("debug logs");
		Assert.assertTrue(false);
		
	}
	
	//Assert.assertEquals(cofmsg, "uour Account Has Been Created!");	
	}
	catch(Exception e)
	{
		
		Assert.fail();
	}
	logger.info("**** FINISHED REGISTER ****");
	
	}


	
	

}
