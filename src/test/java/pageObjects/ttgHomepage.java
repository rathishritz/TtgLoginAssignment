package pageObjects;

import org.openqa.selenium.By;
import utilities.ReusableFunctions;

public class ttgHomepage{

	ReusableFunctions reusable=new ReusableFunctions();

	//Locators on the home page
	By loginbutton=By.xpath("//button[@id=\"navBarLoginButton\"]");
	By emailbutton=By.xpath("//button/span[text()='Email']");
	By email_field=By.id("sign-in-email-field");
	By password_field=By.id("sign-in-password-field");
	By submit=By.id("sign-in-submit");
	By welcome_text=By.xpath("//a[contains(text(),'Welcome back, ')]");

	
	//Function to login to the page with username and password
	public void validateLogin(String username,String password) throws Exception {
		reusable.clickElement(loginbutton);
		reusable.clickElement(emailbutton);
		reusable.clickElement(email_field);
	    reusable.enterText(email_field,username);
	    reusable.clickElement(password_field);
	    reusable.enterText(password_field, password);
	    reusable.clickElement(submit);
	    Thread.sleep(5000);
	}
	
	
	//Function to validate successful login
	public void verifyLogin() {
		reusable.checkVisibility(welcome_text);
		reusable.closePage();
		
	}


	//Function to open web page
	public void openWebpage(String url) {
		reusable.initializeDriver();
		reusable.openWebpage(url);
		
	}

	
}
