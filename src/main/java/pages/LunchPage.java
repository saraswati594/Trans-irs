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
    
    @FindBy(xpath="/html/body/div[1]/div[2]/div/div[5]/table/tbody/tr/td[3]")
    WebElement ticker;
    
    @FindBy(xpath="And user check the events are present or not")
    WebElement nodataavailble;
    
    @FindBy(xpath="//a[contains(text(),'10139')]")
    WebElement recording;
    
    
    @FindBy(xpath="//div[@id='custom-modal-body']//h3[@id='no-data-msg']")
    WebElement nodata;
    
    
    @FindBy(xpath="/html/body/div[1]/div[2]/div/div[5]/table/tbody/tr/td[5]/select")
    WebElement skimmer;

    @FindBy(xpath="/html/body/div[1]/div[2]/div/div[5]/table/tbody/tr/td[7]/select")
    WebElement editor;
    
    @FindBy(xpath="/html/body/div[1]/div[2]/div/div[5]/table/tbody/tr/td[8]/select")
    WebElement qc;
    
    @FindBy(xpath="/html/body/div[1]/div[2]/div/div[5]/table/tbody/tr/td[14]/button[2]/b")
    WebElement priority;
    
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
 	
// 	public void event_data_available() {
// 		if(nodataavailble.isDisplayed()) {
// 			System.exit(0);
// 		}
// 		else {
// 			System.out.println("Data is availble");
// 		}
// 		
// 	}
 	public void matchTicker(String tic) {
 		String match = ticker.getText();
 		System.out.println(match);
 		System.out.println(tic);
 		if(match.equalsIgnoreCase(tic)){
 			System.out.println("ticker matched");
 		}
 		else {
 			System.out.println("ticker is not matched");
 			System.exit(-1);
 		}
 	}
 	
 	public void data_availble() {
 		if(nodata.isDisplayed()) {
 			System.exit(0);
 		}
 		else {
 			System.out.println("data is availble");
 		}
 	}
 	
 	public void enterSkimmer(String skim) throws InterruptedException {
 		Select sel = new Select(skimmer);
 		sel.selectByValue(skim);
 		Thread.sleep(1000);
 	}
 	public void enterEditor(String ed) throws InterruptedException {
 		Select sel = new Select(editor);
 		sel.selectByValue(ed);
 		Thread.sleep(1000);
 	}
 	public void enterQc(String qc) throws InterruptedException {
 		Select sel = new Select(this.qc);
 		sel.selectByValue(qc);
 		Thread.sleep(1000);
 	}
 	public void enterPrority() {
 		priority.click();
 	}
}
