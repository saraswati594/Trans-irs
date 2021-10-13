package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LunchPage {

	WebDriver driver;
    public LunchPage(WebDriver driver) {
	  
	  PageFactory.initElements(driver, this);
  }
    
    @FindBy(xpath="//h2[contains(text(),'DN')]")
    WebElement DNdisplay;
    
    @FindBy(xpath="//h2[contains(text(),'Welcome to Dn')]")
    WebElement welcomeDn;
    
    @FindBy(xpath="//input[@id='from_date']")
    WebElement date;
    
    @FindBy(xpath="//select[@id='search_by']")
    WebElement searchby;
    
    @FindBy(xpath="//input[@id='search_param']")
    WebElement searchparam;
    
    @FindBy(xpath="//select[@id='time_zone']")
    WebElement timezone;
    
 	public void displayDN() {
		if(DNdisplay.isDisplayed()) {
			System.out.println("DN Process displaying");
		}
		else {
			System.out.println("DN Process not displaying");
		}
	}
	
 	public void clickDn() {
 		DNdisplay.click();
 	}
 	
 	public void welcomeDnDisplay() {
 		if(welcomeDn.isDisplayed()) {
 			System.out.println("succefully reached dn process");
 		}
 		else {
 			System.out.println("failed");
 		}
 	}
 	
 	public void enter_date(String eventdate) {
 		date.sendKeys("2021-10-12");
 	}
 	
 	public void enter_tickerorevent() {
		Select tiev = new Select(searchby);
// 		if(te.equalsIgnoreCase("Ticker")) {
// 			tiev.selectByIndex(1);
// 		}
// 		else if(te.equalsIgnoreCase("Event Id")) {
// 			tiev.selectByIndex(2);
// 		}
// 		else {
// 			System.out.println("please select search or ticker");
// 		}
		
		tiev.selectByIndex(2);
 	}
 	
 	public void enterEvent() {
 		searchparam.sendKeys("232323");
 		
 	}
 	public void enter_timezone() {
 		Select tizo = new Select(searchby);
 		tizo.selectByIndex(1);
 	}
}
