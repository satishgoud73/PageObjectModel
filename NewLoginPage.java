package pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewLoginPage 
{
	
	WebDriver driver;
	
	public NewLoginPage(WebDriver driver)
	{
	
		this.driver=driver;
	}
@FindBy(id="emailField")
@CacheLookup
WebElement username;

@FindBy(how=How.ID,using="passwordField")
@CacheLookup
WebElement password;
	
@FindBy(how=How.XPATH,using=".//*[@id='submit-login-button']")
@CacheLookup
WebElement submit_button;

@FindBy(how=How.LINK_TEXT,using="Remember me")
@CacheLookup
WebElement remember_me_link;

public void login_wordpress(String uid, String pass)
{

	username.sendKeys(uid);
	password.sendKeys(pass);
	submit_button.click();
	
	
	
}
	
	
	
	
}
