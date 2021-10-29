package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editor {
	
   WebDriver driver;
   public Editor(WebDriver driver) {
	   
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
   WebElement file;
   
   @FindBy(xpath="//a[contains(text(),'Get Editor Job')]")
   WebElement EditorJob;
   
   @FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
   WebElement moveup;
   
   @FindBy(xpath="//strong[contains(text(),'Editor')]")
   WebElement editor;
   
   @FindBy(xpath="//strong[@id='ticker_value']")
   WebElement ticker;
   
   @FindBy(xpath="//strong[@id='meta_event_id']")
   WebElement eventid;
   
   @FindBy(xpath="//strong[@id='meta_event_id']")
   WebElement save;
   
   @FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div/div/div[3]/button[2]")
   WebElement editorpopup;
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
   
   public void click_file() {
	   file.click();
	   
   }
   
   public void click_EditorJob() {
	  EditorJob.click();
	  
   }
   
   public void clickMoveup() {
	   moveup.click();
   }
   
   public void matchPosition() {
	   if(editor.getText().equalsIgnoreCase("Editor")) {
			System.out.println("succesfully reached in editor page");
		}
		else {
			System.out.println("failed");
			System.exit(1);
		}
   }
   public void matchevent(String evnt) {
	  if(eventid.getText().equalsIgnoreCase(evnt)) {
		  System.out.println("event id is matched");
	  }
	  else {
		  System.out.println("ticker match failed");
		  System.exit(1);
	  }
   }
   
   public void matchticker(String tck) {
		  if(ticker.getText().equalsIgnoreCase(tck)) {
			  System.out.println("ticker is matched");
		  }
		  else {
			  System.out.println("ticker match failed");
			  System.exit(1);
		  }
	   }
   public void popup() {
	   editorpopup.click();
   }
   
   
}
