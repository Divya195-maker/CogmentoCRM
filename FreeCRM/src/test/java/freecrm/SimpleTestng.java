package freecrm;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class SimpleTestng {
	WebDriver driver;
    @BeforeMethod
    public void before() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
       
    }
  
    @Test(priority=0)
    public void loginfail() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
   
    }
    
    @Test(priority=1)
    public void loginfail2() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcdefgh");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
   
    }
    @Test(priority=2)
    public void loginSuccess() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gdivya19599@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Divya195");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
   
    }
    @Test
    public void addContactfail() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gdivya19599@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Divya195");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]")).click();
        driver.findElement(By.xpath("//a[@href='/contacts/new']/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='save icon']")).click();

   
    }
   
    @Test
    public void addContactsuccess() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gdivya19599@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Divya195");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]")).click();
        driver.findElement(By.xpath("//a[@href='/contacts/new']/button")).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Divya");
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Gattupalle");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//i[@class='save icon']")).click();

   
    }
    @Test
    public void addDealfail() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gdivya19599@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Divya195");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/deals']")).click();
        driver.findElement(By.xpath("//a[@href='/deals/new']/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("");
        driver.findElement(By.xpath("//i[@class='save icon']")).click();
        Thread.sleep(2000);
       
   
    }
   
    @Test
    public void addDealsuccess() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gdivya19599@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Divya195");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/deals']")).click();
        driver.findElement(By.xpath("//a[@href='/deals/new']/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("FirstContract");
        driver.findElement(By.xpath("//i[@class='save icon']")).click();
        Thread.sleep(2000);
       
   
    }
    @Test
    public void addTaskfail() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gdivya19599@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Divya195");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/tasks']")).click();
        driver.findElement(By.xpath("//a[@href='/tasks/new']/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("");
        driver.findElement(By.xpath("//i[@class='save icon']")).click();
        Thread.sleep(2000);
       
   
    }
   
    @Test
    public void addTasksuccess() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gdivya19599@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Divya195");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/tasks']")).click();
        driver.findElement(By.xpath("//a[@href='/tasks/new']/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='title']")).sendKeys("project");
        driver.findElement(By.xpath("//i[@class='save icon']")).click();
        Thread.sleep(2000);
   
    }

    @Test
    public void viewCal() throws InterruptedException
    {
        driver.get("https://freecrm.co.in/index.html");
        driver.manage().window().maximize();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
        //Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gdivya19599@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Divya195");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/calendar']")).click();
        Thread.sleep(2000);
       
   
    }
    @AfterMethod
    public void tearDown()
    {
    driver.close();
    }
}


