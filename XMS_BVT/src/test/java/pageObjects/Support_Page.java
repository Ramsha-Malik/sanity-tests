package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Support_Page {
	WebDriver wd;
	public Support_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
	@FindBy(xpath=".//*[@id='SF_logsettings']")
	private WebElement log_settings;
	public WebElement goto_log_settings()
	{
		 return log_settings;
	}
	
	
	@FindBy(xpath=".//*[@id='LogLevelDiv']/h4/a/label/span")
	private WebElement log_level;
	public WebElement goto_log_level()
	{
		 return log_level;
	}
	
	@FindBy(xpath=".//*[@id='ChangeGlobalLogLevelBtn']")
	private WebElement e_log_level;
	public WebElement edit_log_level()
	{
		 return e_log_level;
	}
	
	@FindBy(xpath=".//*[@id='classDetails']/div[3]/div/div/button")
	private WebElement log_level_list_button;
	public WebElement set_log_level()
	{
		 return log_level_list_button;
	}
	
	@FindBy(id="loglevels")
	private WebElement log_level_list_id;
	public WebElement log_level_list_element()
	{
		 return log_level_list_id;
	}
	@FindBy(xpath=".//*[@id='classDetails']/div[3]/div/div/ul/li[5]/a")
	private WebElement list_populated;
	public WebElement debug_in_list()
	{
		 return list_populated;
	}
	
	@FindBy(id="btn-setloglevel")
	private WebElement save;
	public WebElement save_log_level()
	{
		 return save;
	}

}
