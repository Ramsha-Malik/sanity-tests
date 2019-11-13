package testCases;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.Configure_DeliveryGroup_Page;


public class DGTabTest extends HelperTest {
  
	Configure_DeliveryGroup_Page dg;
	static String dg_name;
	@Test(groups="dg creation",alwaysRun=true)
	public void dg_creation() throws InterruptedException
	{
		  //click on add >> enter name >> then click on policies >> enter policy name and search
		  //get custom xpath of policy and drag and drop 
		  //click on summary >> save 
		  //check if DG is created successfully
		  wait.until(ExpectedConditions.elementToBeClickable(dg.add_dg_Field()));
		  dg.add_dg_Field().click();
		 
		  wait.until(ExpectedConditions.elementToBeClickable(dg.enter_dg_name()));
		  dg.enter_dg_name().sendKeys(dg_name);
		   
		  wait.until(ExpectedConditions.elementToBeClickable(dg.assign_policy()));
		  dg.assign_policy().click();
		  

		  wait.until(ExpectedConditions.elementToBeClickable(dg.enter_pol_name()));
		  dg.enter_pol_name().sendKeys(PolicyTest.pol_name+Keys.ENTER);
		  
		  Thread.sleep(2000);
		  dg.search_pol().click();
		 
		  String xpath_policy=help.get_policy_path(PolicyTest.pol_name);
		  if(xpath_policy!=null)
		  {
			  WebElement source=wd.findElement(By.xpath(xpath_policy));
			  WebElement dest=dg.drag_policy_to();
			  
			  Actions builder = new Actions(wd);
			  Action dragAndDrop = builder.clickAndHold(source).moveToElement(dest).release(dest).build();
			  dragAndDrop.perform();

		  }
	      wait.until(ExpectedConditions.elementToBeClickable(dg.click_summary()));
		  dg.click_summary().click();
		  
		  wait.until(ExpectedConditions.elementToBeClickable(dg.click_save()));
		  dg.click_save().click();
		  Assert.assertEquals(true,help.search_element(dg_name));
		  /*if(help.search_element(dg_name)==true)
		  {
			  System.out.println("DG Created");
			  
		  }
		  else
			  System.out.println("DG Not Created");*/
		  
		
	}
	@BeforeMethod(groups="dg creation",alwaysRun=true)
	public void before_method() throws InterruptedException
	{
		dg_name="r_dg"+rd.nextInt(100);
		dg=new Configure_DeliveryGroup_Page(wd);
		
	    wait.until(ExpectedConditions.elementToBeClickable(menu.config_Btn()));
	    menu.config_Btn().click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(policy.policies_Field()));
		policy.policies_Field().click();
		
		Thread.sleep(4000);
		
	    wait.until(ExpectedConditions.elementToBeClickable(dg.click_DG_Tab()));
	    dg.click_DG_Tab().click();
	    wd.navigate().refresh();
	
	    Thread.sleep(8000);

	}

}
