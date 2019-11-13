package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configure_Policies_Page {
	WebDriver wd;
	public Configure_Policies_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
	@FindBy(xpath="//*[@id=\"nav_policies\"]/a")
	private WebElement policiesTab;
	public WebElement policies_Field()
	{
		 return policiesTab;
	}
	
	@FindBy(xpath=".//*[@id='main']/section[1]/div/a[1]/span")
	private WebElement addpolicies;
	public WebElement add_policies_Field()
	{
		 return addpolicies;
	}
	
	@FindBy(xpath=".//*[@id='advancedPolicyDiv']/div[1]/ul/li/ul/li[2]/p")
	private WebElement policy_location;
	public WebElement add_policy_location()
	{
		 return policy_location;
	}
	
	@FindBy(name="name")
	private WebElement policy_name;
	public WebElement add_policy_name()
	{
		 return policy_name;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[5]/span[3]")
	private WebElement assign_policy;
	public WebElement assign_policy_path()
	{
		 return assign_policy;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[3]")
	private WebElement save_policy;
	public WebElement save_policy_path()
	{
		 return save_policy;
	}
	@FindBy(xpath=".//*[@id='main']/section[1]/div/a[3]/span")
	private WebElement del;
	public WebElement click_delete()
	{
		 return del;
	}
	@FindBy(xpath=".//*[@id='btn-delete']")
	private WebElement c_del;
	public WebElement confirm_delete()
	{
		 return c_del;
	}
	
	public String custom_path(String policy_name)
	{
		return "//input[@name='"+policy_name+"']/following-sibling::span";
		
	}



}
