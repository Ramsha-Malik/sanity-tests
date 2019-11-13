package testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Support_Page;

public class LogsTest extends HelperTest {
	
	Support_Page support;
	@Test(alwaysRun=true)
	public void change_log_level() throws InterruptedException
	{

		System.out.println("LOGS1");
		//click log settings
		wait.until(ExpectedConditions.elementToBeClickable(support.goto_log_settings())); 
		support.goto_log_settings().click();
		
		//click log level
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.elementToBeClickable(support.goto_log_level())); 
		support.goto_log_level().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(support.edit_log_level())); 
		support.edit_log_level().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(support.set_log_level()));
		support.set_log_level().click();
	
		wait.until(ExpectedConditions.elementToBeClickable(support.debug_in_list()));
		support.debug_in_list().click();
		support.save_log_level().click();

	}
	@BeforeMethod(alwaysRun=true)
	public void before_method() throws InterruptedException
	{
		System.out.println("LOGS");
		support=new Support_Page(wd);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(menu.supportTab_Field())); 
		menu.supportTab_Field().click();
		wd.navigate().refresh();
		
	}

}
