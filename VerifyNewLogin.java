package pomtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.Utility;
import pagemodel.NewLoginPage;

public class VerifyNewLogin 
{
	
 @Test
	public void checkValidUser()
    {
	
	WebDriver driver = Utility.startUtility("firefox", "https://www.wrike.com/login/");
	 
	NewLoginPage login_page= PageFactory.initElements(driver, NewLoginPage.class);
	
	//LoginPage login_page_old= PageFactory.initElements(driver, LoginPage.class);
	 
	 login_page.login_wordpress("satish.goud73@gmail.com", "satish.goud73");
	 
	 
	}
	
	
	
	
}
