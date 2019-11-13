package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_Enrollment_Page {
	WebDriver wd;
	public Manage_Enrollment_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
	@FindBy(id="nav_enrollment")
	private WebElement enrollmentTab;
	public WebElement enrollment_Field()
	{
		 return enrollmentTab;
	}

}
