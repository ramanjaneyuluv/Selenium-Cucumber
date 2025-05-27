package stepDefinationFiles;

import BasePackage.BaseSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageOfHRMPage extends BaseSetup{

	@Given("^I want to login CRM application \"([^\"]*)\"$")
	public void i_want_to_login_crm_application_url(String url) {
		//setUpDriver("chrome");
		String reverse = null;
		for(int i=url.length()-1;i>=0;i--) {
			char ch=url.charAt(i);
			reverse+=ch;
		}
		System.out.println("Reverse string is ::"+reverse);
	}
	@Given("^Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_user_name_and_password(String userName, String pwd) {
	}
	@When("^Click on login button$")
	public void click_on_login_button() {
	}
	@Then("^validate CRM homepage$")
	public void validate_crm_homepage() {
	}




}
