package sqa.sqa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TagName extends BaseDriver{

	@Test
	public void mytest1(){
		driver.get(baseUrl);
		String tagName;
		System.out.println("getting tag name");
		tagName = driver.findElement(By.xpath("//input[@id='username']")).getTagName();
		System.out.println(tagName);
		System.out.println("out of tag name");
	}	


}
