//package stepDefinitions;
//
//
//import java.util.Properties;
//
//import base.Base;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import pages.LoginPage;
//import pages.LunchPage;
//import pages.MenuBar;
//
//public class JobScheduler extends Base {
//	
//	LoginPage login;
//	LunchPage lunch;
//	MenuBar menu;
//	Properties prop;
//	
//	
//
//	@Given("open Trance application")
//	public void open_Trance_Application() {
//	    initialization();
//	    login = new LoginPage(driver); 
//		
//	}
//	
//	@When("User able see the Trance-IRS Application Signin Page")
//	public void user_able_see_trance() throws InterruptedException {
//		Thread.sleep(2000);
//		login.displayLogin();
//		
//	}
//		
//	
//	@Then("user enter the valid admin username \"([^\"]*)\"$")
//	public void user_enter_the_valid_(String username) {
//		login.click_username(username);
//		
//	}
//	
//	@Then("user enter the valid admin password \"([^\"]*)\"$")
//	public void user_enter_the_valid_pass(String password) {
//		login.click_password(password);
//		
//	}
//	
//	@When("user click on the login button")
//	public void user_click_on_the_login_button() {
//		login.click_SignIn_link();
//		
//	}
//	
//	@Then("user succesfully reached to the pre-homepage")
//	public void user_succesfully_reached_to_the_prehomepage() throws InterruptedException { 
//		Thread.sleep(1000);
//		login.displaytrance();
//		
//	}
//	
//	@When("user able to see the homepage DN process")
//	public void user_able_to_see_the_homepage_DN_process() throws InterruptedException { 
//		Thread.sleep(1000);
//		lunch = new LunchPage(driver);
//		lunch.displayDN();
//		
//	}
//	
//	@Then("user able to click on the DN Workflow")
//	public void user_able_to_click_on_the_DN_workflow() throws InterruptedException { 
//		Thread.sleep(1000);
//		lunch.clickDn();
//		
//	}
//	
//	@When("user succesfully reached to the DN Page")
//	public void user_succesfully_reached_to_the_DN_Page() {
//		lunch.welcomeDnDisplay();
//		
//	}
//	
//	@Then("user click on the manage option on menubar")
//	public void user_click_on_the_manage_option_on_menubar() {
//		menu = new MenuBar(driver);
//		menu.click_Manage();
//	}
//	
//	@When("user click on the jobscheduler page")
//	public void user_click_on_the_jobscheduler_page() {
//		
//		
//	}
//	
//	@Then("user succesfully reached to the jobscheduler page")
//	public void user_succesfully_reached_to_the_jobscheduler_page() {
//		
//	}
//	
//	@When("user click on the addjob button")
//	public void user_click_on_the_addjob_button() {
//		
//	}
//	
//	@Then("one popup form will be displayed")
//	public void one_popup_form_will_be_displayed() {
//		
//	}
//	
//	@Then("user enter the event key")
//	public void user_enter_the_event_key() {
//		
//	}
//	
//	@And("user enter the event date")
//	public void user_enter_the_event_date() {
//		
//	}
//	
//	@And("user select the time zone")
//	public void user_select_the_time_zone() {
//		
//	}
//	
//	@And("user select the type")
//	public void user_select_the_type() {
//		
//	}
//	
//	@And("user enter the exchange")
//	public void user_enter_the_exchange() {
//		
//	}
//	
//	@And("user select the category")
//	public void user_select_the_category() {
//		
//	}
//	
//	@And("user enter the company")
//	public void user_enter_the_company() {
//		
//	}
//	
//	@And("user select the client")
//	public void user_select_the_client() {
//		
//	}
//	
//	@And("user enter the ticker")
//	public void user_enter_the_ticker() {
//		
//	}
//	
//	@And("user enter the event title")
//	public void user_enter_the_event_title() {
//		
//	}
//	
//	@And("user enter the job date")
//	public void user_enter_the_job_date() {
//		
//	}
//	
//	@And("user select the AT1 Model")
//	public void user_select_the_AT1_Model() {
//		
//	}
//	
//	@And("user select the sk team")
//	public void user_select_the_sk_team() {
//		
//	}
//	
//	@And("user select the year")
//	public void user_select_the_year() {
//		
//	}
//	
//	@And("user select the period")
//	public void user_select_the_period() {
//		
//	}
//	
//	@And("user select the stream status")
//	public void user_select_the_stream_status() {
//		
//	}
//	
//	@Then("user click on submit button")
//	public void user_click_on_submit_button() {
//		
//	}
//}