//package stepDefinitions;
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
//import pages.ManageXML;
//import pages.MenuBar;
//import pages.Skimmer;
//
//public class ManageXmlStep extends Base {
//
//	LoginPage login;
//	LunchPage lunch;
//	MenuBar menu;
//	Skimmer skimmer;
//	Properties prop;
//	ManageXML managexml;
//	
//	@Given("opan trans-irs application")
//	public void open_trance_application() {
//		initialization();
//	    login = new LoginPage(driver);
//	}
//	
//	@When("User ables see the Trance-IRS Application Signin Page")
//	public void user_able_see_the_signin() throws InterruptedException {
//		Thread.sleep(2000);
//		login.displayLogin();	
//	}
//	
//	@Then("user enters the valid admin username \"([^\"]*)\"$")
//	public void user_enter_the_valid_username(String uname) {
//		login.click_username(uname);
//	}
//	
//	@Then("user enters the valid admin password \"([^\"]*)\"$")
//	public void user_enter_the_valid_password(String pass) {
//		login.click_password(pass);
//	}
//	
//	@When("user click ons the login button")
//	public void user_click_the_login_button() {
//		login.click_SignIn_link();
//	}
//	
//	@Then("user succesfully reached tos the pre-homepage")
//	public void user_succesfully_reached_prehome() throws InterruptedException {
//		Thread.sleep(1000);
//		login.displaytrance();
//	}
//	
//	@When("user able to see the homepages DN process")
//	public void user_able_see_dnprocess() throws InterruptedException {
//		Thread.sleep(1000);
//		lunch = new LunchPage(driver);
//		lunch.displayDN();
//	}
//	
//	@Then("user able to click on the DN Workflows")
//	public void user_able_click_dnworkflow() throws InterruptedException {
//		Thread.sleep(1000);
//		lunch.clickDn();
//	}
//	
//	@When("user succesffully reached to the DN Page")
//	public void user_succesfully_reached_to_the_dnpage() {
//		lunch.welcomeDnDisplay();
//	}
//	
//	@Then("user click on the file opttion on menubar")
//	public void user_click_on_the_file_option_on_menubar() {
//		skimmer = new Skimmer(driver);
//		skimmer.click_File();
//	}
//	
//	@When("user click on the ManageXML Option")
//	public void user_click_on_the_managexml_option() {
//		managexml.click_ManageXML();
//	}
//	
//	@Then("user succesfully reached to the ManageXML Page")
//	public void user_succesfully_reached_to_the_managexml_page() {
//		managexml.confirmxmlpage();
//	}
//	
//	@And("user enter the from date \"([^\"]*)\"$")
//	public void user_enter_the_fromdate(String fromdate) {
//		
//	}
//	
//	@And("user enter the to date \"([^\"]*)\"$")
//	public void user_enter_the_todate(String todate) {
//		
//	}
//	
//	@And("user select the event or ticker \"([^\"]*)\"$")
//	public void user_select_the_event_or_ticker(String eveTck) {
//		
//	}
//	
//	@And("user enter the eventid or ticker \"([^\"]*)\"$")
//	public void user_enter_the_eventid_or_ticker(String eidTid) {
//		
//	}
//	
//	@Then("user click on load events button")
//	public void user_click_on_load_events_button() {
//		
//	}
//	
//	@And("user check the eventid is showing \"([^\"]*)\"$")
//	public void user_check_the_eventid_is_showing(String eid) {
//		
//	}
//	
//	@And("user select the raw format")
//	public void user_select_the_raw_format() {
//		
//	}
//	
//	@And("user click on load button")
//	public void user_click_on_the_load_button() {
//		
//	}
//	
//	@Then("user click on view xml")
//	public void user_click_on_view_xml() {
//		
//	}
//	
//	@When("user can able to see the xml")
//	public void user_can_able_to_see_the_xml() {
//		
//	}
//	
//	@And("user enter the period end date \"([^\"]*)\"$")
//	public void user_enter_the_period_enddate(String pdate) {
//		
//	}
//	
//	@And("user select the industry type")
//	public void user_select_the_industry_type() {
//		
//	}
//	
//	@And("user click on save option")
//	public void user_click_on_save_option() {
//		
//	}
//	
//	@Then("user download the xml")
//	public void user_download_the_xml() {
//		
//	}
//	
//	@And("user click on uplaod option")
//	public void user_click_on_upload_option() {
//		
//	}
//	
//	@Then("user uplaod the audio click on audio uplaod button")
//	public void user_uplaod_the_audio_click_on_audio_upload_button() {
//		
//	}
//	
//	@And("user click on uplaod audio file")
//	public void user_click_on_upload_audio_files() {
//		
//	}
//	
//	@And("user upload raw xml file")
//	public void user_upload_raw_xml_file() {
//		
//	}
//	
//	@And("user uplaod corrected xml file")
//	public void user_uplaod_corrected_xml_file() {
//		
//	}
//	
//	@Then("user able to sucessfully uplaod the file")
//	public void user_able_to_succesfuly_upload_the_file() {
//		
//	}
//	@Then("user logout the page")
//	public void user_logout_the_page() {
//		
//	}
//}
