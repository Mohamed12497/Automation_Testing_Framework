package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends PageBase{

	public SignUpPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	String first_Name;
	String last_Name;
	String pNumber;
	String email_address;
	String Password;
	
	@FindBy(name = "first_name")
	WebElement firstName;

	@FindBy(name = "last_name")
	WebElement lastName;
	
	@FindBy(name = "phone")
	WebElement phone;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(id="select2-account_type-container")
	WebElement dropdown;
	
	@FindBy(xpath = "//button[@id=\"button\" and @type=\"submit\"]")
	WebElement signUpBtn;
	
	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public void signUp(String fName,String lName,String pNo,String emailAddress,String pass) 
	{
		
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		phone.sendKeys(pNo);
		email.sendKeys(emailAddress);
		password.sendKeys(pass);
		signUpBtn.click();
		
	}
	
}
