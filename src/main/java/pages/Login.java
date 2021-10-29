package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;

	public Login(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//tbody/tr[2]/td[2]/input[1]")
	WebElement username;

	@FindBy(xpath = "//tbody/tr[5]/td[2]/input[1]")
	WebElement password;

	@FindBy(xpath = "//tbody/tr[7]/td[2]/input[1]")
	WebElement signin;

	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/a[6]")
	WebElement signout;
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);

	}

	public void enterPassword(String pword) {
		password.sendKeys(pword);

	}

	public void entersignin() {
		signin.click();

	}
	
	public void enterSignout() {
		signout.click();
	}

	public void checkVerifyLogin() {
		if (driver.getTitle().equals("ECS-Event Calendaring System")) {
			System.out.println("logged succesfuly");
		} else {
			System.out.println("login failed");
		}

	}

}
