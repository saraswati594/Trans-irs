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
//import pages.Skimmer;
//
//public class EditorStep extends Base {
//	
//	LoginPage login;
//	LunchPage lunch;
//	Skimmer skimmer;
//	MenuBar menu;
//	Editor editor;
//	Properties prop;
//	
//	
//	@Given("open Trances application")
//	public void open_Trance_application() {
//		initialization();
//	    login = new LoginPage(driver);
//		
//	}
//	
//	@When("User able see the Trance-IRS Application Sign-in Page")
//	public void user_able_to_see_Trans() throws InterruptedException {
//		Thread.sleep(2000);
//		login.displayLogin();
//		
//	}
//	
//	@Then("user enter the valid admin user-name \"([^\"]*)\"$")
//	public void user_enter_the_valid_(String username) {
//		login.click_username(username);
//		
//	}
//	
//	@Then("user enter the valid admin pass-word \"([^\"]*)\"$")
//	public void user_enter_the_valid_pass(String password) {
//		login.click_password(password);
//		
//	}
//	
//	@When("users click on the login button")
//	public void user_click_on_the_login_button() {
//		login.click_SignIn_link();
//		
//	}
//	
//	@Then("users succesfully reached to the pre-homepage")
//	public void user_succesfully_reached_to_the_prehomepage() throws InterruptedException {
//		Thread.sleep(1000);
//		login.displaytrance();
//		
//	}
//	
//	@When("users able to see the homepage DN process")
//	public void user_able_to_see_the_homepage_DN_process() throws InterruptedException {
//		Thread.sleep(1000);
//		lunch = new LunchPage(driver);
//		lunch.displayDN();
//		
//		
//	}
//	
//	@Then("users able to click on the DN Workflow")
//	public void user_able_to_click_on_the_DN_workflow() throws InterruptedException {
//		Thread.sleep(1000);
//		lunch.clickDn();
//		
//	}
//	
//	@When("users succesfully reached to the DN Page")
//	public void user_succesfully_reached_to_the_DN_Page() {
//		lunch.welcomeDnDisplay();
//		
//	}
//	
//	@Then("users click on the file option on menubar")
//	public void user_click_on_the_file_option_on_menubar() {
//		editor = new Editor(driver);
//		editor.click_file();
//		
//	}
//	
//	@When("users click on the GetEditorJob Page")
//	public void click_on_the_GetEditorJob_Page() {
//		editor.click_EditorJob();
//	}
//	
//	@Then("users succesfully reached to the GetEditorJob Page")
//	public void user_succesfully_reached_to_the_GetEditorJob_Page() {
//		editor.matchPosition();
//	}
//
//	@And("user able to check ticker \"([^\"]*)\"$")
//	public void user_able_to_check_ticker(String tckr) {
//		editor.matchticker(tckr);
//	}
//	
//	@And("user able to check eventid \"([^\"]*)\"$")
//	public void user_able_to_check_eventid(String evntId) {
//		editor.matchevent(evntId);
//	}
//	
//	@And("user click on save button")
//	public void user_click_on_save_button() {
//		skimmer = new Skimmer(driver);
//		skimmer.click_Save();
//	}
//	
//	@Then("user click on file option on menubar")
//	public void user_click_on_file_option_on_menubar() {
//		skimmer.click_File();
//	}
//	
//	@And("user click on job complete option")
//	public void user_click_on_job_complete_option() {
//		skimmer.click_Close_Job_Complete();
//	}
//	
//	@When("user able to see popup job complete")
//	public void user_able_to_see_popup_job_complete() throws InterruptedException {
//		skimmer.popupHandle();
//	}
//	
//	
//	@Then("user click on logout button")
//	public void user_click_on_logout_button() throws InterruptedException {
//		login = new LoginPage(driver);
//		login.logout();
//	}
//	
//	@Then("user successfully logout")
//	public void user_succesfully_logout() {
//		login.displayLogin();
//	}
//}
