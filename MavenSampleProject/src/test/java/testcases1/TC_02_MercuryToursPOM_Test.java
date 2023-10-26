package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.RegisterPage;

public class TC_02_MercuryToursPOM_Test {
	WebDriver driver;
	LoginPage loginPage;
	RegisterPage registerPage;

	@Test
	public void login() {
		loginPage.enterUserName("invalid");
		loginPage.enterPassword("invalid");
		loginPage.clicksubmitButton();
		
	}

	@Test
	public void register() {
		registerPage.clickRegister();
		registerPage.enterFirstName("Basil");
		registerPage.enterLastName("kuriakose");
		registerPage.enterPhoneNumber("123456789");
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		registerPage = new RegisterPage(driver);

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
