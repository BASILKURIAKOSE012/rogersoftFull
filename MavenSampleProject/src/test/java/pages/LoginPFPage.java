package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPFPage {
	WebDriver driver;
	//By uname = By.name("userName");
	@FindBy(name="userName") WebElement uname;
	//By pswd = By.name("password");
	@FindBy(name ="password") WebElement pswd;
	//By submittButton = By.name("submit");
	@FindBy(name = "submit") WebElement submittButton;
	
	
	public LoginPFPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String user) {

		//driver.findElement(uname).sendKeys(user);
		uname.sendKeys(user);

	}

	public void enterPassword(String password) {
		//driver.findElement(pswd).sendKeys(password);
		pswd.sendKeys(password);
	}

	public void clicksubmitButton() {
		//driver.findElement(submittButton).click();
		submittButton.click();
	}
}
