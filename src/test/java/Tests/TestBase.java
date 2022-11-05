package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import Pages.LoginPage;
import Pages.SignUpPage;

public class TestBase {

	public static WebDriver driver;
	
	
	
	
	@BeforeSuite
	public void startDriver() {
		// Using Chrome driver that is exist in project directory
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://phptravels.net/");
	}
	
}
