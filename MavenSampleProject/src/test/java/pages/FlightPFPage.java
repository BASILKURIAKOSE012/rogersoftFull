package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightPFPage {
	
	WebDriver driver;
	//By clickFlights = By.linkText("Flights");
	@FindBy(linkText ="Flights") WebElement clickFlights;
	//By tripType = By.xpath("(//input[@name='tripType'])[2]");
	@FindBy(xpath = "(//input[@name='tripType'])[2]") WebElement tripType;
	//By enterPassengerCount = By.xpath("//select[@name='passCount']");
	@FindBy(xpath="//select[@name='passCount']") WebElement PassengerCount;
	//By enterDepartingTown =  By.xpath("//select[@name='fromPort']");
	@FindBy(xpath="//select[@name='fromPort']") WebElement DepartingTown;
	@FindBy(xpath="//select[@name='fromMonth']") WebElement DepartingMonth;
	@FindBy(xpath="//select[@name='fromDay']") WebElement DepartingDay;
	@FindBy(xpath="//select[@name='toPort']") WebElement arrivingTown;
	@FindBy(xpath="//select[@name='toMonth']") WebElement arrivingMonth;
	@FindBy(xpath="//select[@name='toDay']") WebElement arrivingDay;
	@FindBy(xpath="(//input[@name='servClass'])[2]") WebElement serviceClass;
	@FindBy(xpath="//select[@name='airline']") WebElement airLine;
	@FindBy(xpath="//input[@name='findFlights']") WebElement continueButton;
	@FindBy(xpath="//div[@id='dismiss-button']") WebElement dismissButton;
	
	public void clickFlight() {
		clickFlights.click();
	}
	
	public void clicktriptype() {
		tripType.click();
	}
	public void enterpassengerCount(String pcount) {
		Select s1 = new Select(PassengerCount);
		s1.selectByVisibleText(pcount);
	}
	public void enterDeaprtingTown(String Dtown) {
		Select s2 = new Select(DepartingTown);
		s2.selectByVisibleText(Dtown);
	}
	public void enterDeaprtingMonth(String Dmonth) {
		Select s3 = new Select(DepartingMonth);
		s3.selectByVisibleText(Dmonth);
	}
	public void enterDeaprtingDay(String Dday) {
		Select s4 = new Select(DepartingDay);
		s4.selectByVisibleText(Dday);
	}
	public void enterArrivingTown(String Atown) {
		Select s5 = new Select(arrivingTown);
		s5.selectByVisibleText(Atown);
	}
	public void enterArrivingMonth(String Amonth) {
		Select s6 = new Select(arrivingMonth);
		s6.selectByVisibleText(Amonth);
	}
	public void enterArrivingDay(String Aday) {
		Select s7 = new Select(arrivingDay);
		s7.selectByVisibleText(Aday);
	}
	public void clickServiceClass() {
		serviceClass.click();
	}
	public void selectAirline(String airlines) {
		Select s8 = new Select(airLine);
		s8.selectByVisibleText(airlines);
	}
	public void clickContinue() {
		continueButton.click();
	}
	public void clickDismissButton() {
		dismissButton.click();
	}

	public FlightPFPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
