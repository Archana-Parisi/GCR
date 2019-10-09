package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {

	public static void main(String[] args) {
		//instantiate google chrome browser driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/Prayag/Downloads/chromedriver_win32/chromedriver.exe");
		//create chrome browser driver
	WebDriver driver = new ChromeDriver();  //creating chrome driver in selenium webdriver interface
	driver.manage().window().maximize();  //maximise the browser window
	//navigate to google.com
	driver.get("http://google.com");
	}

}
