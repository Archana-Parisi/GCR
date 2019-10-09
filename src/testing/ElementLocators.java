package testing;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {

	public static void main(String[] args) throws InterruptedException {
		//instantiate google chrome browser driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/Prayag/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.gmail.com/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	//using element locator by id
	//for using the element once or twice the below syntax can be used
	//	driver.findElement(By.id("identifierId")).sendKeys("prayathi.parisi");
		
//creating web element for using the element multiple times below syntax can be used
//		WebElement loginId=driver.findElement(By.id("identifierId"));
//		loginId.sendKeys("prayathi.parisi");

		//using element locator by name
//		String Uname = "prayathi.parisi";
//		driver.findElement(By.name("identifier")).sendKeys(Uname);

		//using element locator by classname
	//driver.findElement(By.className("gb_d")).click();
		
		//using element locator by tagname
	//	driver.findElement(By.tagName("input")).sendKeys("prayag.parisi");
		
		//using element locator by linkText
		//driver.findElement(By.linkText( "Gmail")).click();
		
		//using element locator by partial linkText
	    //driver.findElement(By.partialLinkText("Gma")).click();
	    
	    //using element locator by css selector 
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("mahesh.parisi");
		
		//using element locator by xpath
		//driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("amma n nanna");
		
	//	String titl= driver.getTitle();
	//    System.out.println(titl);
	//	String currentBrowser = driver.getCurrentUrl();
	//	System.out.println(currentBrowser);
	//	driver.navigate().to("https:/mail.yahoo.com");
	//	driver.navigate().back();
    //        driver.get("https:/www.google.com");
     //       driver.navigate().to("https://www.gcrit.com/build3/login");
    //        System.out.println(driver.getCurrentUrl()); 
     //       driver.get("https://gmail.com");
     //       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prayag.parisi");
            
     //       driver.navigate().back();
	//	    driver.navigate().forward();
	//	    driver.findElement(By.id("identifierId")).sendKeys("prayag.parisi");
	//	    System.out.println(driver.getCurrentUrl()); 
	//	    driver.navigate().refresh();
    /*        WebElement linkName = driver.findElement(By.linkText("create an account"));
            linkName.click();
            driver.findElement(By.name("newsletter")).click();
            Thread.sleep(3000);
            driver.findElement(By.name("newsletter")).click();      */
//            driver.findElement(By.name("email_address")).sendKeys("prayag");
//            Thread.sleep(3000);
//            driver.findElement(By.name("email_address")).clear();
//               boolean exLink=driver.findElement(By.linkText("Gmail")).isDisplayed();       
//               System.out.println(exLink);
//               driver.close();
//		boolean linkEnable =driver.findElement(By.linkText("Gmail")).isEnabled();
//		System.out.println(linkEnable);
//           driver.get("http://www.gcrit.com/build3/create_account.php");
//           WebElement chkStatus =driver.findElement(By.name("gender"));
//           boolean chk =chkStatus.isSelected();
//            System.out.println(chk);
//            Thread.sleep(3000);
//            chkStatus.click();
//             Thread.sleep(3000);
//             chk =chkStatus.isSelected();
//             System.out.println(chk);
       //      driver.close();
             
            System.out.println(driver.manage().window().getSize());
            
	}

}
