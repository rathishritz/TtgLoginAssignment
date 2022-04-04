package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableFunctions {
	public static WebDriver driver;
	
	//Function to initialize web driver
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\Webdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	//Function to click on the specific element
	public void clickElement(By button) {
		try {
			driver.findElement(button).click();
			System.out.println(button+" clicked successfully");
		  
		}catch(Exception e) {
			System.out.print(e.getMessage());
			
		}
		
	}

	//Function to enter text on specific field
	public void enterText(By field, String username) {
		try {
			driver.findElement(field).sendKeys(username);
			System.out.println("Entered string successfully on"+field);
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
	}

	//Function to check if the element is visible on web page
	public void checkVisibility(By welcome_text) {
		
		if(driver.findElements(welcome_text).size()>0) {	
			System.out.println("User logged in successfully");
		}else
			System.out.println("Login failed");
		
	}

	//Function to open a web page
	public void openWebpage(String url) {
		try {
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println(url+" opened successfully");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public void closePage() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}
	
	
	
}
