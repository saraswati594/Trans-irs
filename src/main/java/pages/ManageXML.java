package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageXML {
	
	WebDriver driver;
	public ManageXML(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath=" //a[contains(text(),'File')]")
	WebElement File;
	
	@FindBy(xpath="//a[contains(text(),'Manage XML')]")
	WebElement ManageXML;
	
	@FindBy(id="//input[@id='from_date']")
    WebElement From_Date;
	
	@FindBy(id="//input[@id='to_date']")
	WebElement To_Date;
	
	@FindBy(id=" //select[@id='search_by']")
	WebElement Search_By;
	
	@FindBy(id="//input[@id='search_param']")
	WebElement Search_Box;
	
	@FindBy(id="//input[@id='load-events']")
	WebElement Load_Events;
	
	@FindBy(id="//span[@id='select2-eventIDSelect-container']")
	WebElement Event_ID;
	
	@FindBy(id="//select[@id='eventTypeSelect']")
	WebElement Type;
	
	@FindBy(id="//button[@id='loadButton']")
	WebElement Load_Button;
	
	@FindBy(id="//button[@id='loadXmlBtnFrmOtherEvent']")
	WebElement Copy;
	
	
	
	public void click_File() {
		File.click();
		
	}
	
	public void click_ManageXML() {
		ManageXML.click();
		
	}
	
	public void click_From_Date() {
		From_Date.click();
		
	}
	
	public void click_To_Date() {
		To_Date.click();
		
	}
	
	public void click_Search_by() {
		
	}
	
	public void click_Search_Box() {
		Search_Box.click();
		
	}
	
	public void click_Load_Events() {
		Load_Events.click();
		
	}
	
	public void click_Event_ID() {
		
	}
	
	public void click_Type() {
		
	}
	
	public void click_Load() {
		Load_Button.click();
		
	}
	
	public void click_Copy() {
		Copy.click();
		
	}
}
