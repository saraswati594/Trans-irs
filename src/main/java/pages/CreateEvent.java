package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.DownAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class CreateEvent {
	WebDriver driver;

	public CreateEvent(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[contains(text(),'Welcome to Event Calendaring System')]\r\n")
	WebElement welcome;

	@FindBy(xpath = "//a[contains(text(),'Add Event')]")
	WebElement addevent;

	@FindBy(xpath="//tbody//tr//th//h3")
	WebElement displaynewEvent;
	
	@FindBy(xpath = "//select[@id='selEvent']")
	WebElement chooseeventtype;

	@FindBy(xpath = "//input[@id='searchTerm']")
	WebElement entercompanyname;

	@FindBy(xpath = "//input[@id='dtcall']")
	WebElement dateandtime;

	@FindBy(xpath = "//select[@id='dtime']")
	WebElement choosetimedetail;

	@FindBy(xpath = "//select[@id='selZone']")
	WebElement timezone;

	@FindBy(xpath = "//select[@id='selFisPeriod']")
	WebElement choosefinquarter;

	@FindBy(xpath = "//select[@id='selFisYear']")
	WebElement choosefinyear;

	@FindBy(xpath = "//input[@id='manual_source_url']")
	WebElement sourceurl;

	@FindBy(xpath = "//input[@id='periodEndDate']")
	WebElement quarterenddate;

	@FindBy(xpath = "//input[@id='txtSubTit']")
	WebElement subtitle;

	@FindBy(xpath = "//input[@id='txtLiveUsPhone']")
	WebElement livephoneus;

	@FindBy(xpath = "//input[@id='txtLivePassUs']")
	WebElement livepasscodeus;

	@FindBy(xpath = "//input[@id='txtLivePhInt']")
	WebElement livephone;

	@FindBy(xpath = "//input[@id='txtLivePassInt']")
	WebElement livepasscode;

	@FindBy(xpath = "//input[@id='txtReplayPhUs']")
	WebElement replayphoneus;

	@FindBy(xpath = "//input[@id='txtReplayPasUs']")
	WebElement replaypasscodeus;

	@FindBy(xpath = "//input[@id='txtReplayPhInt']")
	WebElement replayphone;

	@FindBy(xpath = "//input[@id='txtReplayPasInt']")
	WebElement replaypasscode;

	@FindBy(xpath = "//input[@id='txtRegPh']")
	WebElement registrationphone;

	@FindBy(xpath = "//input[@id='txtRegPas']")
	WebElement registationpasscode;

	@FindBy(xpath = "//input[@id='txtLiveWebUrl']")
	WebElement livewebcast;

	@FindBy(xpath = "//input[@id='txtReplayWebUrl']")
	WebElement replaywebcast;

	@FindBy(xpath = "//input[@id='txtSlideUrl']")
	WebElement slidesurl;

	@FindBy(xpath = "//input[@id='sbtnSave']")
	WebElement send;

	@FindBy(xpath="//button[contains(text(),'Done')]")
	WebElement done;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td[2]/a")
	WebElement last;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/a[6]")
	WebElement logout;
	public void clickEvent() {
		addevent.click();
	}

	public void enterEventType() {
		Select selectType = new Select(chooseeventtype);
		selectType.selectByIndex(4);
	}

//	public void verifyWelcome() {
//		
//	}
	public void clickDone() {
		done.click();
	}
	

//	public void enterCompanyName(String cname)   {
//	
//entercompanyname.sendKeys(cname);
//
//
//
//WebElement all = driver.findElement(By.xpath("//tbody/tr[5]/td[1]/div[1]/table[1]"));
//all.sendKeys(Keys.ARROW_DOWN);
//all.sendKeys(Keys.ENTER);
//List<WebElement> list = driver.findElements(By.xpath("//tbody/tr[5]/td[1]/div[1]/table[1]"));
//
//System.out.println("Auto Suggest List ::" + list.size());
//
//for(int i = 0 ;i< list.size();i++)
//{
//	System.out.println(list.get(i).getText());
//	
//	if(list.get(i).getText().equals("selenium interview questions"))
//	{
//		list.get(i).click();
//		break;
//	}
//}

//	}	
	@FindBy(id="searchTerm")
	WebElement company;
	
	@FindBy(xpath="/html/body/form/table/tbody/tr[5]/td/div/table/tbody/tr[1]/td")
	WebElement ccl;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/a[5]")
	WebElement proceed;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td[2]/a")
	WebElement checkcompany;
	public void enterCompanyName(String cn) throws InterruptedException {
		company.sendKeys(cn);
		Thread.sleep(200);
		ccl.click();
		
		if(ccl.isEnabled()) {
			System.out.println("something wrong with company ");
		}
		else {
			System.out.println("no company is there");
		}
		
	}

	public void enterDate(String date) {
		dateandtime.sendKeys(date);
	}

	public void enterQuarter(String quater) {
		Select qua = new Select(choosefinquarter);
		if (quater.equalsIgnoreCase("Q2")) {
			qua.selectByIndex(3);
		}
		System.out.println("please select quater");
	}

	public void enterYear(String year) {
		Select yearr = new Select(choosefinyear);
		if (year.equalsIgnoreCase("2021")) {
			yearr.selectByIndex(3);
		}
		System.out.println("please select year");
	}

	public void enterUrl(String enterurl) {
		sourceurl.sendKeys(enterurl);
	}
	
	public void enterLiveCall(String call) {
		livephoneus.sendKeys(call);
	}
	
	public void enterPasscode(String passcode) {
		livepasscodeus.sendKeys(passcode);
	}
	public void enterReplayCall(String replayCall) {
		replaypasscodeus.sendKeys(replayCall);
	}
	public void enterReplayPasscode(String replaypasscode) {
		replaypasscodeus.sendKeys(replaypasscode);
	}

	public void enterLiveWebcast(String WebCast) {
		livewebcast.sendKeys(WebCast);
	}
	public void enterReplayLiveWebcast(String replayWeb) {
		replaywebcast.sendKeys(replayWeb);
	}
	public void enterSend() {
		send.click();
	}
	
	public void waitfortime() throws InterruptedException {
		Thread.sleep(10000);
	}
	
	public void clickproceed() {
		proceed.click();
	}
	
	public void checkcompany(String cname) {
		boolean bodyText = last.getText().contains(cname);
		//Assert.assert("Text not found!", bodyText.contains(cname));
		//Assert.assertEquals(bodyText,true);
	}
	
	public void logout() {
		logout.click();
	}
}
