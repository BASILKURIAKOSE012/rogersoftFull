package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TC_01_ALL_AnnotationsTest {
  @Test
  public void sampleTest1() {
	  System.out.println("This is the default test1 method");
  }
  
  @Test
  public void sampleTest2() {
	  System.out.println("This is the default test 2 method");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is the method to be executed before every test methods");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is the method to be executed after every test methods");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is the method to be executed before all the test methods");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is the method to be executed after all the test methods");
  }

}
