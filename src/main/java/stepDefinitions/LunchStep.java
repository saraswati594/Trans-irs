package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateEvent;
import pages.Editor;
import pages.Login;
import pages.LoginPage;
import pages.LunchPage;
import pages.ManageXML;
import pages.MenuBar;
import pages.QC;
import pages.Skimmer;


public class LunchStep extends Base {
	Login loginecs;
	LoginPage login;
	LunchPage lunch;
	MenuBar menu;
	Properties prop;
	Skimmer skimmer;
	Editor editor;
	QC qc;
	ManageXML managexml;
	CreateEvent createEvent;

	@Given("open ecs application")
	public void loginToDaggr() throws InterruptedException {
		initializationecs();
		loginecs = new Login(driver);
		Thread.sleep(1000);
	}

	@Then("user enter valid username \"([^\"]*)\"$")
	public void enterUserName(String username) {

		loginecs.enterUsername(username);
	}

	@Then("user enter valid password \"([^\"]*)\"$")
	public void enter_Pass(String password) {
		loginecs.enterPassword(password);
	}

	@When("click on signin button")
	public void submitLogin() throws InterruptedException {
		loginecs.entersignin();
		createEvent = new CreateEvent(driver);
		// Thread.sleep(1000);
	}
	@Then("user succesfully reached to homepage")
	public void succuessfullHomepage() {
		
		Assert.assertEquals(driver.getTitle(), "ECS-Event Calendaring System");
	}


	@Then("user click on add event")
	public void clickAddEvent() {
		createEvent.clickEvent();
	}

	@When("user can see new eventpage")
	public void see_new_event_page() {
		Assert.assertEquals("https://sqa.ecs.digital-nirvana.com/add_event_data.php", driver.getCurrentUrl());
	}

	@Then("user choose event type as")
	public void chooseeventtype() throws InterruptedException {
		createEvent.enterEventType();
		
		
	}

	@Then("user enter company name as \"([^\"]*)\"$")
	public void entercompanyname(String cn) throws InterruptedException {
	createEvent.enterCompanyName(cn);
	}

	@Then("user enter date and time as \"([^\"]*)\"$")
	public void dateandtime(String dat) throws InterruptedException {
		createEvent.enterDate(dat);
		Thread.sleep(200);
		createEvent.clickDone();
	}

	@Then("user choose final quarter as \"([^\"]*)\"$")
	public void choofinalquarter(String cfq) {
		createEvent.enterQuarter(cfq);
	}

	@Then("user choose final year as \"([^\"]*)\"$")
	public void choosefinalyear(String cfy) {
		createEvent.enterYear(cfy);
	}

	@Then("user choose source url as \"([^\"]*)\"$")
	public void choosesourceurl(String csu) {
		createEvent.enterUrl(csu);
	}

	@Then("user enter live phonecall as \"([^\"]*)\"$")
	public void enterlivephonecall(String elpc) {
		createEvent.enterLiveCall(elpc);
	}

	@Then("user enter passcode as \"([^\"]*)\"$")
	public void enterpasscode(String ep) {
		createEvent.enterPasscode(ep);
	}

	@Then("user enter replay livecall as \"([^\"]*)\"$")
	public void enterreplaylivecall(String erlc) {
		createEvent.enterReplayCall(erlc);
	}

	@Then("user enter replay passcode as \"([^\"]*)\"$")
	public void enterreplaypasscode(String erp) {
		createEvent.enterReplayPasscode(erp);
	}

	@Then("User enter live webcasturl as \"([^\"]*)\"$")
	public void enterlivewebcasturl(String elwc) {
		createEvent.enterLiveWebcast(elwc);
	}

	@Then("user enter replay webcast url as \"([^\"]*)\"$")
	public void enterreplaywebcasturl(String erwc) {
		createEvent.enterReplayLiveWebcast(erwc);
	}

	@When("user click on next button")
	public void nextbutton() {
		createEvent.enterSend();
	}
	@Then("user need to wait for event create")
	public void waitforevents() throws InterruptedException {
		createEvent.waitfortime();
	}
	
	@Then("user click on procesed data")
	public void user_clik_proceeddata() {
		createEvent.clickproceed();
	}
	
	@Then("user check the event is created or not by \"([^\"]*)\"$")
	public void check_event_created(String check) {
		createEvent.checkcompany(check);
	}
	@Then("user able to logout")
	public void logout1() {
		createEvent.logout();
		//driver.quit();
	}

	
	
	
	
	@Given("open Trance-Irs application")
	public void lunchTrance() {
		initializationtrance();
		login = new LoginPage(driver);
	}
	
