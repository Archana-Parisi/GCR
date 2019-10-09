package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElements {

	public static void main(String[] args) {
		//instantiate browser driver
	 System.setProperty("webdriver.chrome.driver","C:/Users/Prayag/Downloads/chromedriver_win32/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com");
//	 driver.findElement(By.xpath("//*[@id='gbwa']/div[1]/a")).click();
//	driver.findElement(By.cssSelector("#gb36 > span.gb_k")).click();
//     driver.navigate().back();
     driver.findElement(By.xpath("//*[@id='gbwa']/div[1]/a")).click();   //opens inline arrangement
     driver.findElement(By.xpath("//*[@id='gbwa']/div[2]/a[1]")).click();  //clicks "more" tab
     driver.findElement(By.cssSelector("#gb30 > span.gb_k")).click();   //clicks blogger icon in the inline arrangement
	}

}
