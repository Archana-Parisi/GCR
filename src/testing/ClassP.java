package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ClassP {
	
	static WebDriver driver;
	
	  @BeforeTest
	  public void launchBrowser() {
		//  System.setProperty("webdriver.chrome.driver","C:/Users/Prayag/Downloads/chromedriver_win32/chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver", "C:/Users/Prayag/Downloads/chromedriver1_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  
	  @AfterTest
	  public void closeBrowser() {
		  driver.close();
	  }

}
