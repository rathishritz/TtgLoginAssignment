package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ttgHomepage;


public class LoginSteps {

	public ttgHomepage homepage=new ttgHomepage();
	private static String App_url="https://www.todaytix.com/";

	@Given("User is on TodayTix webpage and try to login")
	public void user_is_on_today_tix_webpage_and_try_to_login() throws Exception { 
		homepage.openWebpage(App_url);
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws Exception {
		homepage.validateLogin(username,password);
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	   homepage.verifyLogin();
	}
	
}
