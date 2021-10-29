//package stepDefinitions;
//
//import java.awt.AWTException;
//import java.util.Properties;
//import base.Base;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import pages.LoginPage;
//import pages.LunchPage;
//import pages.MenuBar;
//import pages.Skimmer;
//
//public class SkimmerStep extends Base {
//	
//	LoginPage login;
//	LunchPage lunch;
//	MenuBar menu;
//	Skimmer skimmer;
//	Properties prop;
//	
//
//	
//	@Given("opening Trance-irs application")
//	public void open_Trance_application() {
//		initialization();
//	    login = new LoginPage(driver);
//		
//	}
//	
//	@When("User able see the Trance-IRSs Application Signing Page")
//	public void user_able_to_see_Trans() throws InterruptedException {
//		Thread.sleep(2000);
//		login.displayLogin();	
//		
//		
//	}
//	
//	@Then("user able to enter skimmer valid usernames \"([^\"]*)\"$")
//	public void user_enter_the_valid_(String username) {
//		login.click_username(username);
//		
//	}
//	
//	@Then("user able to enter skimmer valid password \"([^\"]*)\"$")
//	public void user_enter_the_valid_pass(String password) {
//		login.click_password(password);
//		
//	}
//	
//	@When("user able to clicks on the login button")
//	public void user_click_on_the_login_button() {
//		login.click_SignIn_link();
//		
//	}
//	
//	@Then("user succesfullys reached to the pre-homepage")
//	public void user_succesfully_reached_to_the_prehomepage()  throws InterruptedException {
//		Thread.sleep(1000);
//		login.displaytrance();
//		
//	}
//	
//	@When("user able to see the homepage DN processs")
//	public void user_able_to_see_the_homepage_DN_process() throws InterruptedException {
//		Thread.sleep(1000);
//		lunch = new LunchPage(driver);
//		lunch.displayDN();
//		
//		
//	}
//	
//	@Then("user able to clicks on the DN Workflow")
//	public void user_able_to_click_on_the_DN_workflow() throws InterruptedException {
//		Thread.sleep(1000);
//		lunch.clickDn();
//		
//		
//	}
//	
//	@When("user succesfully reacheds to the DN Page")
//	public void user_succesfully_reached_to_the_DN_Page() {
//		lunch.welcomeDnDisplay();
//		
//	}
//	
//	@Then("user click on the file option on menubars")
//	public void user_click_on_the_file_option_on_menubar() {
//		skimmer = new Skimmer(driver);
//		skimmer.click_File();
//		
//		
//	}
//	
//	@When("user click on the GetWriterJobs Page")
//	public void user_click_on_the_GetWriterJob_Page() {
//		skimmer.click_WriterJob();
//	}
//	
//	@Then("user succesfully reacheds to the GetWriterJob Page")
//	public void user_succesfully_reached_to_the_GetWriterJob_Page() {
//		skimmer.matchpostion();
//	}
//	
//	@When("user checks the ticker name it should match with given ticker \"([^\"]*)\"$")
//	public void user_checks_the_ticker_name_it_should_match_with_given_ticker(String tck) {
//		skimmer.matchTicker(tck);
//	}
//	
//	@Then("user check the eventid it should match with given eventid \"([^\"]*)\"$")
//	public void user_check_the_eventid_it_should_match_with_eventid(String evntID) {
//		skimmer.matchEventid(evntID);
//	}
//	
//	@Then("user verify text should present in text filed")
//	public void user_verify_text_should_present_in_text_filed() {
//		skimmer.textPresent();
//		System.out.println("text is present");
//	}
//	
//	@And("user push the text to upper text filed")
//	public void user_push_the_text_to_upper_text_filed() throws InterruptedException, AWTException {
//		skimmer.pushTextToUpper();
//		
//	}
//	
//	@And("user save the process")
//	public void user_save_the_process() {
//		skimmer.click_Save();
//		
//	}
//	
//	@Then("user click on file option on menubar")
//	public void user_click_on_file_option_on_menubar() {
//		
//		skimmer.click_File();
//		
//	}
//	
//	@Then("user click on jobcomplete option")
//	public void user_click_on_jobcomplete_option() {
//		skimmer.click_Close_Job_Complete();
//		
//	}
//	
//	@When("user able to see popup option")
//	public void user_able_to_see_popup_option() throws InterruptedException {
//		skimmer.popupHandle();
//		
//	}
//	
//	@Then("user click on logout")
//	public void user_click_on_logout() throws InterruptedException {
//	login.logout();
//		
//	}
//}
