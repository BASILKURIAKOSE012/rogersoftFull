package musafirtestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import musafirpages.BookPage;
import musafirpages.CheckOutPage;
import musafirpages.HomePage;
import musafirpages.PaymentPage;

public class TC_01_MusafirPOM_Test {

	WebDriver driver;
	HomePage homePage;
	BookPage bookPage;
	CheckOutPage checkOutPage;
	PaymentPage paymentPage;

	@Test(priority = 1)
	public void tripType() {
		homePage.clickTripType();

	}

	@Test(priority = 2)
	public void originCity() {

		homePage.enterOrginCity("Kochi, India (COK)");
	}

	@Test(priority = 3)
	public void destinationCity() {

		homePage.enterDestinationCity("Delhi, India (DEL)");
	}

	@Test(priority = 4)
	public void startDate() {
		homePage.enterStartDate("25/10/23");
	}

	@Test(priority = 5)
	public void adultNumber() {
		homePage.enterAdultNumber("1");
	}

	@Test(priority = 6)
	public void findFlights() throws InterruptedException {
		homePage.clickFlight();
	}

	@Test(priority = 7)
	public void bookFlight() {
		bookPage.clickBookFlight();
	}

	@Test(priority = 8)
	public void titleSelect() {
		checkOutPage.selectTitleAdult1("1");
	}

	@Test(priority = 9)
	public void firstName() {
		checkOutPage.enterAdultOneFirstName("basil");
	}

	@Test(priority = 10)
	public void middleName() {
		checkOutPage.enterAdultOneMiddleName("joseph");
	}

	@Test(priority = 11)
	public void lastName() {
		checkOutPage.enterAdultOneLastName("kuriakose");
	}

	@Test(priority = 12)
	public void emailId() {
		checkOutPage.enterEmailId("basilk012@gmail.com");
	}

	@Test(priority = 13)
	public void phoneNumber() {
		checkOutPage.enterPhoneNumber("1234567892");
	}

	@Test(priority = 14)
	public void continueButton() {
		checkOutPage.clickContinue();
	}

	@Test(priority = 15)
	public void Iframes() {
		paymentPage.switchToIframes();
	}

	@Test(priority = 16)
	public void creditCardNumber() {
		paymentPage.enterCreditCardNumber("1234123412341234");
	}

	@Test(priority = 17)
	public void creditCardName() {
		paymentPage.enterCreditCardName("basil");
	}

	@Test(priority = 18)
	public void creditCardExpiryYear() {
		paymentPage.enterCreditCardExpiryYear("2025");
	}

	@Test(priority = 19)
	public void creditCardExpiryMonth() {
		paymentPage.enterCreditCardExpiryMonth("10");
	}

	@Test(priority = 20)
	public void creditCardCvv() {
		paymentPage.enterCreditCardCVV("202");
	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		this.homePage = new HomePage(driver);
		this.bookPage = new BookPage(driver);
		this.checkOutPage = new CheckOutPage(driver);
		this.paymentPage = new PaymentPage(driver);
		driver.manage().window().maximize();
		driver.get("https://in.musafir.com/");
	}

	@AfterTest
	public void afterTest() {
//		driver.close();
	}

}