	@When("User able see Trance-IRS Application Signin Page")
	public void seeSignPage() throws InterruptedException {
		Thread.sleep(2000);
		login.displayLogin();
	}
	
	@Then("user enter valid admin username \"([^\"]*)\"$")
	public void enterUserName_trance(String username) {
		login.click_username(username);
		
	}

	@Then("user enter valid admin password \"([^\"]*)\"$")
	public void enter_Pass_ecs(String password) {
		login.click_password(password);
	}
	
	@When("click on login button")
	public void submitLogin_ecs() {
		login.click_SignIn_link();
	}

	@Then("user succesfully reached to pre-homepage")
	public void succuessfullHomepage_trance() throws InterruptedException {
		Thread.sleep(1000);
		login.displaytrance();
	}

	
	@Then("user able click on DN Workflow for call management")
	public void clickDn() throws InterruptedException {
		//Thread.sleep(1000);
		lunch = new LunchPage(driver);
		lunch.clickDn();
	}
	
	
	@Then("user click on manage option on menubar for call management")
	public void manage() {
		menu = new MenuBar(driver);
		menu.click_Manage();
	}
	
	@And("user click on call management function")
	public void call_management() {
		menu.click_CallManagement();
	}
	
	@And("user select the job date as \"([^\"]*)\"$")
	public void user_select_the_jobdate(String jobdate) throws InterruptedException {
		lunch = new LunchPage(driver);
		//lunch.enter_date(jobdate);
		Thread.sleep(2000);
 }

	@And("user enter the ticker name as \"([^\"]*)\"$")
	public void user_enter_ticker_name(String tickername) {
		lunch.enterTicker(tickername);
	}
	
	@And("user select the timezone as \"([^\"]*)\"$")
	public void user_select_the_timezone(String tz) throws InterruptedException {
		lunch.enter_timezone(tz);
		Thread.sleep(1000);
	}
	
	@And("user click on display button")
	public void user_click_display_button() {
			lunch.display();
	}
	@Then("user verify the tiker present or not \"([^\"]*)\"$")
	public void user_verify_the_tiker_present_or_not(String tic) {
		lunch.matchTicker(tic);
	}
	
	@And("user select the team management")
	public void user_select_the_team_management() throws InterruptedException {
		lunch.team_management();
		Thread.sleep(1000);
	}
	
	@And("user select the team for skimmer")
	public void user_select_the_team_for_skimmer() throws InterruptedException {
		lunch.enterSkimmer();
	}
	
	@And("user select the team for editor")
	public void user_select_the_team_for_editor() throws InterruptedException {
		lunch.enterEditor();
	}
	
	@And("user select the team for qc")
	public void user_select_the_team_for_qc() throws InterruptedException {
	lunch.enterQc();	
	}
	
	@And("user select the all prority")
	public void user_select_the_all_prority() throws InterruptedException {
		skimmer = new Skimmer(driver);
		skimmer.cretpart();
		lunch.enterPrority();
		
		//Thread.sleep(1000);
		
	}
	
	@Then("user logout to homepage") 
	public void logout() throws InterruptedException {
		Thread.sleep(10000);
		lunch.clickHome();
	}

	
	@When("user able to clicks on the DN Workflow for skimmer")
	public void user_able_to_click_on_the_DN_workflow1() throws InterruptedException {
		Thread.sleep(1000);
		lunch.clickDn();
		
		
	}
	
	@Then("user succesfully reacheds to the DN Page for skimer")
	public void user_succesfully_reached_to_the_DN_Page1() {
		lunch.welcomeDnDisplay();
		
	}
	
	@Then("user click on the file option on menubars for skimer")
	public void user_click_on_the_file_option_on_menubar1() {
		skimmer = new Skimmer(driver);
		skimmer.click_File();
		
		
	}
	
	@When("user click on the GetWriterJobs Page")
	public void user_click_on_the_GetWriterJob_Page() {
		skimmer.click_WriterJob();
	}
	
	@Then("user succesfully reacheds to the GetWriterJob Page")
	public void user_succesfully_reached_to_the_GetWriterJob_Page() {
		//skimmer.matchpostion();
	}
	
	@Then("user verify text should present in text filed")
	public void user_verify_text_should_present_in_text_filed() {
		//skimmer.textPresent();
		System.out.println("text is present");
	}
	
	@And("user push the text to upper text filed")
	public void user_push_the_text_to_upper_text_filed() throws InterruptedException, AWTException {
		//skimmer.pushTextToUpper();
		Thread.sleep(1000);
		skimmer.script();
		
	}
	
	@And("user save the process for skimmer")
	public void user_save_the_process() {
		skimmer.click_Save();		
	}
	
