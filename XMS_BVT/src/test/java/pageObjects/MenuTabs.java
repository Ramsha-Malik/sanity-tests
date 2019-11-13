package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuTabs {

	 WebDriver wd;

	 public MenuTabs(WebDriver wd1)
	 {
		this.wd=wd1;
		PageFactory.initElements(wd, this);
	 }
	 @FindBy(id="nav_analyze")
	 private WebElement analyzeTab;
	 
	 public WebElement analyzeTab_Field()
	 {
		 return analyzeTab;
	 }
	 @FindBy(id="nav_manage")
	 private WebElement manageTab;
	 public WebElement manageTab_Field()
	 {
		 return manageTab;
	 }
	 
	 @FindBy(css="#nav_configure")
     WebElement manage_btn;
	 public WebElement config_Btn()
	 {
			return manage_btn;
	 }
	 @FindBy(xpath=".//*[@id='nav_settings']/a")
	 private WebElement settingsTab;
	 public WebElement settingsTab_Field()
	 {
		 return settingsTab;
	 }
	 
	 @FindBy(xpath=".//*[@id='nav_support']/a")
	 private WebElement supportTab;
	 public WebElement supportTab_Field()
	 {
		 return supportTab;
	 }
	 
	 @FindBy(xpath=".//*[@id='topNav']/div/div[2]/ul[2]/li[3]/a")
	 private WebElement username_icon;
	 public WebElement username_icon_Field()
	 {
		 return username_icon;
	 }
	 
	 @FindBy(id="logOut")
	 private WebElement logOut;	
	 public WebElement logOut_Field()
	 {
		 return logOut;
	 }
	 @FindBy(id="filterSearch")
	 private WebElement word;	
	 public WebElement search_tab()
	 {
		 return word;
	 }
	 
	 @FindBy(xpath=".//*[@id='searchContainer']/div/span")
	 private WebElement search_icon;	
	 public WebElement click_search_icon()
	 {
		 return search_icon;
	 }

}
