package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;



	public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="/html/head/title")
	@CacheLookup
	WebElement title;

	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	@CacheLookup
	WebElement loginbtn;

	public WebElement getTitle() {
	return title;
	}
	    public WebElement getLoginbtn() {
	return loginbtn;
	    }

	}


	
