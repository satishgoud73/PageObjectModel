package pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
 
	WebDriver driver;
	
	By username=By.id("emailField");
	By password=By.xpath(".//*[@id='passwordField']");
	By login=By.name("action-button");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeusername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void typepassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void clickonlogin()
	{
	
		driver.findElement(login).click();
	}
	
	
}

	

