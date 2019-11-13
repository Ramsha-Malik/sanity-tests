package testCases;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Analyze_Dashboard_Page;
import pageObjects.Analyze_Reporting_Page;

public class AnalyzeTabTest extends HelperTest {
	  Analyze_Dashboard_Page dashboard;
	  Analyze_Reporting_Page reporting;
	  
	  @Test
	  public void click_user() {
		  menu.manageTab_Field().click();
		  dashboard.dashboard_Field().click();
	  }
	  @Test
	  public void click_devices() {
		  menu.manageTab_Field().click();
		  reporting.reports_Field().click();
	  }
	  
	  @BeforeClass
	  public void beforeClass()
	  {
		  
		  dashboard=new Analyze_Dashboard_Page(wd);
		  reporting=new Analyze_Reporting_Page(wd);
	  }

  
}
