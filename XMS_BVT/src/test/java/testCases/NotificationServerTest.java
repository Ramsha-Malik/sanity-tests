package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Settings_Page;

public class NotificationServerTest extends HelperTest {
	
	Settings_Page settings_p;
	static String notification;
  @Test(alwaysRun=true)
  public void addnotificationserver() throws InterruptedException {
	  
	  wait.until(ExpectedConditions.elementToBeClickable(settings_p.notification_tab_path()));
	  settings_p.notification_tab_path().click();
	  
	  Thread.sleep(2000);
	  settings_p.add_notification_field().click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(settings_p.select_smtp_server()));
	  settings_p.select_smtp_server().click();
	  
	  wait.until(ExpectedConditions.visibilityOf(settings_p.enter_smtp_name()));
	  settings_p.enter_smtp_name().sendKeys(notification);
	  settings_p.enter_host_name().sendKeys("smtp");
	  ((JavascriptExecutor)wd).executeScript("scroll(0,400)");
	  
	  wait.until(ExpectedConditions.visibilityOf(settings_p.enter_server_port()));
	  settings_p.enter_server_port().sendKeys("453");
	  settings_p.enter_name().sendKeys("n1");
	  settings_p.enter_email().sendKeys("lhrqatest02@gmail.com");
	  settings_p.save_smtp_server().click();
	  
	  Thread.sleep(2000);
	  Assert.assertEquals(true,help.table_search(notification));
	 
  }
  @BeforeMethod(alwaysRun=true)
  public void before_method()
  {
	  notification="notify"+rd.nextInt(100);
	  settings_p=new Settings_Page(wd);
	  wait.until(ExpectedConditions.elementToBeClickable(menu.settingsTab_Field()));
	  menu.settingsTab_Field().click();
	  wd.navigate().refresh();
	  
  }
}
