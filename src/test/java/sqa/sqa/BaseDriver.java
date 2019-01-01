package sqa.sqa;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
		
		if(browser.equalsIgnoreCase("internetexplorer")){
			System.out.println("Internet Explorer");
			System.setProperty("webdriver.ie.driver", "resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		if(browser.equalsIgnoreCase("firefox")){
			System.out.println("Firefox");
			System.setProperty("webdriver.gecko.driver","C:\\SeleniumGecko\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("came after driver");
		}
		
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Chrome");
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			driver = new ChromeDriver();
		}

		if(browser.equalsIgnoreCase("edge")){
			System.out.println("Edge");
			System.setProperty("webdriver.edge.driver", "resources/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		
		if(browser.equalsIgnoreCase("opera")){
			System.out.println("Opera");
			System.setProperty("webdriver.opera.driver", "resources/operadriver.exe");
			OperaOptions options = new OperaOptions();
		    options.setBinary(new File("C:\\Users\\Kiran Khursheed\\AppData\\Local\\Programs\\Opera\\57.0.3098.102\\opera.exe"));

		    driver = new OperaDriver(options);
	
			System.out.println("Came after opera");
		
		}
		baseUrl = "http://localhost:52537/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
