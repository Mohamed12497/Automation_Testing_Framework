package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignUpPage;

public class SignUpAndLoginTest extends TestBase{
	
	HomePage HomepageObject;
	SignUpPage signUpObject;
	LoginPage LoginPageObject;
	Faker fakeData = new Faker();
	
	@BeforeTest
	public void GenerateData(){
		
		HomepageObject = new HomePage(TestBase.driver);
		HomepageObject.openSignUpPage();
		signUpObject = new SignUpPage(driver);
		LoginPageObject = new LoginPage(driver);
		
		// Generating data using faker library
		
		signUpObject.setFirst_Name(fakeData.name().firstName());
		signUpObject.setLast_Name(fakeData.name().lastName());
		signUpObject.setpNumber(fakeData.phoneNumber().subscriberNumber(11));
		signUpObject.setEmail_address(signUpObject.getFirst_Name() + "@test.com");
		signUpObject.setPassword(signUpObject.getFirst_Name()+"@123");
		
		
	}
	
	@Test(priority = 1)
	public void Registration() {
		// Scroll down to find the element then removing disabled attribute from sign up button to avoid testing the recaptcha 
		WebElement signUpBtn = driver.findElement(By.xpath("//button[@id=\"button\" and @type=\"submit\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0, 250)");
		js.executeScript("arguments[0].removeAttribute('disabled');",signUpBtn);

		signUpObject.signUp(signUpObject.getFirst_Name(),signUpObject.getLast_Name(),signUpObject.getpNumber(),
				signUpObject.getEmail_address(),signUpObject.getPassword());

		
	}
	
	@Test(priority = 2)
	public void Login() throws InterruptedException {
		
		LoginPageObject.setEmail_address(signUpObject.getEmail_address().toString());
		LoginPageObject.setPassword(signUpObject.getPassword().toString());
		
		LoginPageObject.Login(signUpObject.getEmail_address(), signUpObject.getPassword());
		Thread.sleep(4000);
		//Name Assertion 
		Assert.assertEquals(driver.findElement(By.xpath("//strong[@style='text-transform:capitalize']")).getText(), signUpObject.getFirst_Name());
		
	}
	
}
