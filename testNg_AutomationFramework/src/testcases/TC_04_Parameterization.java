package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_04_Parameterization {
	
	WebDriver driver;
	
	@Parameters({"uname","pswd"})
	@Test
	public void login(String usernmae , String password) {
		driver.findElement(By.name("userName")).sendKeys(usernmae);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
	@BeforeMethod
	public void loadingUrl() {
		driver.get("https://demo.guru99.com/test/newtours/");
	}
}
