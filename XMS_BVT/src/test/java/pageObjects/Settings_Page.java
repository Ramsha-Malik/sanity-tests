package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings_Page {
	WebDriver wd;
	public Settings_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
	@FindBy(xpath=".//*[@id='advancedSettingsSec']/div[2]/ul[1]/li[2]/button")
	private WebElement notification_tab;
	public WebElement notification_tab_path()
	{
		 return notification_tab;
	}
	
	@FindBy(xpath=".//*[@id='settingMainCtr']/div/section[1]/div/div/a")
	private WebElement add_notification;
	public WebElement add_notification_field()
	{
		 return add_notification;
	}
	
	
	@FindBy(xpath=".//*[@id='addSmtp']")
	private WebElement smtp_server;
	public WebElement select_smtp_server()
	{
		 return smtp_server;
	}
	
	@FindBy(id="serverName")
	private WebElement server_name;
	public WebElement enter_smtp_name()
	{
		 return server_name;
	}
	
	@FindBy(xpath=".//*[@id='smtpHost']")
	private WebElement server_host;
	public WebElement enter_host_name()
	{
		 return server_host;
	}
	
	@FindBy(xpath=".//*[@id='smtpPort']")
	private WebElement server_port;
	public WebElement enter_server_port()
	{
		 return server_port;
	}
	
	
	@FindBy(xpath=".//*[@id='smtpFromName']")
	private WebElement name;
	public WebElement enter_name()
	{
		 return name;
	}
	
	
	@FindBy(xpath=".//*[@id='smtpFromEmail']")
	private WebElement email;
	public WebElement enter_email()
	{
		 return email;
	}
	
	
	@FindBy(xpath=".//*[@id='saveNsBtn']")
	private WebElement save_notification;
	public WebElement save_smtp_server()
	{
		 return save_notification;
	}

}
