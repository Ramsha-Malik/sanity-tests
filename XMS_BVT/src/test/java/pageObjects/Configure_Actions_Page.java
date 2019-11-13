package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configure_Actions_Page {
	WebDriver wd;
	public Configure_Actions_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
    @FindBy(id="nav_actions")
    private WebElement actionsTab;
    public WebElement actions_Field()
	{
		return actionsTab;
	}

	


}
