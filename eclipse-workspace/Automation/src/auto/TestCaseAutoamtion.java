package auto;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TestCaseAutoamtion {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://book.theautomatedtester.co.uk/");
	
	driver.findElement(By.xpath("//a[@href='/chapter1']")).click();
	WebElement radiobutton=  driver.findElement(By.id("radiobutton"));
	if(radiobutton.isSelected())
		radiobutton.click();
	else
		System.out.println("Radio Button is unchecked");
	
	WebElement dropdown =driver.findElement(By.id("selecttype"));
	Select select = new Select(dropdown);
	select.selectByIndex(2);
	
	if(driver.findElements(By.xpath("//div[contains(text(),'Assert that this text is on the page')]")) != null)
		System.out.println("Text is present on page");
	else
		System.out.println("Text is not present on page");
	
	  TakesScreenshot scrShot =((TakesScreenshot)driver);
	  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	  driver.findElement(By.xpath("//div[@class='multiplewindow']")).click();

	  Set<String> windowhandles =driver.getWindowHandles();
	  System.out.println(windowhandles.size());
	  Iterator<String> it= windowhandles.iterator();
	  while(it.hasNext())
	  {
		  driver.switchTo().window(it.next().toString());
		  System.out.println(driver.findElement(By.xpath("//p[@id=\"popuptext\"]")).getText());
	  }





	
	}
}
