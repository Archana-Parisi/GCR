package testing;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {
//calls LoginPage constructor
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Prayag/Downloads/chromedriver1_win32/chromedriver.exe");
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://www.gcrit.com/build3/admin");
		LoginPage login = new LoginPage(driver1);
		login.typeUsername("admin");
		login.typePassword("admin@123");
		login.clickLogin();
		String Url=driver1.getCurrentUrl();
		if(Url.contains("http://www.gcrit.com/build3/admin/index.php"))
			System.out.println("login succesful-passed");
		else
			System.out.println("login failed");
		Thread.sleep(3000);
		driver1.close();
		
		}
  
	}


