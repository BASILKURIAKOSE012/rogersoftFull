package musafirpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookPage {
		WebDriver driver;
		By bookFlight = By.xpath("(//span[text()='Book'])[1]");
		
		
		public BookPage(WebDriver driver) {
			super();
			this.driver = driver;
		}


		public void clickBookFlight() {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.presenceOfElementLocated(bookFlight)).click();
		}
}
