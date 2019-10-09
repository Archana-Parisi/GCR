package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcaseintext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Prayag/Downloads/chromedriver1_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
         driver.findElement(By.linkText("Create account")).click();
         String urlText= driver.getCurrentUrl();
         if (urlText.contains("wikipedia.org")) {
        	 System.out.println("internal link verified");
         }
         else
        	 System.out.println("internal link error");
        driver.navigate().back();
        driver.findElement(By.linkText("www.seleniumhq.org")).click();
        urlText= driver.getCurrentUrl();
        if (!urlText.contains("wikipedia.org")) {
       	 System.out.println("external link verified");
        }
        else
       	 System.out.println("external link error");
        driver.close();
        
	}

}
