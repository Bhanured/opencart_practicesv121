package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.homePage;
import pageObject.loginPage;
import pageObject.myAccountPage;
import utilities.DataProviders;

public class TC__003_DDT extends base {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven")
	public void verifyLogoutDDT(String email,String pwds,String exp)
	{
		
		logger.info("*** starting tc__003 *** ");
		try {
		homePage hp=new homePage(driver);
		hp.myAccount();
	    hp.clickLogin();
	    
	    
	    loginPage lp=new loginPage(driver);
	    lp.login_email(email);
	    lp.login_pass(pwds);
	    lp.login_btn();
	    Thread.sleep(3000);
	    
	    myAccountPage ap=new myAccountPage(driver);
	    boolean targetPage=ap.isMyAcoountPageExist();
	    if(exp.equalsIgnoreCase("Valid"))
	    {
	    	if(targetPage==true)
	    	{
	    		ap.clickLogout();
	    		Assert.assertTrue(true);
	    		//ap.clickLogout();
	    	}
	    	else
	    	{
	    		Assert.assertTrue(false);
	    	}
	    }
	    else
	    {
	    	if(targetPage==true)
	    	{
	    		ap.clickLogout();
	    		Assert.assertTrue(false);
	    		//ap.clickLogout();
	    	}
	    	else
	    	{
	    		Assert.assertTrue(true);
	    	}
	    	
	    	
	    	
	    }
		}
	    catch(Exception e)
    	{
    		Assert.fail();
    	}
		logger.info("*** logouttc__003 *** ");
	}
	//logger.info("*** logouttc__003 *** ");
	//logger.info("*** logouttc__003 *** ");

}
