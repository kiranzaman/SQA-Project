package sqa.sqa;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Main {
	
	public class ParallelTest extends BaseDriver{
		

		@Test
		public void mytest1(){
			driver.get(baseUrl);
		    LoginTitle l = new LoginTitle();
		    l.verifyHomePageTitle();
		}
		    
	
	}	


}
