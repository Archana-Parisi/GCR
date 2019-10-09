package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class2 extends ClassP{
	
//	WebDriver driver;
	
/*	  @BeforeClass
	  public void launchBrowser() {
		//  System.setProperty("webdriver.chrome.driver","C:/Users/Prayag/Downloads/chromedriver_win32/chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver", "C:/Users/Prayag/Downloads/chromedriver1_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  
	  @AfterClass
	  void closeBrowser() {
		  driver.close();
	  }  */
	  
	  @Test (priority =3)
	  public void verifyWikil(){
		  driver.get("https://www.wikipedia.org/");
		  Assert.assertEquals(driver.getTitle(), "Wikipedia");
	  }
	 

}
