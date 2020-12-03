package freecrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.AccountPage;
import PageObject.HomePage;
import PageObject.LoginPage;

public class Testcasesfreecrm {
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	AccountPage ap;
	    @BeforeMethod
	    public void setUp() throws InterruptedException
	    {
	    	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.get("https://freecrm.co.in/index.html");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        Thread.sleep(1500);
	        hp=new HomePage(driver);
	        lp=new LoginPage(driver);
	        ap=new AccountPage(driver);
	        hp.getLoginbtn().click();
	       
	    }
	    @Test(priority=0)
	    public void loginfail() throws InterruptedException
	    {
	    lp.getEmail().sendKeys("");
	    Thread.sleep(1500);
	        lp.getPassword().sendKeys("");
	        lp.getLogbtn().click();
	        Thread.sleep(1500);
	   
	    }
	    @Test(priority=1)
	    public void loginfail2() throws InterruptedException
	    {
	       
	       lp.getEmail().sendKeys("abc123@gmail.com");
	        lp.getPassword().sendKeys("abcdefgh");
	        lp.getLogbtn().click();
	        Thread.sleep(1500);
	    }
	    @Test(priority=2)
	    public void loginSuccess() throws InterruptedException
	    {
	     
	    lp.getEmail().sendKeys("gdivya19599@gmail.com");
	        lp.getPassword().sendKeys("Divya195");
	        lp.getLogbtn().click();
	        Thread.sleep(1500);
	   
	    }
	    @Test(priority=2)
	    public void addContactfail() throws InterruptedException
	    {
	     
	    lp.getEmail().sendKeys("gdivya19599@gmail.com");
	        lp.getPassword().sendKeys("Divya195");
	        lp.getLogbtn().click();
	       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       // driver.navigate().refresh();
	        Thread.sleep(1500);
	        ap.getConclk().click();
	        driver.navigate().refresh();
	        Thread.sleep(1500);
	        ap.getConnewbtn().click();
	        Thread.sleep(1500);
	        driver.navigate().refresh();
	        ap.getFirstname().sendKeys("");
	        Thread.sleep(1500);
	       ap.getLastname().sendKeys("");
	        Thread.sleep(1500);
	       ap.getSavbtn().click();

	    }
	   
	    @Test(priority=2)
	    public void addContactsuccess() throws InterruptedException
	    {
	    lp.getEmail().sendKeys("gdivya19599@gmail.com");
	        lp.getPassword().sendKeys("Divya195");
	        lp.getLogbtn().click();
	     //   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       // driver.navigate().refresh();
	        Thread.sleep(1500);
	       
	        ap.getConclk().click();
	      //  driver.navigate().refresh();
	        Thread.sleep(1500);
	        ap.getConnewbtn().click();
	        Thread.sleep(1500);
	        driver.navigate().refresh();
	        ap.getFirstname().sendKeys("Divya");
	        Thread.sleep(1500);
	       ap.getLastname().sendKeys("Gattupalle");
	        Thread.sleep(1500);
	       ap.getSavbtn().click();

	    }
	    @Test(priority=2)
	    public void addDealfail() throws InterruptedException
	    {
	    lp.getEmail().sendKeys("gdivya19599@gmail.com");
	        lp.getPassword().sendKeys("Divya195");
	        lp.getLogbtn().click();
	        Thread.sleep(1500);
	       ap.getDealclk().click();
	       //driver.navigate().refresh();
	        ap.getDealnwbtn().click();
	        Thread.sleep(1500);
	       ap.getDealttl().sendKeys("");
	        ap.getSavbtn().click();
	        Thread.sleep(1500);
	 
	    }
	 
	    @Test(priority=2)
	    public void addDealsuccess() throws InterruptedException
	    {
	    lp.getEmail().sendKeys("gdivya19599@gmail.com");
	        lp.getPassword().sendKeys("Divya195");
	        lp.getLogbtn().click();
	        Thread.sleep(1500);
	       ap.getDealclk().click();
	     // driver.navigate().refresh();
	        ap.getDealnwbtn().click();
	        driver.navigate().refresh();
	        Thread.sleep(1500);
	       ap.getDealttl().sendKeys("Firstcontract");
	        ap.getSavbtn().click();
	        Thread.sleep(1500);
	   
	    }
	    @Test(priority=2)
	    public void addTaskfail() throws InterruptedException
	    {
	       
	    lp.getEmail().sendKeys("gdivya19599@gmail.com");
	        lp.getPassword().sendKeys("Divya195");
	        lp.getLogbtn().click();
	        //Thread.sleep(1500);
	        ap.getTaskclk().click();
	        Thread.sleep(1500);
	        //driver.navigate().refresh();
	        ap.getTasknwbtn().click();
	       // driver.navigate().refresh();
	        Thread.sleep(1500);
	       ap.getTaskttl().sendKeys("");
	       ap.getSavbtn().click();
	        Thread.sleep(1500);
	       
	   
	    }
	   
	    @Test(priority=2)
	    public void addTasksuccess() throws InterruptedException
	    {
	        lp.getEmail().sendKeys("gdivya19599@gmail.com");
	    lp.getPassword().sendKeys("Divya195");
	    lp.getLogbtn().click();
	    Thread.sleep(1500);
	    ap.getTaskclk().click();
	    driver.navigate().refresh();
	    ap.getTasknwbtn().click();
	    //driver.navigate().refresh();
	    Thread.sleep(1500);
	   ap.getTaskttl().sendKeys("Project");
	   ap.getDuedate().sendKeys("31/1/2021 18:00");
	   ap.getSavbtn().click();
	    Thread.sleep(1500);
	    }

	    @Test(priority=3)
	    public void viewCal() throws InterruptedException
	    {
	       
	    lp.getEmail().sendKeys("gdivya19599@gmail.com");
	    Thread.sleep(1500);
	        lp.getPassword().sendKeys("Divya195");
	        lp.getLogbtn().click();
	        Thread.sleep(1500);
	        ap.getCal().click();
	        Thread.sleep(1500);

	    }

	    @AfterMethod
	    public void tearDown()
	    {
	    driver.close();
	    }
	}


