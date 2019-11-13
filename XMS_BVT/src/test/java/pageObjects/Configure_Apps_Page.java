package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configure_Apps_Page {
	WebDriver wd;
	public Configure_Apps_Page(WebDriver wd1)
	{
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	}
	@FindBy(xpath=".//*[@id='nav_apps']/a")
    private WebElement appsTab;
    public WebElement click_app_tab()
	{
		return appsTab;
	}
    @FindBy(xpath=".//*[@id='main']/section[1]/div/a[1]/span")
	private WebElement addapps;
	public WebElement add_apps_Field()
	{
		 return addapps;
	}
	@FindBy(id="appTypeEnterprise")
	private WebElement enterprise_app;
	public WebElement add_enterprise_app()
	{
		 return enterprise_app;
	}
	
	@FindBy(id="Capplicationlabel")
	private WebElement name;
	public WebElement enter_app_name()
	{
		 return name;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[3]/div/label/span")
	private WebElement ios;
	public WebElement uncheck_ios()
	{
		 return ios;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[4]/div")
	private WebElement android;
	public WebElement click_android()
	{
		 return android;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[1]/div/section/form/div/div/div/div[2]/label")
	private WebElement app;
	public WebElement upload_app()
	{
		 return app;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div")
	private WebElement left_panel;
	public WebElement get_left_panel()
	{
		 return left_panel;
	}
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[5]/div/label/span")
	private WebElement knox;
	public WebElement uncheck_knox()
	{
		 return knox;
	}
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[6]/div/label/span")
	private WebElement afw;
	public WebElement uncheck_afw()
	{
		 return afw;
	}
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[7]/div/label/span")
	private WebElement winphone;
	public WebElement uncheck_winphone()
	{
		 return winphone;
	}
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[8]/div/label/span")
	private WebElement wintab;
	public WebElement uncheck_wintab()
	{
		 return wintab;
	}
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[9]/div/label/span")
	private WebElement wince;
	public WebElement uncheck_wince()
	{
		 return wince;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[1]/div/div[11]")
	private WebElement dg_optional;
	public WebElement assign_dg()
	{
		 return dg_optional;
	}
	
	@FindBy(xpath=".//*[@id='mainBody']/div/section[2]/section[3]/button[3]")
	private WebElement save;
	public WebElement save_app()
	{
		 return save;
	}

}
