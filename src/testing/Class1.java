package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 extends ClassP{
	
  
  @Test  (priority=1)
  public void verifyGoogle(){
	  driver.get("https://www.google.com");
	  Assert.assertEquals(driver.getTitle(), "Google");
  }
  
  @Test  (priority=2)
  public void verifyYahoo(){
	  driver.get("https://in.yahoo.com");
	  Assert.assertEquals(driver.getTitle(), "Yahoo India");
  }
  
}
