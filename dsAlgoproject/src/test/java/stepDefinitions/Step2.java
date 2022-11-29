package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.Login_page;



public class Step2 {
	WebDriver driver;
	public Login_page reg;
@Given("Users Launches the chrome browser")
public void users_launches_the_chrome_browser() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	driver=new ChromeDriver();
  reg=new Login_page(driver);
}


@When("Users opens the URL {string}")
public void users_opens_the_url(String url) {
	driver.get(url);
}

@When("Users clicks Get started button and enter in Ds_algo_Home page")
public void users_clicks_get_started_button_and_enter_in_ds_algo_home_page() throws InterruptedException {
	reg.click_Gsbutton1();
	 Thread.sleep(1500);
}

@When("Users Clicks on Register!")
public void users_clicks_on_register() throws InterruptedException {
	 reg.click_register();
	   Thread.sleep(1500);
}

@Then("Users enters {string} and {string} and {string}")
public void users_enters_and_and(String email, String pswd1, String pswd2) throws InterruptedException 
{
	reg.set_username(email);
	reg.set_password1(pswd1);
	reg.set_confirmpassword1(pswd2);
	 Thread.sleep(1500);
}

@Then("Users clicks on Register again")
public void users_clicks_on_register_again() throws InterruptedException {
	reg.register_button();
	 Thread.sleep(1500);
}

@Then("users click on {string} to get refreshed")
public void users_click_on_to_get_refreshed(String string) throws InterruptedException {
	Thread.sleep(1500);
}

@Then("Users click on signout")
public void users_click_on_signout() throws InterruptedException {
	 reg.logout();
	 Thread.sleep(1500);
}

@Then("Users clicks on sign in and redirected to particular page")
public void users_clicks_on_sign_in_and_redirected_to_particular_page() throws InterruptedException {
	 reg.login();
	 Thread.sleep(1500);
}

@Then("Users enters valid email as {string} and valid password {string}")
public void users_enters_valid_email_as_and_valid_password(String emailid, String pass) throws InterruptedException {
	 reg.user_name(emailid);
	   reg.pass_word(pass);
	   Thread.sleep(1500);
   }
/*@Then("page title should be {string}")
public void users_should_get_alert1(String title) {
   if(driver.getPageSource().contains("")){
	   //driver.close();
	   Assert.assertTrue(false);
	   //driver.close();
   }
   else {  
	   Assert.assertEquals(title,"Logged out successfully");
}
}*/

 /* if(driver.getPageSource().contains("You are logged in")){
driver.close();
Assert.assertTrue(false);
System.out.println("******************");
}
else {
Assert.assertEquals(title, driver.getTitle());
System.out.println("ppppppppppppppppppppppppp");
}*/






@Then("Users click on login")
public void users_click_on_login() throws InterruptedException {
	 reg.login_button();
	 Thread.sleep(300);
	
}
@Then("page title should be {string}")
public void users_should_get_alert(String title) {
   if(driver.getPageSource().contains("")){
	   driver.close();
	   Assert.assertTrue(false);
   }
   else {  
	   Assert.assertEquals(title,"Logged out successfully");
}
}

@Then("Users click on signout1")
public void users_click_on_signout1() throws InterruptedException {
reg.logout_button();
Thread.sleep(300);
}

@Then("Users close browser")
public void users_close_browser() {
	
	 driver.close();
}
}