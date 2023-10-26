package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TC_06_CrossBrowserTest {
	WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.name("userName")).sendKeys("valid");
		driver.findElement(By.name("password")).sendKeys("valid");
		driver.findElement(By.name("submit")).click();
	}

	@Parameters({ "browser" })
	@BeforeTest
	public void browserSetup(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers\\\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		}

		driver.get("https://demo.guru99.com/test/newtours/");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
