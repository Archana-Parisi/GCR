package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyTitle {
	WebDriver driver;
	@Test
	public void verifyTitle() {
		System.setProperty("webdriver.chrome.driver","C:/Users/Prayag/Downloads/chromedriver1_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String Title =driver.getTitle();
	//	try {
		Assert.assertEquals(Title, "Yahoo");
	//	}
	//	catch(AssertionError e) {
	//	driver.close();
	//	}
		System.out.println("hi");
		System.out.println("hello");
		System.out.println("bye");
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}

}