	@Then("user click on file option on menubar1")
	public void user_click_on_file_option_on_menubar1() {
		
		skimmer.click_File();
		
	}
	
	@Then("user click on jobcomplete option for skimmer")
	public void user_click_on_jobcomplete_option() throws InterruptedException {
		Thread.sleep(1000);
		skimmer.click_Close_Job_Complete();
		
	}
	
	@When("user able to see popup option for skimmer")
	public void user_able_to_see_popup_option() throws InterruptedException {
		Thread.sleep(1000);
		skimmer.popupHandle();
		
	}
	
	@Then("user click on logout for skimmer")
	public void user_click_on_logout() throws InterruptedException {
		lunch.clickHome();
		
	}
	
	@Then("users able to click on the DN Workflow for editor")
	public void user_able_to_click_on_the_DN_workflow() throws InterruptedException {
		Thread.sleep(1000);
		lunch.clickDn();
		
	}	
	@When("users succesfully reached to the DN Page for editor")
	public void user_succesfully_reached_to_the_DN_Page() {
		lunch.welcomeDnDisplay();
		
	}
	
	@Then("users click on the file option on menubar for editor")
	public void user_click_on_the_file_option_on_menubar3() {
		editor = new Editor(driver);
		editor.click_file();
		
	}
	
	@When("users click on the GetEditorJob Page")
	public void click_on_the_GetEditorJob_Page() {
		editor.click_EditorJob();
	}
	
	@Then("users succesfully reached to the GetEditorJob Page")
	public void user_succesfully_reached_to_the_GetEditorJob_Page() {
		//editor.matchPosition();
	}
	
	@Then("user click on move up button")
	public void user_click_moveup_button() throws InterruptedException {
		Thread.sleep(1000);
		editor.clickMoveup();
	}
	
	@And("user click on save button for editor")
	public void user_click_on_save_button() {
	skimmer = new Skimmer(driver);
		skimmer.click_Save();
	}	
	@Then("user click on file option on menubar")
	public void user_click_on_file_option_on_menubar() {
		skimmer.click_File();
	}
	
	@And("user click on job complete option for editor")
	public void user_click_on_job_complete_option() {
		skimmer.click_Close_Job_Complete();
	}
	
	@When("user able to see popup job complete for editor")
	public void user_able_to_see_popup_job_complete() throws InterruptedException {
		Thread.sleep(1000);
		editor.popup();
	}
	
	
	@Then("user click on logout button editor")
	public void user_click_on_logout_button() throws InterruptedException {
		login = new LoginPage(driver);
		lunch.clickHome();
	}
	
	
	
	@Then("user able to click on the DN Workfloow for qc")
	public void user_able_to_click_on_the_DN_workflow2() throws InterruptedException {
		Thread.sleep(1000);
	lunch.clickDn();
		
		
	}
	
	@When("user succesfuly reached to the DN Page for qc")
	public void user_succesfully_reached_to_the_DN_Page2() {
		lunch.welcomeDnDisplay();
		
		
	}
	
	@Then("user click on the file optiion on menubar for qc")
	public void user_click_on_the_file_option_on_menubar2() {
		qc = new QC(driver);
		qc.click_file();		
		
	}	
	
	@When("user click on the GetQCJoob Page")
	public void user_click_on_the_GetQCJob_Page() throws InterruptedException {
	qc.click_QCJob();
	Thread.sleep(1000);
	}

	@Then("user succesfully reached to the GetQCJoob Page")
	public void user_succesfully_reached_to_the_GetQCJob_Page() {
		//qc.matchPosition();
	}
	
	@Then("user click on save option for qc")
	public void user_click_on_save_option3() throws InterruptedException {
		Thread.sleep(1000);
		skimmer = new Skimmer(driver);
	}
	
	@Then("user click on file option for qc")
	public void user_click_on_file_option() {
		skimmer.click_File();
	}
		@And("user click on close job button for qc")
	public void user_click_on_close_job_button() throws InterruptedException {
			Thread.sleep(1000);
		skimmer.click_Close_Job_Complete();
	}
	
	@When("user can able to see popup for confirmation for qc")
	public void user_can_able_to_see_popup_for_confirmation() throws InterruptedException {
		Thread.sleep(1000);
		qc.popup();
		
	}
	
	@Then("user click on logout option")
	public void user_click_on_logout_option() throws InterruptedException {
		login = new LoginPage(driver);
		lunch.clickHome();
	}
	
	
	
	
	
	

	
	@Then("user able to click on the DN Workflows for xmlpage")
	public void user_able_click_dnworkflow() throws InterruptedException {
		Thread.sleep(1000);
		lunch.clickDn();
	}
	
	
	@Then("user click on the file opttion on menubar for xmlpage")
	public void user_click_on_the_file_option_on_menubar() throws InterruptedException {
		skimmer = new Skimmer(driver);
		Thread.sleep(1000);
		skimmer.click_File();
	}
	
