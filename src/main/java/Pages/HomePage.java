package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//button[@id=\"ACCOUNT\"]")
	WebElement AccountLink;
	
	@FindBy(linkText = "Customer Signup")
	WebElement SignUpLink;
	
	public void openSignUpPage() {
		AccountLink.click();
		SignUpLink.click();
	}
}
