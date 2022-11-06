package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class Login extends TestBase{

	
	
@Test
public void LoginAAAA() throws InterruptedException {
	LoginPageObject = new LoginPage(driver);
	
		LoginPageObject.setEmail_address(signUpObject.getEmail_address().toString());
		LoginPageObject.setPassword(signUpObject.getPassword().toString());
		
		LoginPageObject.Login(signUpObject.getEmail_address(), signUpObject.getPassword());
		Thread.sleep(4000);
		//Name Assertion 
		Assert.assertEquals(driver.findElement(By.xpath("//strong[@style='text-transform:capitalize']")).getText(), signUpObject.getFirst_Name());
		
	}
}
