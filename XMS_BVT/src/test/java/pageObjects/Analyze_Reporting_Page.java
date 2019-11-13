package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Analyze_Reporting_Page {
	WebDriver wd;
	public Analyze_Reporting_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
    @FindBy(id="nav_reports")
    private WebElement reportsTab;
    public WebElement reports_Field()
	{
		return reportsTab;
	}


}
