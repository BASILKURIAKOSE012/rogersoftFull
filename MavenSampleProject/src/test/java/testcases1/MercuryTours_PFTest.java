package testcases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.FlightPFPage;
import pages.FlightPage;
import pages.LoginPFPage;
import pages.LoginPage;
import pages.RegisterPFPage;
import pages.RegisterPage;

public class MercuryTours_PFTest {
	WebDriver driver;
	// LoginPage loginPage;
	LoginPFPage loginPage;
	// RegisterPage registerPage;
	RegisterPFPage registerPage;

	FlightPFPage flightPage;

	@Test(priority = 1)
	public void login() {
		loginPage.enterUserName("invalid");
		loginPage.enterPassword("invalid");
		loginPage.clicksubmitButton();

	}

	@Test(priority = 2)
	public void register() {
		registerPage.clickRegister();
		registerPage.enterFirstName("Basil");
		registerPage.enterLastName("kuriakose");
		registerPage.enterPhoneNumber("123456789");
		registerPage.enterUserName("basil");
		registerPage.enterAddress("aluva");
		registerPage.enterCity("kochi");
		registerPage.enterCountry("INDIA");
		registerPage.enterState("kerala");
		registerPage.enterEmail("123@gmail.com");
		registerPage.enterPassword("valid");
		registerPage.enterConfirmPassword("valid");
		registerPage.enterPostalCode("123456");
		registerPage.clickSubmit();
	}

	@Test(priority = 3)
	public void flight() {
		flightPage.clickFlight();
		//flightPage.clickDismissButton();
		flightPage.clicktriptype();
		flightPage.enterpassengerCount("2");
		flightPage.enterDeaprtingTown("Paris");
		flightPage.enterDeaprtingMonth("October");
		flightPage.enterDeaprtingDay("10");
		flightPage.enterArrivingTown("Paris");
		flightPage.enterArrivingMonth("October");
		flightPage.enterArrivingDay("17");
		flightPage.clickServiceClass();
		flightPage.selectAirline("Blue Skies Airlines");
		flightPage.clickContinue();

	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// loginPage = new LoginPage(driver);
		loginPage = new LoginPFPage(driver);
		registerPage = new RegisterPFPage(driver);
		flightPage = new FlightPFPage(driver);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours");
	}

	@AfterTest
	public void afterTest() {
//		driver.close();
	}
}