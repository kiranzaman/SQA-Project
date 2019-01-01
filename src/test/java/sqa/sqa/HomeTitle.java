package sqa.sqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTitle extends BaseDriver{
	
	public void hometitle() {
		String expectedTitle = "Home Page - My ASP.NET Application";
		String actualTitle = driver.getTitle();
		System.out.println(expectedTitle);
		System.out.println(actualTitle);
		System.out.println("entered");
		Assert.assertEquals(actualTitle,expectedTitle);
		System.out.println("Exiting test");
	}
	public void homeheading() {
		WebElement text = driver.findElement(By.id("h1"));
		String h1 = text.getText();
		System.out.println(h1);
		System.out.println("entered");
		
		Assert.assertEquals(h1, "Welcome To ABC Org");
	}
	
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
	public void verifyHomePageTitle ()
	{
		System.out.println("Home ");
		driver.get(baseUrl);
		Login log = new Login();
		try {
			log.login(driver);
			Thread.sleep(100);
		}
			catch(Exception e) {
				System.out.println("exception occured");
			}
		hometitle();		
		homeheading();
		WebElement btn1 = driver.findElement(By.id("button1"));
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		button(btn1);
	}
}
