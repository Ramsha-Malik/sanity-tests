package testCases;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Manage_Devices_Page;
import pageObjects.Manage_User_Page;

public class ManageTabTest extends HelperTest {
  
  Manage_User_Page users;
  Manage_Devices_Page devices;
  
  @Test
  public void click_user() {
	  menu.manageTab_Field().click();
	  users.user_Field().click();
  }
  @Test
  public void click_devices() {
	  menu.manageTab_Field().click();
	  devices.devices_Field().click();
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  
	  users=new Manage_User_Page(wd);
	  devices=new Manage_Devices_Page(wd);
  }
}
