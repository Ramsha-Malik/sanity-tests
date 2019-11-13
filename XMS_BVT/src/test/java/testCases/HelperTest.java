package testCases;


import pageObjects.Configure_Policies_Page;
import pageObjects.LoginPageTest;
import pageObjects.MenuTabs;

import org.testng.annotations.BeforeSuite;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperTest {

  static WebDriver wd;
  static WebDriverWait wait;
  static MenuTabs menu;
  static Helper_Class_Test help;
  static Configure_Policies_Page policy;
  Random rd=new Random();
  @BeforeSuite(groups="launch browser")
  public void beforeSuite() {
	  System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	  wd = new FirefoxDriver();
	  wd.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	  wait=new WebDriverWait(wd,90);
	  menu=new MenuTabs(wd);
	  help=new Helper_Class_Test();
	  policy=new Configure_Policies_Page(wd);
	  wd.get("https://pxme.ebricks-inc.net:4443");
	  login_xms("administrator","password"); 
	  
	  
  }
  

  public void login_xms(String uname, String psw)
  {
	  LoginPageTest login;
	  login=new LoginPageTest(wd);
	  wait.until(ExpectedConditions.visibilityOf(login.uname_Field()));
      login.uname_Field().sendKeys(uname);
	  login.psw_Field().sendKeys(psw);
	  login.click_Field().click();
  }
  }