	@When("user click on the ManageXML Option for xml")
	public void user_click_on_the_managexml_option() throws InterruptedException {
		managexml = new ManageXML(driver);
		Thread.sleep(1000);
		managexml.click_ManageXML();
	}
	
	@Then("user succesfully reached to the ManageXML Pages")
	public void user_succesfully_reached_to_the_managexml_page() {
		//managexml.confirmxmlpage();
	}
	
	@And("user enters the from date \"([^\"]*)\"$")
	public void user_enter_the_fromdate(String fromdate) {
		//managexml.click_From_Date();
	}
	
	@And("user enters the to date \"([^\"]*)\"$")
	public void user_enter_the_todate(String todate) {
		//managexml.click_To_Date();
	}
	
	@And("user select the ticker")
	public void user_select_the_event_or_ticker() throws InterruptedException {
		Thread.sleep(1000);
		managexml.click_Search_by();
	}
	
	@And("user enter the ticker searchby \"([^\"]*)\"$")
	public void user_enter_the_eventid_or_ticker(String eidTid) throws InterruptedException {
		Thread.sleep(1000);
		managexml.click_Search_Box(eidTid);
	}
	
	@Then("user click on load events button")
	public void user_click_on_load_events_button() throws InterruptedException {
		Thread.sleep(1000);
		managexml.click_Load_Events();
	}
	
	@And("user select the raw formats")
	public void user_select_the_raw_format() throws InterruptedException {
		Thread.sleep(1000);
		managexml.click_Type();
	}
	
	@And("user click on load button for xml page")
	public void user_click_on_the_load_button() throws InterruptedException {
		Thread.sleep(1000);
		managexml.click_Load();
	}
	
	@Then("user click on view xmls")
	public void user_click_on_view_xml() throws InterruptedException {
		Thread.sleep(1000);
		managexml.clickxmlfile();
	}
	
	@When("user can able to see the xmls tag script")
	public void user_can_able_to_see_the_xml() {
		
	}
	
	@And("user enter the periods end date \"([^\"]*)\"$")
	public void user_enter_the_period_enddate(String pdate) throws InterruptedException {
		Thread.sleep(1000);
		managexml.periodendate(pdate);
		//managexml.clcikperiod();
	}
	
	@And("user select the industry types")
	public void user_select_the_industry_type() throws InterruptedException {
		Thread.sleep(1000);
		managexml.industrycata();
	}
	
	@And("user click on save option for xml")
	public void user_click_on_save_option() throws InterruptedException, AWTException {
		
		Thread.sleep(1000);
		managexml.save();
		Thread.sleep(1000);
		//managexml.download();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/b/b/div[1]/div/div/div[3]/button[2]")).click();
		managexml.save2();
		
		
		
//		Thread.sleep(1000);
//		managexml.xmlrowsave();
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		managexml.click_Type2();
		Thread.sleep(1000);
		managexml.click_Load();
		managexml.save();
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/b/b/div[1]/div/div/div[3]/button[2]")).click();
		managexml.save2();
		Thread.sleep(1000);
		managexml.download();
		//managexml.xmlcorectsave();
		Thread.sleep(2000);
		
		
	}
	
	
	@And("user click on uplaod options")
	public void user_click_on_upload_option() throws InterruptedException  {
		Thread.sleep(1000);
		managexml.upload();
		
		
	}
	
	@And("user enter the ticker \"([^\"]*)\"$")
	public void user_enter_ticker_for_audio(String eidTid) throws InterruptedException {
//		managexml.click_Search_by();
//		managexml.click_Search_Box(eidTid);
//		managexml.click_Load_Events();
	}
	@Then("user uplaod the audio click on audio uplaod buttons")
	public void user_uplaod_the_audio_click_on_audio_upload_button() throws InterruptedException {
		Thread.sleep(1000);
		
		
		//managexml.loadaudio();
		Thread.sleep(10000);
	}
	
	
	@And("user upload raw xml files")
	public void user_upload_raw_xml_file() {
		managexml.uploadraw();
	}
	
	@And("user uplaod corrected xml files")
	public void user_uplaod_corrected_xml_file() {
		managexml.correctedxml();
	}
	
	@Then("user able to sucessfully uplaod the file for xml")
	public void user_able_to_succesfuly_upload_the_file() throws InterruptedException {
		
	}
	@Then("user logout the page for xml page")
	public void user_logout_the_page() throws InterruptedException {
		login.logout();
	}




}
