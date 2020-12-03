package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement password;

	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	@CacheLookup
	WebElement logbtn;

	public WebElement getEmail() {
	return email;
	}
	public WebElement getPassword() {
	return password;
	}
	public WebElement getLogbtn() {
	return logbtn;
	}

	}


