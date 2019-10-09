package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//called by TestCase
public class LoginPage {
	WebDriver driver;
	By User = By.name("username");
	By Pwd = By.name("password");
	By loginButton = By.id("tdb1");
//create constructor which is similar to method in java. only one constructor per class and constructor name should be same as class name	
	public LoginPage(WebDriver driver1){
		this.driver = driver1;  //creating an instance of calling webdriver in this constructor
	}
	
//create user actions/customized commands
	public void typeUsername(String Uname){
		driver.findElement(User).sendKeys(Uname);
	}
	
//capture user name
	public void captureUsername(){
		driver.findElement(User).getAttribute("value");
	}
	
//clear the value
	public void clearUsername(){
		driver.findElement(User).clear();
	}
	
//type password
	public void typePassword(String Password){
		driver.findElement(Pwd).sendKeys(Password);
	}

//login
	public void clickLogin(){
		driver.findElement(loginButton).click();
	}
	 
}
