package stepDefinitions;

import java.util.Properties;
import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.LunchPage;
import pages.MenuBar;
import pages.Skimmer;

public class SkimmerStep extends Base {
	
	LoginPage login;
	LunchPage lunch;
	MenuBar menu;
	Skimmer skimmer;
	Properties prop;
	

	
	@Given("open Trance-irss application")
	public void open_Trance_application() {
		initialization();
	    login = new LoginPage(driver);
		
	}
	
	@When("User able see the Trance-IRSs Application Signin Page")
	public void user_able_to_see_Trans() throws InterruptedException {
		Thread.sleep(2000);
		login.displayLogin();	
		
		
	}
	
	@Then("user enter the valid admin usernames \"([^\"]*)\"$")
	public void user_enter_the_valid_(String username) {
		login.click_username(username);
		
	}
	
	@Then("user enter the valid admin passwords \"([^\"]*)\"$")
	public void user_enter_the_valid_pass(String password) {
		login.click_password(password);
		
	}
	
	@When("user clicks on the login button")
	public void user_click_on_the_login_button() {
		login.click_SignIn_link();
		
	}
	
	@Then("user succesfullys reached to the pre-homepage")
	public void user_succesfully_reached_to_the_prehomepage()  throws InterruptedException {
		Thread.sleep(1000);
		login.displaytrance();
		
	}
	
	@When("user able to see the homepage DN processs")
	public void user_able_to_see_the_homepage_DN_process() throws InterruptedException {
		Thread.sleep(1000);
		lunch = new LunchPage(driver);
		lunch.displayDN();
		
		
	}
	
	@Then("user able to clicks on the DN Workflow")
	public void user_able_to_click_on_the_DN_workflow() throws InterruptedException {
		Thread.sleep(1000);
		lunch.clickDn();
		
		
	}
	
	@When("user succesfully reacheds to the DN Page")
	public void user_succesfully_reached_to_the_DN_Page() {
		lunch.welcomeDnDisplay();
		
	}
	
	@Then("user click on the file option on menubars")
	public void user_click_on_the_file_option_on_menubar() {
		skimmer = new Skimmer(driver);
		skimmer.click_File();
		
		
	}
	
	@When("user click on the GetWriterJobs Page")
	public void user_click_on_the_GetWriterJob_Page() {
		skimmer.click_WriterJob();
	}
	
	@Then("user succesfully reacheds to the GetWriterJob Page")
	public void user_succesfully_reached_to_the_GetWriterJob_Page() {
		
	}
}
