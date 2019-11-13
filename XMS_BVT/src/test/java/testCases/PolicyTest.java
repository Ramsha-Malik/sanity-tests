package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PolicyTest extends HelperTest{

  static String pol_name;
 // static private String pol_name;
  @Test(groups="policy creation")
  public void add_policy() throws InterruptedException {
	  
	  //click on add >> location >> enter name >> assignment >> save
	  wait.until(ExpectedConditions.elementToBeClickable(policy.add_policies_Field()));
	  policy.add_policies_Field().click();
	  
      Thread.sleep(2000);
	  wait.until(ExpectedConditions.elementToBeClickable(policy.add_policy_location()));
	  policy.add_policy_location().click();

	  wait.until(ExpectedConditions.visibilityOf(policy.add_policy_name()));
	  policy.add_policy_name().sendKeys(pol_name);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(policy.assign_policy_path()));
	  policy.assign_policy_path().click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(policy.save_policy_path()));
	  policy.save_policy_path().click();
	  
	  
	  //check if policy has been created successfully
	  Assert.assertEquals(true, help.search_element(pol_name));
	 /* if(help.search_element(pol_name)==true)
	  {
		  System.out.println("Policy Created");
		  
	  }
	  else
		  System.out.println("Policy Not Created");*/
	
  }
  @Test(groups="policy deletion")
  public void del_policy() throws InterruptedException
  {
	 
	  boolean pol_found=help.search_element(pol_name);
	  //first check if policy exists if its there find custom xpath of its checkbox ,click delete button and then click confirm delete
	  Assert.assertEquals(true, pol_found);
	  if(pol_found==true)
	  {
		  String xpath_checkbox=policy.custom_path(pol_name);
		  
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_checkbox)));
		  wd.findElement(By.xpath(xpath_checkbox)).click();
	     
	      wait.until(ExpectedConditions.elementToBeClickable(policy.click_delete()));
	      policy.click_delete().click();
	     
	      wait.until(ExpectedConditions.elementToBeClickable(policy.confirm_delete()));
	      policy.confirm_delete().click();
	      wd.navigate().refresh();
	      Assert.assertEquals(false, help.search_element(pol_name));
	      System.out.println("policy deleted");
	 
	  }
	  else

	      System.out.println("policy not found");
		  
	 
  }

  @BeforeMethod(groups= {"policy creation","policy deletion"},alwaysRun=true)
  public void before_method() throws InterruptedException
  {
	  //generate random policy name
	  //click on config>>policy>>refresh browser
	  wait.until(ExpectedConditions.elementToBeClickable(menu.config_Btn()));
	  menu.config_Btn().click();
	   

	  wait.until(ExpectedConditions.elementToBeClickable(policy.policies_Field()));
	  policy.policies_Field().click();
	  
	  wd.navigate().refresh();
	
	  Thread.sleep(5000);
  }
  @BeforeSuite(groups= {"policy creation"})
  public void before_suite()
  {
	  pol_name="r_loc"+rd.nextInt(100);
  }
}
