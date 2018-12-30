package sqa.sqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends BaseDriver{

	@Test
    public void login() throws InterruptedException{
		driver.get(baseUrl);
		System.out.println("Entering test");
		WebElement user = driver.findElement(By.id("username"));
		System.out.println("User: ");
		System.out.println(user);
		user.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("123");
		System.out.println("Values entered");
		WebElement signin = driver.findElement(By.id("submit"));
		signin.click();

		Thread.sleep(1000);

		System.out.print("\n'SUCCESSFUL EXECUTION!!!");
    }
	
}
