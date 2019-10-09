package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	
	@Test (groups={"sanity","regression"},priority=1)
	public void launchBrowser() {
		
		  System.setProperty("webdriver.chrome.driver", "C:/Users/Prayag/Downloads/chromedriver1_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  
	  @Test (groups={"sanity","regression"},priority=5)
	  public void closeBrowser() {
		  driver.close();
	  }
	  
	 @Test  (groups={"sanity"},priority=2)
	  public void verifyGoogle(){
		  driver.get("https://www.google.com");
		  Assert.assertEquals(driver.getTitle(), "Google");
	  }
	  
	  @Test (groups={"regression"},priority=3)
	  public void verifyYahoo(){
		  driver.get("https://in.yahoo.com");
		  Assert.assertEquals(driver.getTitle(), "Yahoo India");
	  }
	  
	  @Test (groups={"regression"},priority=4)
	  public void verifyWikil(){
		  driver.get("https://www.wikipedia.org/");
		  Assert.assertEquals(driver.getTitle(), "Wikipedia");
	  }
	 
	  
}
