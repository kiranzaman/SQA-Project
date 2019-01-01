package sqa.sqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertDataLabelsTest extends BaseDriver{

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
	public void ButtonLabels ()
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
		System.out.println("Checking the labels: ");
		WebElement label1 = driver.findElement(By.id("label1"));
		System.out.println("Label getting");
		String label = label1.getText();
		System.out.println(label);
		Assert.assertEquals("Company",label);
		
		WebElement ele2 = driver.findElement(By.id("label2"));
		String label2 = ele2.getText();
		System.out.println(label2);
		Assert.assertEquals("Address",label2);
		
		WebElement ele3 = driver.findElement(By.id("label3"));
		String label3 = ele3.getText();
		System.out.println(label3);
		Assert.assertEquals("City",label3);
		
		WebElement ele4 = driver.findElement(By.id("label4"));
		String label4 = ele4.getText();
		System.out.println(label4);
		Assert.assertEquals("First_Name",label4);

		WebElement ele5 = driver.findElement(By.id("label5"));
		String label5 = ele5.getText();
		System.out.println(label5);
		Assert.assertEquals("Last_Name",label5);
		
		WebElement ele6 = driver.findElement(By.id("label6"));
		String label6 = ele6.getText();
		System.out.println(label6);
		Assert.assertEquals("Mobile_Number",label6);
		
		WebElement ele7 = driver.findElement(By.id("label7"));
		String label7 = ele7.getText();
		System.out.println(label7);
		Assert.assertEquals("Landline",label7);
		
		WebElement ele8 = driver.findElement(By.id("label8"));
		String label8 = ele8.getText();
		System.out.println(label8);
		Assert.assertEquals("Email",label8);
		
		WebElement ele9 = driver.findElement(By.id("label9"));
		String label9 = ele9.getText();
		System.out.println(label9);
		Assert.assertEquals("Sector",label9);
		
		WebElement ele10 = driver.findElement(By.id("label10"));
		String label10 = ele10.getText();
		System.out.println(label10);
		Assert.assertEquals("Lead_Source",label10);
		
		WebElement ele11 = driver.findElement(By.id("label11"));
		String label11 = ele11.getText();
		System.out.println(label11);
		Assert.assertEquals("Region",label11);
		
		WebElement ele12 = driver.findElement(By.id("label12"));
		String label12 = ele12.getText();
		System.out.println(label12);
		Assert.assertEquals("Product",label12);
		
		WebElement ele13 = driver.findElement(By.id("label13"));
		String label13 = ele13.getText();
		System.out.println(label13);
		Assert.assertEquals("Principal",label13);
		
		WebElement ele14 = driver.findElement(By.id("status"));
		String label14 = ele14.getText();
		System.out.println(label14);
		Assert.assertEquals("Status",label14);
		
		//WebElement ele15 = driver.findElement(By.id("probability"));
		//String label15 = label1.getText();
		//Assert.assertEquals("Product",label15);
		
		WebElement ele16 = driver.findElement(By.id("label16"));
		String label16 = ele16.getText();
		System.out.println(label16);
		Assert.assertEquals("Designation",label16);
		
		WebElement ele17 = driver.findElement(By.id("date"));
		String label17 = ele17.getText();
		System.out.println(label17);
		Assert.assertEquals("Date",label17);
		
		WebElement ele18 = driver.findElement(By.id("label18"));
		String label18 = ele18.getText();
		System.out.println(label18);
		Assert.assertEquals("Expected_Date",label18);
		
		WebElement ele19 = driver.findElement(By.id("label19"));
		String label19 = ele19.getText();
		System.out.println(label19);
		Assert.assertEquals("Services",label19);
		
		WebElement ele20 = driver.findElement(By.id("label20"));
		String label20 = ele20.getText();
		System.out.println(label20);
		
		Assert.assertEquals("Fax",label20);
		
		System.out.println("Correct labels ");
	}
	

}
