package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest {

	
	WebDriver wd;
	public LoginPageTest(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
	@FindBy(id="name")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="logonSubmitBtn")
	private WebElement click_button;
	
	@FindBy(xpath="html/body/div[4]/div/div[2]/div/div[1]/div/div[2]/article/section[2]/button[1]")
	private WebElement dismiss_btn;
	
	
	public WebElement uname_Field()
	{
		return username;
	}
	public WebElement psw_Field()
	{
		return password;
	}
	public WebElement click_Field()
	{
		return click_button;
	}
	public WebElement dismiss_Field()
	{
		return dismiss_btn;
	}

}
