package sqa.sqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sector extends BaseDriver{
	
	
	public void button(WebElement btn ) {
		try
		{
		  btn.isDisplayed();
		  System.out.println("Reports button has displayed");
		  btn.click();
		}
		catch (Exception e)
		{
		  System.out.println("Reports button did not displayed");
		} 
	}
	
	@Test
	public void InsertDataOnPage ()
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
		System.out.println("SElecting Sector report");
		
		 WebElement dropdown = driver.findElement(By.id("monthlyreport"));
		 dropdown.click(); 
		 
		 driver.findElement(By.xpath("//*[@id=\"monthlyreport1\"]/li[7]/a")).click();
		 System.out.println("Sector Report selected");
		 
		 try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		 
		 Select month = new Select(driver.findElement(By.id("month")));	
		 month.selectByVisibleText("December");

		 WebElement year = driver.findElement(By.id("year"));
		 year.sendKeys("2018");
		 
		 Select region = new Select(driver.findElement(By.id("sector")));	
		 region.selectByVisibleText("Fundry");
		 
		 WebElement submit = driver.findElement(By.id("submit"));
		 submit.click();
		 
	
		try {
			Thread.sleep(3500);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Monthly Report Viewed Successfully");
	}
	

}
