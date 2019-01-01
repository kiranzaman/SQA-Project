package sqa.sqa;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTitle extends BaseDriver {
	
	@Test
	public void verifyHomePageTitle()
	{
		driver.get(baseUrl);
		System.out.println("Entering test");
		String expectedTitle = "Login ABC";
		String actualTitle = driver.getTitle();
		System.out.println(expectedTitle);
		System.out.println(actualTitle);
		System.out.println("Not entered");
		Assert.assertEquals(actualTitle,expectedTitle);
		System.out.println("Exiting test");
	}
}
