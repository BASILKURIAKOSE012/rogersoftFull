package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TC_02_LoginTest {
	
	WebDriver driver;
  @Test
  public void f() {
		driver.findElement(By.name("userName")).sendKeys("valid");
		driver.findElement(By.name("password")).sendKeys("valid");
		driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
