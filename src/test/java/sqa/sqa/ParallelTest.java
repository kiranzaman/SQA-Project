package sqa.sqa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class ParallelTest extends BaseDriver{
	

	@Test
	public void mytest1(){
		driver.get(baseUrl);
	    driver.findElement(By.id("clear")).click();
	    
	}	

}
