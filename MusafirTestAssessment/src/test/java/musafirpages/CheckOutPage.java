package musafirpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
	WebDriver driver;
	

	By titleAdult1 = By.xpath("(//select[@data-value-rule='required'])[1]");
	By firstName = By.xpath("//input[@placeholder='First name']");
	By middleName = By.xpath("//input[@placeholder='Middle name (optional)']");
	By lastName = By.xpath("//input[@placeholder='Last name']");
	By emailId = By.xpath("//input[@placeholder='Email address']") ;
	By phoneNumber = By.xpath("//input[@placeholder='Phone number']");
	By continueButton = By.xpath("//a[@id='btnContinue']");

	public CheckOutPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void selectTitleAdult1(String titleNumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement titleAdultOne = wait.until(ExpectedConditions.presenceOfElementLocated(titleAdult1));
		Select titleAdultselect1 = new Select(titleAdultOne);
		titleAdultselect1.selectByValue(titleNumber);
	}


	public void enterAdultOneFirstName(String frstName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(firstName)).sendKeys(frstName);
		
	}

	public void enterAdultOneMiddleName(String scndName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(middleName)).sendKeys(scndName);
	}

	public void enterAdultOneLastName(String thrdName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(lastName)).sendKeys(thrdName);
	}
	
	public void enterEmailId(String emilId) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(emailId)).sendKeys(emilId);
	}
	public void enterPhoneNumber(String phonNumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(phoneNumber)).sendKeys(phonNumber);
	}
	public void clickContinue() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(continueButton)).click();
	}

}
