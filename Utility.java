package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility
{

static WebDriver driver;

public static WebDriver startUtility(String browserName, String url){
	
	if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "‪C:\\selenium softwares\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	
	else if(browserName.equalsIgnoreCase("chrome"))
	{
		driver= new ChromeDriver();
		
	}

driver.manage().window().maximize();
driver.get("url");

return driver;
}




	
	
}
