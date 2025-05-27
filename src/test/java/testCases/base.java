package testCases;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class base {
	protected WebDriver driver;
	public Logger logger;
	public Properties p;
	@Parameters({"os","browser"})
	@BeforeClass(groups={"sanity","regression","master","Datadriven"})
	
		public void setup(String os,String br) throws IOException 
		{
		FileReader file=new FileReader("./src//test//resources//config.properti");
		p=new Properties();
		p.load(file);
		
		
		
		
		
		
		logger=LogManager.getLogger(this.getClass());
		System.out.print("before class");
		switch(br.toLowerCase())
		{
		case "chrome": driver=new ChromeDriver();
		              break;
		case "edge": driver=new EdgeDriver();
        break;
		case "firefox": driver = new FirefoxDriver(); break;
        default:System.out.print("Invalid browser");
        return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("urls"));
		}
	@AfterClass
		public void tearDown() throws InterruptedException	
		{
		System.out.print("after class");
		Thread.sleep(5000);
		driver.quit();
			
		}
	
	

	    public String randomString() {
	        return RandomStringUtils.randomAlphabetic(5);
	    }

	    public String randomNumeric() {
	        return RandomStringUtils.randomNumeric(10);
	    }

	    public String randomAlphaNumeric() {
	    	
	        return randomString()+"@"+randomNumeric();
	    }
	}

	

