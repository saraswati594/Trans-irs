//package stepDefinitions;
//
//import java.util.Properties;
//
//import base.Base;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import pages.Editor;
//import pages.LoginPage;
//import pages.LunchPage;
//import pages.MenuBar;
//import pages.QC;
//import pages.Skimmer;
//
//public class QCStep extends Base {
//	
//	LoginPage login;
//	Skimmer skimmer;
//	Editor editor;
//	LunchPage lunch;
//	MenuBar menu;
//	QC qc;
//	Properties prop;
//	
//	
//	
//	@Given("open Trance applications")
//	public void open_Trance_application() {
//		initialization();
//	    login = new LoginPage(driver);
//		
//		
//	}
//	
//	@When("User able see the TranceIRS Application Signin Page")
//	public void user_able_to_see_Trans() throws InterruptedException {
//		Thread.sleep(2000);
//		login.displayLogin();	
//		
//		
//	}
//	
//	@Then("user enter the valid admins username \"([^\"]*)\"$")
//	public void user_enter_the_valid_(String username) {
//		login.click_username(username);
//		
//	}
//	
//	@Then("user enter the valid admins password \"([^\"]*)\"$")
//	public void user_enter_the_valid_pass(String password) {
//		login.click_password(password);
//		
//	}
//	
//	@When("user click on the logins button")
//	public void user_click_on_the_login_button() {
//		login.click_SignIn_link();
//		
//	}
//	
//	@Then("user succesfully reached to the prehomepage")
//	public void user_succesfully_reached_to_the_prehomepage() throws InterruptedException  {
//		Thread.sleep(1000);
//		login.displaytrance();
//		
//	}
//	
//	@When("user able to sees the homepage DN process")
//	public void user_able_to_see_the_homepage_DN_process() throws InterruptedException {
//		Thread.sleep(1000);
//		lunch = new LunchPage(driver);
//		lunch.displayDN();
//		
//		
//	}
//
//	@Then("user able to click on the DN Workfloow")
//	public void user_able_to_click_on_the_DN_workflow() throws InterruptedException {
//		Thread.sleep(1000);
//		lunch.clickDn();
//		
//		
//	}
//	
//	@When("user succesfuly reached to the DN Page")
//	public void user_succesfully_reached_to_the_DN_Page() {
//		lunch.welcomeDnDisplay();
//		
//		
//	}
//	
//	@Then("user click on the file optiion on menubar")
//	public void user_click_on_the_file_option_on_menubar() {
//		qc = new QC(driver);
//		qc.click_file();
//		
//		
//	}
//	
//	@When("user click on the GetQCJoob Page")
//	public void user_click_on_the_GetQCJob_Page() {
//		qc.click_QCJob();
//	}
//	
//	@Then("user succesfully reached to the GetQCJoob Page")
//	public void user_succesfully_reached_to_the_GetQCJob_Page() {
//		qc.matchPosition();
//	}
//	
//	@And("user able to verify ticker \"([^\"]*)\"$")
//	public void user_able_to_verify_ticker(String tck) {
//		qc.matchticker(tck);
//	}
//	
//	@And("user able to verify event id \"([^\"]*)\"$")
//	public void user_able_to_verify_eventid(String evnt) {
//		qc.matchevent(evnt);
//	}
//	
//	@Then("user click on save option")
//	public void user_click_on_save_option() {
//		skimmer = new Skimmer(driver);
//		skimmer.click_Save();
//	}
//	
//	@Then("user click on file option")
//	public void user_click_on_file_option() {
//		skimmer.click_File();
//	}
//	
//	@And("user click on close job button")
//	public void user_click_on_close_job_button() {
//		skimmer.click_Close_Job_Complete();
//	}
//	
//	@When("user can able to see popup for confirmation")
//	public void user_can_able_to_see_popup_for_confirmation() throws InterruptedException {
//		skimmer.popupHandle();
//	}
//	
//	@Then("user click on logout option")
//	public void user_click_on_logout_option() throws InterruptedException {
//		login = new LoginPage(driver);
//		login.logout();
//	}
//
//
//}
