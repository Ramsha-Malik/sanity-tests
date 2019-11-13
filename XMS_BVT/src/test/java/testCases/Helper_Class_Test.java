package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Helper_Class_Test extends HelperTest 
{
	
	
	public String  get_policy_path(String policy_name)
	{
		
		
		  wait.until(ExpectedConditions.elementToBeClickable(By.className("search-list-view")));  //wait till table becomes visible
	      WebElement div=wd.findElement(By.className("search-list-view"));
	      WebElement ul;
	      wait.until(ExpectedConditions.elementToBeClickable(By.tagName("ul")));  //wait till table becomes visible
	      ul=div.findElement(By.tagName("ul"));
	      List<WebElement> li;
	      li=ul.findElements(By.tagName("li"));
	      System.out.println(li.size());
		  
	      for(int i=0;i<li.size();i++)
		  {
	    	  System.out.println(li.get(i).getText());
			  
			  if(policy_name.equals(li.get(i).getText()))
			  {
				  String xpath="//li[text()='"+policy_name+"']";  //create custom xpath
				  System.out.println(xpath);
				  
				  return xpath;
				  
				  			  
			  }
		  }
	      return null;
	}
	
	public boolean search_element(String find_word) throws InterruptedException 
	{
		  
		  
	      wait.until(ExpectedConditions.visibilityOf(menu.search_tab()));
	      menu.search_tab().sendKeys(find_word);
	      Thread.sleep(2000);
	      wait.until(ExpectedConditions.visibilityOf(menu.click_search_icon()));
	      menu.click_search_icon().click();
	      
	      return table_search(find_word);
	      
	}
	public boolean table_search(String find_word) throws InterruptedException
	{
		  Thread.sleep(5000);
	      
		  wait.until(ExpectedConditions.elementToBeClickable(By.tagName("table")));  //wait till table becomes visible
	      WebElement table=wd.findElement(By.tagName("table"));
	      WebElement tablebody;
	      tablebody=table.findElement(By.tagName("tbody"));
	      List<WebElement> list_tablerows;
	      wait.until(ExpectedConditions.elementToBeClickable(By.tagName("tr")));  //wait till table becomes visible
	      list_tablerows=tablebody.findElements(By.tagName("tr"));
	      System.out.println(list_tablerows.size());
	      List<WebElement> list_tabledata;
	      for ( int i=0;i<list_tablerows.size();i++)
	      {
	          list_tabledata=list_tablerows.get(i).findElements(By.tagName("td"));
	          for(int j=0;j<list_tabledata.size();j++)
	          {
	              if(find_word.equals(list_tabledata.get(j).getText()))
	              {
	                  return true;
	              }
	          }
	      }
	      return false;

	}
}
