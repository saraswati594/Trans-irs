package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ManageXML {
	
	WebDriver driver;
	public ManageXML(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[6]/div/button[3]")
	WebElement downlaod;
	
	@FindBy(xpath=" //a[contains(text(),'File')]")
	WebElement File;
	
	@FindBy(xpath="//a[contains(text(),'Manage XML')]")
	WebElement ManageXML;
	
	@FindBy(xpath="//input[@id='from_date']")
    WebElement From_Date;
	
	@FindBy(xpath="//input[@id='to_date']")
	WebElement To_Date;
	
	@FindBy(xpath=" //select[@id='search_by']")
	WebElement Search_By;
	
	@FindBy(xpath="//input[@id='search_param']")
	WebElement Search_Box;
	
	@FindBy(xpath="//input[@id='load-events']")
	WebElement Load_Events;
	
	@FindBy(xpath="//span[@id='select2-eventIDSelect-container']")
	WebElement Event_ID;
	
	@FindBy(xpath="//select[@id='eventTypeSelect']")
	WebElement Type;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div/form/div[2]/select")
	WebElement type2;
	
	@FindBy(xpath="//button[@id='loadButton']")
	WebElement Load_Button;
	
	@FindBy(xpath="//button[@id='loadXmlBtnFrmOtherEvent']")
	WebElement Copy;
	
	@FindBy(xpath="//button[@id='participants-manage-btn']")
	WebElement participent;
	
	@FindBy(xpath="//select[@id='bookmarks']")
	WebElement selectbookmark;
	
	@FindBy(xpath="//input[@id='clear-bookmark']")
	WebElement clearbookmark;
	
	@FindBy(xpath="//button[@id='findAndReplaceButton']")
	WebElement findandreplace;
	
	@FindBy(xpath="//button[@id='check-spelling']")
	WebElement checkspelling;
	
	@FindBy(xpath="//button[@id='presentationButton']")
	WebElement presentationButton;
	
	@FindBy(xpath="//button[@id='QAButton']")
	WebElement qanda;
	
	@FindBy(xpath="//button[@id='insertGreetingTag']")
	WebElement Greeting;
	
	@FindBy(xpath="//button[@id='insertFLTag']")
	WebElement forwardlookingstatements;
	
	@FindBy(xpath="//button[@id='insertExpandNumTag']")
	WebElement expandnumber;
	
	@FindBy(xpath="//button[@id='insertRankTag']")
	WebElement rank;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[3]/div/ul/li[1]/a")
	WebElement edit;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[3]/div/ul/li[2]/a")
	WebElement viewprintable;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[3]/div/ul/li[3]/a")
	WebElement viewxmldn;
	
	@FindBy(xpath="//body/div[@id='wrap']/div[2]/div[1]/div[4]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement xmlvisiable;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[4]/div/table/tbody/tr[1]/td[2]/div/div/input")
	WebElement periodanddate;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[4]/div/table/tbody/tr[2]/td[2]/select")
	WebElement industrycategory;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[6]/div/button[1]")
	WebElement recreate;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[6]/div/button[2]")
	WebElement upload;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[6]/div/button[3]")
	WebElement downloadxml; 
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[6]/div/button[4]")
	WebElement save;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[3]/div/table/tbody/tr[2]/td[2]")
	WebElement uploadticker;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[3]/div/table/tbody/tr[2]/td[4]")
	WebElement uploadstatus;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[4]/div[1]/div[1]/button")
	WebElement loadaudio;
	
	@FindBy(xpath="//body[1]/div[3]/div[2]/div[1]/div[4]/form[1]/fieldset[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement uploadrawxml;
	
	@FindBy(xpath="//body[1]/div[3]/div[2]/div[1]/div[4]/form[1]/fieldset[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")
	WebElement uploadcarrectedxml;
	 
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[3]/div/table/tbody/tr[2]/td[4]")
	WebElement status;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div/form/div[1]/span/span[1]/span/span[2]")
	WebElement clickeventid;
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	WebElement typeeventid;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/b/b/div[2]/div/div/div[3]/button[2]")
	WebElement aftersave;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/div[4]/div/table/tbody/tr[1]/td[2]/div/div/span/span")
	WebElement periodclick;;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/b/b/div[2]/div/div/div[3]/button[2]")
	WebElement xmlrowsave;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/b/b/div[2]/div/div/div[3]/button[2]")
	WebElement xmlcorrectedsave;
	
	
	@FindBy(xpath="/html/body/div[1]/div[2]/b/b/div[1]/div/div/div[3]/button[2]")
	
	WebElement save22;
	
	public void save2() {
		save22.click();
	}
	
	
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
		Select select = new Select(Search_By);
		select.selectByIndex(1);
	}
	
	public void click_Search_Box(String tick) {
		Search_Box.sendKeys(tick);
		
	}
	
	public void click_Load_Events() {
		Load_Events.click();
		
	}
	
	public void click_Event_ID(String ei) {
		clickeventid.click();
		typeeventid.sendKeys(ei);
	}
	
	public void click_Type() {
		Select select = new Select(Type);
		select.selectByIndex(1);
	}
	
	public void click_Type2() {
		Select select = new Select(type2);
		select.selectByValue("corrected");;
	}
	public void click_Load() {
		Load_Button.click();
		
	}
	
	public void click_Copy() {
		Copy.click();
		
	}
	
	public void clickxmlfile() {
		viewxmldn.click();
	}
	
	public void periodendate(String pd) {
		periodanddate.sendKeys(pd);
	}
	
	public void industrycata() {
		Select select = new Select(industrycategory);
				select.selectByIndex(4);
	}
	
	public void save() {
		save.click();
		aftersave.click();
	}
	
	public void xmlloadevent() {
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/table/tbody/tr/td[5]/input")).click();
	}
	
	public void upload() throws InterruptedException {
		upload.click();
		
	Thread.sleep(2000);
	Load_Button.click();
	}
	
	public void loadaudio() throws InterruptedException {
		loadaudio.click();
		Thread.sleep(8000);
	}
	
	public void uploadraw() {
		//uploadrawxml.click();
	}
	
	public void correctedxml() {
		//uploadcarrectedxml.click();
	}
	public void status() {
		if(status.getText().equalsIgnoreCase("COMPLTED")){
			System.out.println("succesfully upload");
		}
		else {
			System.out.println("upload failed");
		}
	}
	public void confirmxmlpage() {
		if(driver.getCurrentUrl().equalsIgnoreCase("https://sqa.trance.irs.digital-nirvana.com/process/dn/managexml")) {
			System.out.println("succesfully reached to managexml page");
		}
		else {
			System.out.println("failed to reach managexml page");
			System.exit(1);
		}
	}
	public void clcikperiod() {
		periodclick.click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/b/b/div[1]/div/div/div[3]/button[2]")).click();
	}
	
	public void xmlrowsave() {
		xmlrowsave.click();
	}
	
	public void xmlcorectsave() {
		xmlcorrectedsave.click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/b/b/div[1]/div/div/div[3]/button[2]")).click();
	}
	
	public void download() {
		downlaod.click();
	}
}
