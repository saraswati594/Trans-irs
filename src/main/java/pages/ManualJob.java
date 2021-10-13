package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManualJob {
	
	WebDriver driver;
	public ManualJob(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//body/div[@id='wrap']/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement Manage;
	
	@FindBy(xpath="//body/div[@id='wrap']/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[7]/a[1]")
	WebElement JobScheduler;
	
	@FindBy(xpath="//span[contains(text(),'Add Job')]")
	WebElement AddJob;
	
	@FindBy(id="//input[@id='ticker']")
	WebElement Ticker;
	
	@FindBy(id="//input[@id='event_key']")
	WebElement EventKey;
	
	@FindBy(id="//input[@id='event_name']")
	WebElement EventName;
	
	@FindBy(id="//input[@id='event_datetime']")
	WebElement EventDate;
	
	@FindBy(id="//input[@id='job_datetime']")
	WebElement JobDate;
	
	@FindBy(id="//body/div[@id='wrap']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[10]/select[1]")
	WebElement TimeZone;
	
	@FindBy(id="//select[@id='at1_model']")
	WebElement AT1Model;
	
	@FindBy(id="//select[@id='event_type']")
	WebElement Type;
	
	@FindBy(id="//select[@id='level1_team_id']")
	WebElement SkTeam;
	
	@FindBy(id="//input[@id='exchange']")
	WebElement Exchange;
	
	@FindBy(id="//select[@id='year']")
	WebElement Year;
	
	@FindBy(id="//select[@id='category']")
	WebElement Category;
	
	@FindBy(id="//select[@id='period']")
	WebElement Period;
	
	@FindBy(id="//input[@id='company']")
	WebElement Company;
	
	@FindBy(id="//select[@id='stream_status']")
	WebElement StreamStatus;
	
	@FindBy(id="//select[@id='client']")
	WebElement Client;
	
	@FindBy(id="//button[@id='submit-btn']")
	WebElement Submit;
	
	public void click_Manage() {
	Manage.click();
	
	}
	
	public void click_JobScheduler() {
	JobScheduler.click();
	
	}
	
	public void click_AddJob() {
    AddJob.click();
    
	}
	
	public void click_Ticker(String un) {
	Ticker.sendKeys(un);
	
	}
	
	public void click_EventKey(String ek) {
	EventKey.sendKeys(ek);
	
	}
	
	public void click_EventName(String en) {
	EventName.sendKeys(en);
	
	}
	
	public void click_EventDate(String ed) {
	EventDate.sendKeys(ed);
	
	}
	
	public void click_JobDate(String jd) {
	JobDate.sendKeys(jd);
	
	}
	
	public void click_TimeZone() {
	
	}
	
	public void click_AT1Model() {
	
	}
	
	public void click_Type() {
		
	}
	
	public void click_SkTeam() {
		
	}
	
	public void click_Exchange(String ex) {
	Exchange.sendKeys(ex);
	
	}
	
	public void click_Year() {
	
	}
	
	public void click_Category() {
		
	}
	
	public void click_Period() {
		
	}
	
	public void click_Company(String cy) {
	Company.sendKeys(cy);
	
	}
	
	public void click_StreamStatus() {
	
	}
	
	public void click_Client() {
		
	}

}
