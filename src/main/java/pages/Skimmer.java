package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
}
