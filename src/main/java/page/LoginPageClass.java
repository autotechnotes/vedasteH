package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageClass {
	WebDriver driver;

	public LoginPageClass(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "username")
	WebElement Email;

	@FindBy(how = How.ID, using = "password")
	WebElement password;

	@FindBy(how = How.NAME, using = "login")
	WebElement siginButton;

	public void Login(String username, String password1) {
		Email.sendKeys(username);
		password.sendKeys(password1);
		siginButton.click();

	}
}
