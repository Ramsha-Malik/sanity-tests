package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_User_Page {
	WebDriver wd;
	public Manage_User_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
	@FindBy(id="nav_users")
	private WebElement usersTab;
	public WebElement user_Field()
	{
		 return usersTab;
	}

}
