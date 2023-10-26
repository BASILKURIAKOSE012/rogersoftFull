package testcases1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExcelTest {
	WebDriver driver;
	  @Test(dataProvider = "Credentials", dataProviderClass=ExcelRead.class)
	  public void getLogindata(String uname, String pwd) {
		  driver.get("https://demo.guru99.com/test/newtours/");
		  driver.findElement(By.name("userName")).sendKeys(uname);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.name("submit")).click();
	  }

	  
	  @BeforeTest
	  public void beforeTest() {
		  //System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("--remote-allow-origins=*");
		  WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();                 //WebDriver already declared.
			driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

}
