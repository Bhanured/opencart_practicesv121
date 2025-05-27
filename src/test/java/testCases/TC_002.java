package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.homePage;
import pageObject.loginPage;
import pageObject.myAccountPage;

public class TC_002 extends base {
	@Test(groups={"sanity","master"})
	public void verify_Loigin()
	{
		logger.info("*** Starting TC_002 ***");
		try {
		homePage hp=new homePage(driver);
		hp.myAccount();
	    hp.clickLogin();
	    
	    
	    loginPage lp=new loginPage(driver);
	    lp.login_email(p.getProperty("email"));
	    lp.login_pass(p.getProperty("password_login"));
	    lp.login_btn();
	    
	    myAccountPage ap=new myAccountPage(driver);
	    boolean targetPage=ap.isMyAcoountPageExist();
	    Assert.assertTrue(targetPage);
	    logger.info(" ** finished TC_002 ** ");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
}
