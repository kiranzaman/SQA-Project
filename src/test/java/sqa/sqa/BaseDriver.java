package sqa.sqa;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseDriver {
	protected WebDriver driver = null;
	protected String baseUrl = null;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser){
		/*
		if(browser.equalsIgnoreCase("firefox")){
			System.out.println("Firefox");
			System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("came after driver");
		}
		*/
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Chrome");
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			driver = new ChromeDriver();
		}

		/*if(browser.equalsIgnoreCase("opera")){
			System.out.println("Opera");
			System.setProperty("webdriver.opera.driver", "resources/operadriver.exe");
			OperaOptions options = new OperaOptions();
		    options.setBinary(new File("C:\\Users\\Kiran Khursheed\\AppData\\Local\\Programs\\Opera\\57.0.3098.102\\opera.exe"));

		    driver = new OperaDriver(options);
	
			System.out.println("Came after opera");
		
		}*/
//		if(browser.equalsIgnoreCase("safari")){
//			System.out.println("Safari");
//			System.setProperty("webdriver.safari.driver", "resources/SafariDriver.safariextension");
//			driver = new SafariDriver();
//		}
		baseUrl = "http://localhost:52537/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
