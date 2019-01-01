package sqa.sqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ReportTest extends BaseDriver{
	
	public void button(WebElement btn ) {
		try
		{
		  btn.isDisplayed();
		  System.out.println("Submit button has displayed");
		  btn.click();
		}
		catch (Exception e)
		{
		  System.out.println("Submit button did not displayed");
		} 
	}
	
	@Test
	public void verifyHomePageTitle()
	{
		driver.get(baseUrl);
		Login log = new Login();
		try {
			log.login(driver);
		}
			catch(Exception e) {
				System.out.println("exception occured");
			}
		WebElement btn1 = driver.findElement(By.id("button3"));
		button(btn1);
	}
	

}
