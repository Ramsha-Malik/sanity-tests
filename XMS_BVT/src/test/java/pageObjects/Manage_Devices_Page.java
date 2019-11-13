package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_Devices_Page {
	WebDriver wd;
	public Manage_Devices_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
	@FindBy(id="nav_devices")
	private WebElement devicesTab;
	public WebElement devices_Field()
	{
		 return devicesTab;
	}


}
