package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPFPage {
	WebDriver driver;
	//By register = By.linkText("REGISTER");
	@FindBy(linkText = "REGISTER") WebElement register;
	//By firstName = By.xpath("//input[@name='firstName']");
	@FindBy(xpath ="//input[@name='firstName']") WebElement firstName;
	//By lastName = By.xpath("//input[@name='lastName']");
	@FindBy(xpath ="//input[@name='lastName']") WebElement lastName;
	//By phoneNumber = By.xpath("//input[@name='phone']");
	@FindBy(xpath= "//input[@name='phone']" ) WebElement phoneNumber;
	// By username = By.xpath("//input[@name='userName']");
	@FindBy(xpath= "//input[@name='userName']") WebElement uname;
	// By address = By.xpath("//input[@name='address1']");
	@FindBy(xpath= "//input[@name='address1']" ) WebElement address;
	// By address = By.xpath("//input[@name='city']");
	@FindBy(xpath= "//input[@name='city']" ) WebElement city;
	// By address = By.xpath("//input[@name='state']");
	@FindBy(xpath= "//input[@name='state']" ) WebElement state;
	// By address = By.xpath("//input[@name='postalCode']");
	@FindBy(xpath= "//input[@name='postalCode']" ) WebElement postalCode;
	// By address = By.xpath("//input[@name='country']");
	@FindBy(xpath= "//select[@name='country']" ) WebElement country;
	// By address = By.xpath("//input[@name='email']");
	@FindBy(xpath= "//input[@name='email']" ) WebElement email;
	// By address = By.xpath("//input[@name='password']");
	@FindBy(xpath= "//input[@name='password']" ) WebElement password;
	// By address = By.xpath("//input[@name='confirmPassword']");
	@FindBy(xpath= "//input[@name='confirmPassword']" ) WebElement confirmPassword;
	// By address = By.xpath("//input[@name='submit']");
	@FindBy(xpath= "//input[@name='submit']" ) WebElement submit;
	
	public RegisterPFPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickRegister() {
		//driver.findElement(register).click();
		register.click();
	}

	public void enterFirstName(String fname) {
		//driver.findElement(firstName).sendKeys(fname);
		firstName.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		//driver.findElement(lastName).sendKeys(lname);
		lastName.sendKeys(lname);
	}

	public void enterPhoneNumber(String pnumber) {
		//driver.findElement(phoneNumber).sendKeys(pnumber);
		phoneNumber.sendKeys(pnumber);
	}
	
	public void enterUserName(String unmaes) {
		uname.sendKeys(unmaes);
	}
	public void enterAddress(String addrss) {
		address.sendKeys(addrss);
	}
	public void enterCity(String citi) {
		city.sendKeys(citi);
	}
	public void enterState(String states) {
		state.sendKeys(states);
	}
	public void enterPostalCode(String pincode) {
		postalCode.sendKeys(pincode);
	}
	public void enterCountry(String countri) {
		country.sendKeys(countri);
	}
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	public void enterPassword(String passwd) {
		password.sendKeys(passwd);
	}
	public void enterConfirmPassword(String cpasswd) {
		confirmPassword.sendKeys(cpasswd);
	}
	public void clickSubmit() {
		submit.click();
	}

}
