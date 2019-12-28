package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonFunctions.CommonFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	WebDriver driver;
	
	@When("^I open chrome$")
	public void i_open_chrome() throws Throwable {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rangareddy.QEDGE\\Documents\\MyNewWorkspace\\StockAccounting_BDD2\\StockAccountingBDD\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
	}

	@When("^launch stock url$")
	public void launch_stock_url() throws Throwable {
		
		driver.get("http://webapp.qedge.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	    
	}

	@When("^I enter username$")
	public void i_enter_username() throws Throwable {
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
	   
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.id("btnsubmit")).click();
		Thread.sleep(5000);
	}

	@Then("^I should see the homepage$")
	public void i_should_see_the_homepage() throws Throwable {
		
		if(driver.findElement(By.id("logout")).isDisplayed()){
			System.out.println("test passed");
		}else{
			System.out.println("test failed");
		}
	   
	}
	
	
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
		driver=CommonFunctions.startBrowser("chrome");
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
		CommonFunctions.openApplication(driver);
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
		CommonFunctions.waitForElement(driver, "id", "username", "30");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
		CommonFunctions.typeAction(driver, "id", "username", "admin");
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
		CommonFunctions.waitForElement(driver, "id", "password", "30");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
		CommonFunctions.typeAction(driver, "id", "password", "master");
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
		CommonFunctions.clickAction(driver, "id", "btnsubmit");
	}

	@When("^wait For Logout$")
	public void wait_For_Logout() throws Throwable {
		CommonFunctions.waitForElement(driver, "id", "logout", "30");
	}

	@When("^Click On Logout$")
	public void click_On_Logout() throws Throwable {
		CommonFunctions.clickAction(driver, "id", "logout");
	}

	@When("^Wait For OK$")
	public void wait_For_OK() throws Throwable {
		CommonFunctions.waitForElement(driver, "xpath", "/html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]", "30");
	}

	@When("^Click On Ok$")
	public void click_On_Ok() throws Throwable {
		CommonFunctions.clickAction(driver, "xpath", "/html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]");
	}

	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {
		CommonFunctions.closeBrowser(driver);
	}


	

}
