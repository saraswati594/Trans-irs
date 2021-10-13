package stepDefinitions;

import java.util.Properties;
import org.testng.Assert;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;


public class LoginPageSteps extends Base {

	LoginPage login;
	Properties prop;

	@Given("user on the Login page URL")
	public void loginPage() {
		initialization();
		login = new LoginPage(driver);
	}

	@Then("user able see Sign In Page")
	public void seeSignPage() throws InterruptedException {
		Thread.sleep(2000);
		login.displayLogin();
	}

	@Then("user enter username as \"([^\"]*)\"$")
	public void enterUserName(String username) {
		login.click_username(username);
	}

	@Then("user enter password as \"([^\"]*)\"$")
	public void enter_Pass(String password) {
		login.click_password(password);
	}

	@When("user click on login button")
	public void submitLogin() {
		login.click_SignIn_link();
	}

	@Then("user able to login successfully")
	public void loggedIn() {
		login.displaytrance();
	}

	@And("user click on Sign out function")
	public void signOut() throws InterruptedException {
		login.logout();
	}

	@Then("user got logout from the application and land on sign in page")
	public void successLogin() throws InterruptedException {
		Thread.sleep(2000);
		login.displayLogin();
	}

	@Then("user not be able to login successfully")
	public void should_not_login() {
		login.displayLogin();
		

	}

}