package freecrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.AccountPage;
import PageObject.HomePage;
import PageObject.LoginPage;

public class Login {
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	AccountPage ap;
	@BeforeMethod
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	hp=new HomePage(driver);
	lp=new LoginPage(driver);
	ap=new AccountPage(driver);
	}
	@AfterMethod
	public void driverClose() {
	driver.quit();
	}
	@Test(dataProvider="user")
	public void loginSuccess(String email,String pass) throws InterruptedException
	{
	driver.get("https://freecrm.co.in/index.html");
	hp.getLoginbtn().click();
	lp.getEmail().sendKeys(email);
	lp.getPassword().sendKeys(pass);
	lp.getLogbtn().click();
	}
	@Test()
	public void loginFail(String email,String pass) throws InterruptedException
	{
	driver.get("https://freecrm.co.in/index.html");
	hp.getLoginbtn().click();
	lp.getEmail().sendKeys("");
	lp.getPassword().sendKeys("");
	lp.getLogbtn().click();
	}
	@DataProvider(name="user")
	public String[][] data() throws IOException
	{
	String[][] arrobj=getDataFormXLSX("testData.xlsx");
	return arrobj;
	}
	public String[][] getDataFormXLSX(String filename) throws IOException {
	// TODO Auto-generated method stub
	String[][] array=null;
	FileInputStream fs=new FileInputStream(filename);
	XSSFWorkbook wb=new XSSFWorkbook(fs);
	XSSFSheet sh=wb.getSheetAt(0);
	XSSFRow rows;
	XSSFCell cell;
	int rowCount=sh.getLastRowNum();
	int columnCount=sh.getRow(0).getLastCellNum();

	array=new String[rowCount][columnCount];
	for(int i=1;i<rowCount+1;i++)
	{
	for(int j=0;j<columnCount;j++)
	{
	rows=sh.getRow(i);
	cell=rows.getCell(j);
	array[i-1][j]=cell.getStringCellValue();

	}
	}
	return array;
	}
	}




