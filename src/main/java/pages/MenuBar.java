package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBar {

	 WebDriver driver;
	    public MenuBar(WebDriver driver) {
		  
		  PageFactory.initElements(driver, this);
	  }
	    
	    @FindBy(xpath="//body/div[@id='wrap']/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	    WebElement Manage;
	    
	    @FindBy(xpath="//a[contains(text(),'Call Management')]")
	    WebElement CallManagement;
	    
	    @FindBy(xpath="//input[@id='search-reports-btn']")
	    WebElement Display;
	    
	    
	    public void click_Manage() {
	    Manage.click();
	    
	    }
	    
	    public void click_CallManagement() {
	    CallManagement.click();
	    
	    }
	    
	    public void click_Display() {
	    Display.click();
	    
	    }
	    
	    
}
