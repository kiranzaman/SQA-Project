package sqa.sqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertData extends BaseDriver{
	
	
	public void button(WebElement btn ) {
		try
		{
		  btn.isDisplayed();
		  System.out.println("Insert Data button has displayed");
		  btn.click();
		}
		catch (Exception e)
		{
		  System.out.println("Isert Data button did not displayed");
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
		WebElement btn1 = driver.findElement(By.id("button2"));
		button(btn1);
		System.out.println("Inserting Data: ");
		WebElement company = driver.findElement(By.id("companytext"));
		company.sendKeys("PUCIT");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Lahore, Pakistan");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Lahore");
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("Kiran");
		
		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.sendKeys("Zaman");
		WebElement mobilenumber = driver.findElement(By.id("mobilenumber"));
		mobilenumber.sendKeys("+923008375789");
		
		WebElement landline = driver.findElement(By.id("landline"));
		landline.sendKeys("04237865446");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kiran.k.zaman@gmail.com");
		
		//WebElement mySelectElement = driver.findElement(By.id("mySelect"));
		//Select dropdown= new Select(mySelectElement);
		
		Select dropdown = new Select(driver.findElement(By.id("sector")));	
		dropdown.selectByVisibleText("Plastic");
		//dropdown.selectByIndex(2);
		
		WebElement leadsource = driver.findElement(By.id("leadsource"));
		leadsource.sendKeys("Mr. John Lea");
		
		WebElement region = driver.findElement(By.id("region"));
		region.sendKeys("South");
		
		WebElement product = driver.findElement(By.id("product"));
		product.sendKeys("Virtual Device");
		
		Select principal = new Select(driver.findElement(By.id("principal")));	
		principal.selectByVisibleText("Cook_Compression");
		
		Select status = new Select(driver.findElement(By.id("selectstatus")));	
		status.selectByVisibleText("No");
		
		WebElement designation = driver.findElement(By.id("designation"));
		designation.sendKeys("Assisstant Manager");
		
		WebElement fromDateBox = driver.findElement(By.id("selectdate"));
		fromDateBox.clear();
		fromDateBox.sendKeys("8-Dec-2018");
		
		Select service = new Select(driver.findElement(By.id("service")));	
		service.selectByVisibleText("Non-Destructive_Testing");
		
		WebElement fax = driver.findElement(By.id("fax"));
		fax.sendKeys("928889993334");
		
		
		WebElement submit = driver.findElement(By.id("submit"));
		
		submit.click();
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Data Inserted Successfully");
	}
	

}
