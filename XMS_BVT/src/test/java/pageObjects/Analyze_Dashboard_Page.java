package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Analyze_Dashboard_Page {
	WebDriver wd;
	public Analyze_Dashboard_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}

    @FindBy(id="nav_dashboard")
    private WebElement dashboardTab;
    public WebElement dashboard_Field()
	{
		return dashboardTab;
	}
    


}
