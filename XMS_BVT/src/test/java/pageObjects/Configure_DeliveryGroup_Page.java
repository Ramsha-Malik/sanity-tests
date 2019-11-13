package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configure_DeliveryGroup_Page {
	WebDriver wd;
	public Configure_DeliveryGroup_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
	@FindBy(xpath=".//*[@id='nav_deliveryGroups']/a")
	private WebElement deliveryGroupsTab;
	public WebElement click_DG_Tab()
	{
		 return deliveryGroupsTab;
	}
	@FindBy(xpath=".//*[@id='main']/section[1]/div/a[1]/span")
	private WebElement adddg;
	public WebElement add_dg_Field()
	{
		 return adddg;
	}
	@FindBy(id="roleName")
	private WebElement name;
	public WebElement enter_dg_name()
	{
		 return name;
	}
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[4]/div")
	private WebElement a_policy;
	public WebElement assign_policy()
	{
		 return a_policy;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div/div/div[1]/div/div[1]/form/div/div[1]/span/input")
	private WebElement p_name;
	public WebElement enter_pol_name()
	{
		 return p_name;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div/div/div[1]/div/div[1]/form/div/div[2]/button")
	private WebElement search;
	public WebElement search_pol()
	{
		 return search;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div/div/div[1]/div/div[2]/ul/li")
	private WebElement src;
	public WebElement drag_policy()
	{
		 return src;
	}
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/div/div/div[3]/div")
	private WebElement des;
	public WebElement drag_policy_to()
	{
		 return des;
	}
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[10]/span[4]")
	private WebElement summary;
	public WebElement click_summary()
	{
		 return summary;
	}
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[3]")
	private WebElement save;
	public WebElement click_save()
	{
		 return save;
	}
	
	
	
	
	
	



}
