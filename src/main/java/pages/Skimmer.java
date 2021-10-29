package pages;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Skimmer {

	WebDriver driver;
	public Skimmer(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="//input[@id='username']")
	WebElement username;
	
	@FindBy(id="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//body/div[@id='wrap']/div[1]/div[3]/form[1]/div[3]/div[1]/input[1]")
	WebElement SignIn;
	
	@FindBy(xpath="//h2[contains(text(),'DN')]")
	WebElement DN;
	
	@FindBy(xpath="//a[contains(text(),'File')]")
	WebElement File;
	
	@FindBy(xpath="//a[contains(text(),'Get Writer Job')]")
	WebElement WriterJob;
	
	@FindBy(id="//input[@id='bookmark']")
	WebElement Bookmark;
	
	@FindBy(id="//select[@id='bookmarks']")
	WebElement Select_Bookmarks;
	
	@FindBy(id="//input[@id='clear-bookmark']")
	WebElement Clear_Bookmarks;
	
	@FindBy(id="//input[@id='find-and-replace']")
	WebElement Find_and_Replace;
	
	@FindBy(id=" //input[@id='check-spelling']")
	WebElement Check_Spelling;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[1]/span[1]")
	WebElement Ticker;
	
	@FindBy(xpath="//button[@id='audio_start_time']")
	WebElement Conference_Start;
	
	@FindBy(xpath="//button[@id='audio_end_time']")
	WebElement Conference_End;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement Save;
	
	@FindBy(xpath="//a[@id='close-job-complete']")
	WebElement Close_Job_Complete;
	
	@FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]")
	WebElement text;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div")
	WebElement lasttext;
	
	@FindBy(xpath="//span[text()=' ***EOF***']")
	WebElement tex1;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div/span[530]")
	WebElement tex2;
	
	@FindBy(css = "#writer-bottom-textarea > span:nth-child(530)")
	WebElement tex3;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div/span[529]")
	WebElement tex4;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div")
	WebElement tex5;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[3]/div/div/div[3]/button[2]")
	WebElement popupok;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement save;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div/ul/li[1]/strong")
	WebElement eventid;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div/ul/li[3]/strong")
	WebElement ticker;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div/ul/li[2]/span/strong")
	WebElement writer;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div")
	WebElement blankspace;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/select")
	WebElement operator;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/select")
	WebElement operator1;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/select")
	WebElement operator2;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement participant;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div[2]/div/div[3]/form/div[2]/input")
	WebElement partcipantname;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div[3]/button[3]")
	WebElement partcipantadd;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div[3]/button[4]")
	WebElement partclose;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[5]/table/tbody/tr/td[14]/button[4]")
	WebElement cretpart;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[11]/div/div/div[2]/div/div/form/div[8]/select")
	WebElement cretpartdropdown;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[11]/div/div/div[2]/div/div/form/div[9]/button[1]")
	WebElement cretpartsubmit;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	WebElement closecreet;
	
	public void click_username(String un) {
		username.sendKeys(un);
		
	}
	
	public void click_password(String pass) {
		password.sendKeys(pass);
		
	}
	
	public void click_SignIn_link() {
		SignIn.click();
		
	}
	
	public void click_DN() {
		DN.click();
		
	}
	
	public void click_File() {
		File.click();
		
	}
	
	public void click_WriterJob() {
		WriterJob.click();
		
	}
	
	public void click_Bookmarks() {
		Bookmark.click();
		
	}
	
	public void click_Select_Bookmarks() {
		Select_Bookmarks.click();
		
	}
	
	public void click_Clear_Bookmarks() {
		Clear_Bookmarks.click();
		
	}
	
	public void click_Find_and_Replace() {
		Find_and_Replace.click();
		
	}
	
	public void click_Check_Spelling() {
		Check_Spelling.click();
		
	}
	
	public void display_Ticker() {
		//Ticker.isDisplayed();
	}
	
	public void Conference_Start() {
		Conference_Start.click();
		
	}
	
	public void textPresent() {
		String tex = text.getText();
		if(tex.isEmpty()) {
			System.out.println("text is not present");
		}
		else {
			System.out.println("text is present");
		}
	}
	
	public void pushTextToUpper() throws AWTException, InterruptedException {
		
//		tex1.click();
//		tex1.sendKeys(Keys.F8);
		//Actions actions = new Actions(driver);
		// and some variation of this:
		//actions.
		    
		//    .release()
		//    .perform();
		//tex1.click();
		//tex1.click();
		//tex1.sendKeys(Keys.F8);
//		actions
//	       .moveToElement(tex2)
//	        .perform();
		Thread.sleep(9000);
//		tex4.sendKeys(Keys.ENTER, Keys.F8);
//		actions.moveToElement(tex3);
//		actions.click().build().perform();
		//tex2.click();
		
		//actions.moveToElement(tex2).build().perform();
		// System.out.println(tex2.getText());
	//tex1.sendKeys(Keys.DOWN);
		
		Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_DOWN);
		for(int i=0;i<=61;i++) {
		robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_F8);
		
		

	}
	
