package auto;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
  @Test(groups= {"smoke","regression"},priority = 3)
  public void f() {
	  
	  System.out.println("Test was called");
  }
  @Test(groups= {"smoke","regression"},priority = 1)
  public void m()
  {
	  System.out.println("Test2 was called");
  }
  @Test(groups= {"smoke"},priority = 2)
  public void n()
  {
	  System.out.println("Test3 was called");
  }
  @BeforeMethod
  public void beforeMethod() {
	 System.out.println("Before method was called");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method was called");
  }

}
