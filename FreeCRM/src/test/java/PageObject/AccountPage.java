package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;

	public AccountPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"main-nav\"]/a[3]")
	@CacheLookup
	WebElement contactclick;

	@FindBy(xpath="//a[@href='/contacts/new']/button")
	@CacheLookup
	WebElement contactnewbtn;

	@FindBy(xpath="//input[@name='first_name']")
	@CacheLookup
	WebElement firstname;

	@FindBy(xpath="//input[@name='last_name']")
	@CacheLookup
	WebElement lastname;

	@FindBy(xpath="//i[@class='save icon']")
	@CacheLookup
	WebElement savebtn;

	@FindBy(xpath="//a[@href='/deals']")
	@CacheLookup
	WebElement dealclick;

	@FindBy(xpath="//a[@href='/deals/new']/button")
	@CacheLookup
	WebElement dealnewbtn;

	@FindBy(xpath="//input[@name='title']")
	@CacheLookup
	WebElement dealtitle;

	@FindBy(xpath="//a[@href='/tasks']")
	@CacheLookup
	WebElement taskclick;

	@FindBy(xpath="//a[@href='/tasks/new']/button")
	@CacheLookup
	WebElement tasknewbtn;

	@FindBy(xpath="//input[@name='title']")
	@CacheLookup
	WebElement tasktitle;

	@FindBy(xpath="//a[@href='/calendar']")
	@CacheLookup
	WebElement calclick;

	@FindBy(xpath="//input[@class='calendarField']")
	@CacheLookup
	WebElement duedate;


	public WebElement getConclk() {
	return contactclick;
	}



	public WebElement getConnewbtn() {
	return contactnewbtn;
	}



	public WebElement getFirstname() {
	return firstname;
	}


	public WebElement getLastname() {
	return lastname;
	}



	public WebElement getSavbtn() {
	return savebtn;
	}



	public WebElement getDealclk() {
	return dealclick;
	}


	public WebElement getDealnwbtn() {
	return dealnewbtn;
	}



	public WebElement getDealttl() {
	return dealtitle;
	}



	public WebElement getTaskclk() {
	return taskclick;
	}

	public WebElement getDuedate() {
	return duedate;
	}



	public WebElement getTasknwbtn() {
	return tasknewbtn;
	}



	public WebElement getTaskttl() {
	return tasktitle;
	}



	public WebElement getCal() {
	return calclick;
	}



	

	}


