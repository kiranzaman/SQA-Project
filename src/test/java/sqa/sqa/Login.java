package sqa.sqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public void login(WebDriver driver) throws InterruptedException {
		System.out.println("Entering test");
		WebElement user = driver.findElement(By.id("username"));
		System.out.println("User: ");
		System.out.println(user);
		user.sendKeys("admin");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("123");
		Thread.sleep(2000);
		System.out.println("Values entered");
		WebElement signin = driver.findElement(By.id("submit"));
		signin.click();
		Thread.sleep(50);
	}
}
