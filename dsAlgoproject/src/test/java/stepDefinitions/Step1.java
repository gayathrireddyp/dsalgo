package stepDefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Portal;

public class Step1 {
	WebDriver driver;
	public Portal hp;
	
	public void getscreenshot(WebDriver driver) throws Exception {

        File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File dest = new File(("user.dir")+"screenshot"  + ".png");
        FileUtils.copyFile(scr, dest);
        Thread.sleep(3000);
    }

@Given("User Launches the chrome browser")
public void user_launches_the_chrome_browser() {
  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	driver=new ChromeDriver();
  hp=new Portal(driver);
}

@When("User opens the URL {string}")
public void user_opens_the_url(String url) {
  driver.get(url);
}

@When("User clicks Get started button and enter in Ds_algo_Home page")
public void user_clicks_get_started_button_and_enter_in_ds_algo_home_page() {
 hp.click_Gsbutton1();
}

@When("User clicks on Data structures drop down button")
public void user_clicks_on_data_structures_drop_down_button() throws InterruptedException {
  hp.click_dropdown();
  Thread.sleep(500);
}

@When("User selects from the Drop down List")
public void user_selects_from_the_drop_down_list() throws InterruptedException {
	 Thread.sleep(500);
}

@Then("User Gets the Alert message that you are not logged in")
public void user_gets_the_alert_message_that_you_are_not_logged_in() throws InterruptedException {
	System.out.println("You are not logged in");
	Thread.sleep(500);
}

@Then("User clicks Get started buttons under one of  the six Data Structures")
public void user_clicks_get_started_buttons_under_one_of_the_six_data_structures() throws InterruptedException {
    hp.click_Gsbutton2();
    Thread.sleep(500);
}

@When("User clicks on sign in and redirected to particular page")
public void user_clicks_on_sign_in_and_redirected_to_particular_page() throws InterruptedException {
    hp.click_signin();
    Thread.sleep(500);
}

@When("User Clicks on Register!")
public void user_clicks_on_register() throws InterruptedException {
   hp.click_register();
   Thread.sleep(500);
}

@When("close browser")
public void close_browser() {
    driver.close();
}



}