//	public void click_Conference_End() {
//		Conference_End.click();
//		
//	}
//	
	public void matchEventid(String evtid) {
		if(eventid.getText().equalsIgnoreCase(evtid)) {
			System.out.println("event id matched");
		}
		else {
			System.out.println("event id not matched");
			System.exit(1);
		}
	}
	
	public void matchTicker(String tckid) {
		if(ticker.getText().equalsIgnoreCase(tckid)) {
			System.out.println("ticker matched");
		}
		else {
			System.out.println("ticker not matched");
			System.exit(1);
		}
	}
	
	public void matchpostion() {
		if(writer.getText().equalsIgnoreCase("Writer")) {
			System.out.println("succesfully reached in writer page");
		}
		else {
			System.out.println("failed");
			System.exit(1);
		}
	}
	
	
	public void click_Save() {
		Save.click();
		
	}
//	
	public void click_Close_Job_Complete() {
		Close_Job_Complete.click();
		
	}
	public void popupHandle() throws InterruptedException {
		Thread.sleep(1000);
		popupok.click();
	}
	public void pushText() {
		
		//lasttext.sendKeys(Keys.F8);
	}
	public void script() throws AWTException, InterruptedException {
		blankspace.click();
		blankspace.sendKeys("A letter is a written message conveyed from one person to another through a medium. The term usually excludes written material intended to be read in its original form by large numbers of people, such as newspapers and placards, although even these may include material in the form of an \"open letter\".");
		Thread.sleep(500);
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_F8);
		
		Select select = new Select(operator);
		select.selectByIndex(3);
		
		blankspace.sendKeys("helllo everyone this is robo 1A letter is a written message conveyed from one person to another through a medium. The term usually excludes written material intended to be read in its original form by large numbers of people, such as newspapers and placards, although even these may include material in the form of an \"open letter\".");
		
		
		robo.keyPress(KeyEvent.VK_F8);
		Thread.sleep(500);
		Select select1 = new Select(operator1);
		select1.selectByIndex(2);
		blankspace.sendKeys("bye everyone");
		Thread.sleep(500);
		robo.keyPress(KeyEvent.VK_F8);
		
//		participant.click();
//		partcipantname.sendKeys("panda");
//		
//		partcipantadd.click();
//		partclose.click();
		
//		Thread.sleep(200);
//		Select select2 = new Select(operator2);
//		select2.deselectByIndex(1);
//		operator.sendKeys("bye bye");
//		robo.keyPress(KeyEvent.VK_F8);
//		
		
	}
	
	public void cretpart() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;  
//		
//		js.executeScript("document.getElementByXpath('enter element id').click();");

		//or
		//js.executeScript("arguments[0].click();", okButton);
		cretpart.click();
		Thread.sleep(1000);
		
//		Actions action  = new Actions(driver);
//		action.moveToElement(cretpart).perform();
		Select select = new Select(cretpartdropdown);
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(300);
		cretpartsubmit.click();
		closecreet.click();
		
	}
}

