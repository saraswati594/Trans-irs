package stepDefinitions;

import java.util.Properties;

import org.testng.Assert;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.LunchPage;
import pages.MenuBar;


public class LunchStep extends Base {

	LoginPage login;
	LunchPage lunch;
	MenuBar menu;
	Properties prop;
	
	
	@Given("open Trance-Irs application")
	public void lunchTrance() {
		initialization();
		login = new LoginPage(driver);
	}
	
	@When("User able see Trance-IRS Application Signin Page")
	public void seeSignPage() throws InterruptedException {
		Thread.sleep(2000);
		login.displayLogin();
	}
	
	@Then("user enter valid admin username \"([^\"]*)\"$")
	public void enterUserName(String username) {
		login.click_username(username);
		
	}

	@Then("user enter valid admin password \"([^\"]*)\"$")
	public void enter_Pass(String password) {
		login.click_password(password);
	}
	
	@When("click on login button")
	public void submitLogin() {
		login.click_SignIn_link();
	}

	@Then("user succesfully reached to pre-homepage")
	public void succuessfullHomepage() throws InterruptedException {
		Thread.sleep(1000);
		login.displaytrance();
	}

	@When("user able to see homepage DN process")
	public void seeHomepage() throws InterruptedException {
		Thread.sleep(1000);
		lunch = new LunchPage(driver);
		lunch.displayDN();
	}
	
	@Then("user able click on DN Workflow")
	public void clickDn() throws InterruptedException {
		Thread.sleep(1000);
		lunch.clickDn();
	}
	
	@When("user succesfully reached to DN Page")
	public void welcomeDn() {
		lunch.welcomeDnDisplay();
	}
	
	@Then("user click on manage option on menubar")
	public void manage() {
		menu = new MenuBar(driver);
		menu.click_Manage();
	}
	
	@And("user click on call management function")
	public void call_management() {
		menu.click_CallManagement();
	}
	

//	@Then("user select the event date")
//	public void eventdate(String da) {
//		lunch.enter_date(da);
//	}
//	
//	@And("user select search by ticker or event")
//	public void selectTickerEvent() {
//		lunch.enter_tickerorevent();
//	}
//	
//	@And("user enter id")
//	public void enter_id() {
//		lunch.enterEvent();
//	}
//	
//	@And("user select timezone")
//	public void selectTime() {
//		lunch.enter_timezone();
//	}
//	
	@Then("user verify the tiker present or not \"([^\"]*)\"$")
	public void user_verify_the_tiker_present_or_not(String tic) {
		lunch.matchTicker(tic);
	}
	
	@And("user verify the recording is availble or not")
	public void user_verify_the_recording_is_availble_or_not() {
		lunch.data_availble();
	}
	
	@And("user select the team management")
	public void user_select_the_team_management() {
		
	}
	
	@And("user select the team for skimmer \"([^\"]*)\"$")
	public void user_select_the_team_for_skimmer(String sk) throws InterruptedException {
		lunch.enterSkimmer(sk);
	}
	
	@And("user select the team for editor \"([^\"]*)\"$")
	public void user_select_the_team_for_editor(String ed) throws InterruptedException {
		lunch.enterEditor(ed);
	}
	
	@And("user select the team for qc \"([^\"]*)\"$")
	public void user_select_the_team_for_qc(String qc) throws InterruptedException {
	lunch.enterQc(qc);	
	}
	
	@And("user select the all prority")
	public void user_select_the_all_prority() {
		lunch.enterPrority();
	}
	
	@Then("user able to logout") 
	public void logout() throws InterruptedException {
		Thread.sleep(10000);
		login.logout();
	}

	@Then("user able to see signin page")
	public void ableToSeeSignPage() {
		login.displayLogin();
	}
}
