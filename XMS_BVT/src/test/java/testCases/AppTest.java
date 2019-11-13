package testCases;

import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pageObjects.Configure_Apps_Page;

public class AppTest extends HelperTest {
	
	Configure_Apps_Page app;
	static String app_name;
	@Test (alwaysRun=true)
	public void add_app() throws InterruptedException, IOException
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(app.add_apps_Field()));
		Thread.sleep(10000);
		app.add_apps_Field().click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(app.add_enterprise_app()));
		app.add_enterprise_app().click();
		
		wait.until(ExpectedConditions.visibilityOf(app.enter_app_name()));
		app.enter_app_name().sendKeys(app_name);
		
		//scroll div down
		wait.until(ExpectedConditions.visibilityOf(app.get_left_panel()));
		app.get_left_panel().sendKeys(Keys.PAGE_DOWN);  
		
		wait.until(ExpectedConditions.elementToBeClickable(app.uncheck_ios()));
		
		app.uncheck_ios().click(); //uncheck ios
		app.uncheck_knox().click();
		app.uncheck_afw().click();
		app.uncheck_winphone().click();
		app.uncheck_wintab().click();
		app.uncheck_wince().click();
		
		app.click_android().click(); // click on android
		
		wait.until(ExpectedConditions.elementToBeClickable(app.upload_app()));
		app.upload_app().click();
		
		Runtime.getRuntime().exec("C:\\Users\\Ramsha\\Documents\\FileUpload.exe");
		
		wait.until(ExpectedConditions.elementToBeClickable(app.assign_dg()));
		Thread.sleep(5000);
		app.assign_dg().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(app.save_app()));
		app.save_app().click();
		
		Thread.sleep(5000);
		Assert.assertEquals(true,help.search_element(app_name));
		/*if(help.search_element(app_name)==true)
		  {
			  System.out.println("App Created");
			  
		  }
		  else
			  System.out.println("App Not Created");*/
	}
	@BeforeMethod(alwaysRun=true)
	public void before_method() throws InterruptedException
	{
		app_name="r_app"+rd.nextInt(100);
		 
	    app=new Configure_Apps_Page(wd);
		
	    Thread.sleep(4000);
	    wait.until(ExpectedConditions.elementToBeClickable(menu.config_Btn()));
		menu.config_Btn().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(policy.policies_Field()));
		policy.policies_Field().click();
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(app.click_app_tab()));
	    app.click_app_tab().click();
		  
		wd.navigate().refresh();
		
		
	}
}
