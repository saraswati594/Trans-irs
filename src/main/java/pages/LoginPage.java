package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
    WebDriver driver;
    public LoginPage(WebDriver driver) {
	  
	  PageFactory.initElements(driver, this);
  }
    
  // Declare elements on Login page by @findBy annotation
        @FindBy(xpath="//input[@id='username']")
        WebElement username;
        
        @FindBy(xpath="//input[@id='password']")
        WebElement password;
        
        @FindBy(xpath="//body/div[@id='wrap']/div[1]/div[3]/form[1]/div[3]/div[1]/input[1]")
        WebElement SignIn;
        
        @FindBy(xpath=" //a[contains(text(),'Reset')]")
        WebElement Reset;
        
        @FindBy(xpath="//h2[contains(text(),'Login')]")
        WebElement logindisplay;
        
        @FindBy(xpath="//span[@id='app-title']")
        WebElement trancedisplay;
        
        @FindBy(xpath="//a[contains(text(),'Shetty')]")
        WebElement dashboard;
        
        @FindBy(xpath="//a[@id='logout-btn']")
        WebElement logout;
        
       
        
      //Utilization: Methods to perform action on the web page
        public void click_username(String un) {
        	username.sendKeys(un);
        }
        
        public void click_password(String pass) {
        	password.sendKeys(pass);
        	
        }
        
        public void click_SignIn_link() {
        	SignIn.click();
        	
        }
  
        public void click_Reset() {
        	Reset.click();
        	
        }
        	
        public void getTiltle() {
        	if(driver.getTitle().equals("Transe")) {
        		System.out.println("logged in");
        	}	
           else {
        	   System.out.println("logged in failed");	   
    	   
       }
        }
        	public void displayLogin() {
        		if(logindisplay.isDisplayed()) {
        			System.out.println("you are in sign in page");
        		}
        		else {
        			System.out.println("you are not in sign in page");
        			
        		}
        		
        	}
    	   
       
        	public void displaytrance() {
        		if(trancedisplay.isDisplayed()) {
        			System.out.println("succesfully login");
        		}
        		else {
        			System.out.println("failed");
        			
        		}
        		
        	}
        	
       
        	public void logout() throws InterruptedException {
        		dashboard.click();
        		Thread.sleep(100);
        		logout.click();
        	}
  
        	
        	
        	
        
}

