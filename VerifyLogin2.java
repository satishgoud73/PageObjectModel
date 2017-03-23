package pomtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pagemodel.LoginPage;

public class VerifyLogin2 

{

	@Test
	public void validlogin()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\selenium softwares\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.wrike.com/login/");
		
	LoginPage login=new LoginPage(driver);
	
	login.typeusername("satish.goud73@gmail.com");
	login.typepassword("satish.goud73");
	login.clickonlogin();
	
	driver.close();
	
	}
		
}
