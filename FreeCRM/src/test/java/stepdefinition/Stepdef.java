package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import PageObject.AccountPage;
import PageObject.HomePage;
import PageObject.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	AccountPage ap;
	@AfterMethod
	public void tearDown()
	{
	driver.close();
	}
	@Given("^User loads the browser$")
	    public void user_loads_the_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://freecrm.co.in/index.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        hp=new HomePage(driver);
	        lp=new LoginPage(driver);
	        ap=new AccountPage(driver);
	       System.out.println("User loads the browser");
	    }

	    @Given("^User is in the Login Page of website$")
	    public void user_is_in_the_login_page_of_website() throws Throwable {
	    System.out.println("User is in the Login Page of website");
	    }

	    @Given("^User is in the Account Home Page$")
	    public void user_is_in_the_account_home_page() throws Throwable {
	    lp.getEmail().sendKeys("gdivya19599@gmail.com");
	        lp.getPassword().sendKeys("Divya195");
	        lp.getLogbtn().click();
	    System.out.println("User is in the Account Home Page");
	    }

	    @When("^User Navigates to Login Page$")
	    public void user_navigates_to_login_page() throws Throwable {
	    hp.getLoginbtn().click();
	    System.out.println("User Navigates to Login Page");
	    }

	    @When("^Enter valid email id (.+)$")
	    public void enter_valid_email_id(String email) throws Throwable {
	    lp.getEmail().sendKeys(email);;
	    System.out.println(email);
	    }

	    @When("^Enter invalid email id (.*)$")
	    public void enter_invalid_email_id(String email) throws Throwable {
	       lp.getEmail().sendKeys(email);;
	    System.out.println(email);
	    }
	    @When("^Clicking login button$")
	    public void clicking_login_button() throws Throwable {
	    lp.getLogbtn().click();
	    System.out.println("Clicks on login");
	    }

	    @When("^Clicks on Contact$")
	    public void clicks_on_contact() throws Throwable {
	    ap.getConclk().click();
	    System.out.println("Clicks on Contact");
	    }

	    @When("^Clicks on Deals$")
	    public void clicks_on_deals() throws Throwable {
	    ap.getDealclk().click();
	    System.out.println("Clicks on Deals");
	    }

	    @When("^Clicks on Tasks$")
	    public void clicks_on_tasks() throws Throwable {
	    ap.getTaskclk().click();
	    System.out.println("Clicks on Tasks");
	    }

	    @When("^Clicks on Calendar$")
	    public void clicks_on_calendar() throws Throwable {
	        ap.getCal().click();
	    System.out.println("Clicks on Calendar");
	    }

	    @Then("^Login Page is displayed$")
	    public void login_page_is_displayed() throws Throwable {
	    System.out.println("Login Page is displayed");
	    }

	    @Then("^Print Login successful$")
	    public void print_login_successful() throws Throwable {
	    System.out.println("Print Login successful");
	    }

	    @Then("^Print Login Unsuccessful$")
	    public void print_login_unsuccessful() throws Throwable {
	    System.out.println("Print Login Unsuccessful");
	    }

	    @Then("^New Contact is created$")
	    public void new_contact_is_created() throws Throwable {
	    System.out.println("New Contact is created");
	    }

	    @Then("^New Deal is created$")
	    public void new_deal_is_created() throws Throwable {
	    System.out.println("New Deal is created");
	    }

	    @Then("^New Task is created$")
	    public void new_task_is_created() throws Throwable {
	    System.out.println("New Task is created");
	    }

	    @Then("^Added successfully and can be viewed$")
	    public void added_successfully_and_can_be_viewed() throws Throwable {
	    System.out.println("Added successfully and can be viewed");
	    }
	    @Then("^New Contact is not created$")
	    public void new_contact_is_not_created() throws Throwable {
	    System.out.println("New Contact is not created");
	    }
	    @Then("^New Deal is not created$")
	    public void new_deal_is_not_created() throws Throwable {
	    System.out.println("New Deal is not created");
	    }
	   
	    @Then("^New Task is not created$")
	    public void new_task_is_not_created() throws Throwable {
	    System.out.println("New Task is not created");
	    }

	    @And("^Enter valid password (.+)$")
	    public void enter_valid_password(String pwd) throws Throwable {
	    lp.getPassword().sendKeys(pwd);;
	    System.out.println(pwd);
	    }

	    @And("^Click the Login button$")
	    public void click_the_login_button() throws Throwable {
	    lp.getLogbtn().click();
	    System.out.println("Click the Login button");
	    }

	    @And("^Enter invalid password(.*)$")
	    public void enter_invalid_password(String pwd) throws Throwable {
	    lp.getPassword().sendKeys(pwd);;
	    System.out.println(pwd);
	    }

	    @And("^Click on New button to add new contact$")
	    public void click_on_new_button_to_add_new_contact() throws Throwable {
	    ap.getConnewbtn().click();
	    driver.navigate().refresh();
	    System.out.println("Click on New button to add new contact");
	    }

	    @And("^Enter first name (.+)$")
	    public void enter_first_name(String fname) throws Throwable {
	    ap.getFirstname().sendKeys(fname);
	    System.out.println(fname);
	    }

	    @And("^Enter last name (.+)$")
	    public void enter_last_name(String lname) throws Throwable {
	    ap.getLastname().sendKeys(lname);
	    System.out.println(lname);
	    }

	    @And("^Click the Save button$")
	    public void click_the_save_button() throws Throwable {
	    ap.getSavbtn().click();
	    System.out.println("Click the Save button");
	    }

	    @And("^Click on New button to add new deal$")
	    public void click_on_new_button_to_add_new_deal() throws Throwable {
	    ap.getDealnwbtn().click();
	    driver.navigate().refresh();
	    System.out.println("Click on New button to add new deal");
	    }

	    @And("^Enter deal title (.+)$")
	    public void enter_deal_title(String dtitle) throws Throwable  {
	    ap.getDealttl().sendKeys(dtitle);
	    System.out.println(dtitle);
	    }
	   
	    @And("^Enter task title (.+)$")
	    public void enter_task_title(String ttitle) throws Throwable {
	    ap.getTaskttl().sendKeys(ttitle);
	    System.out.println(ttitle);
	    }

	    @And("^Click on New button to add new task$")
	    public void click_on_new_button_to_add_new_task() throws Throwable {
	    ap.getTasknwbtn().click();
	    driver.navigate().refresh();
	    System.out.println("Click on New button to add new task");
	    }

	    @And("^Enter due date (.+)$")
	    public void enter_due_date(String ddate) throws Throwable {
	    ap.getDuedate().sendKeys(ddate);;
	    System.out.println(ddate);
	    }

	    @And("^Verify the dates$")
	    public void verify_the_dates() throws Throwable {
	    System.out.println("Verify the dates");
	    }
	    @And("^Enter null task title (.*)$")
	    public void enter_null_task_title(String ttitle) throws Throwable {
	    System.out.println(ttitle);
	    }

	    @And("^Enter null due date (.*)$")
	    public void enter_null_due_date(String ddate) throws Throwable {
	    System.out.println(ddate);
	    }
	    @And("^Enter null deal title (.*)$")
	    public void enter_null_deal_title(String dtitle) throws Throwable {
	    System.out.println(dtitle);
	    }
	    @And("^Enter null first name (.*)$")
	    public void enter_null_first_name(String fname) throws Throwable {
	    System.out.println(fname);
	    }

	    @And("^Enter null last name (.*)$")
	    public void enter_null_last_name(String lname) throws Throwable {
	    System.out.println(lname);
	    }
	}
	


	