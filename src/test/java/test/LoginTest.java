package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPageClass;
import util.BrowserFactory;

public class LoginTest {

	@Test
	public void login(){
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
		LoginPageClass logintotechfios=PageFactory.initElements(driver,LoginPageClass.class);
		logintotechfios.Login("techfiosdemo@gmail.com", "abc123");
		driver.close();
		driver.quit();
		
	}
	

}

	

