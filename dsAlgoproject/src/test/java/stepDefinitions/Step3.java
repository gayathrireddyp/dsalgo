package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Graphs;

public class Step3 {
	
	WebDriver driver;
	public Graphs gr;
@Given("Users Launch the chrome browser")
public void users_launches_the_chrome_browser() {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	driver=new ChromeDriver();
  gr=new Graphs(driver);
}


@When("Users open the URL {string}")
public void users_opens_the_url(String url) {
	driver.get(url);
}

@When("Users click Get started button and enter in Ds_algo_Home page")
public void users_clicks_get_started_button_and_enter_in_ds_algo_home_page() throws InterruptedException {
	gr.click_Gsbutton1();
	 Thread.sleep(1500);
}
@Then("Users click on sign in and redirected to particular page")
public void users_clicks_on_sign_in_and_redirected_to_particular_page() throws InterruptedException {
	 gr.login();
	 Thread.sleep(1500);
}

@Then("Users enter valid email as {string} and valid password {string}")
public void users_enters_valid_email_as_and_valid_password(String emailid, String pass) throws InterruptedException {
	 gr.user_name(emailid);
	   gr.pass_word(pass);
	   Thread.sleep(1500);
   }
@Then("Users clicks on login")
public void users_click_on_login() throws InterruptedException {
	 gr.login_button();
	 Thread.sleep(300);
	
}
@Then("Users click on Get started button under Array Datastructure")
public void users_click_on_get_started_button_under_array_datastructure() throws InterruptedException {
    gr.get_startedbutton_under_graph();
    Thread.sleep(1300);
}

@Then("Users will be redirected to Arrays page")
public void users_will_be_redirected_to_arrays_page() throws InterruptedException {
    System.out.println("users are in graph page");
    Thread.sleep(1300);
}

@Then("Users click on Graph under topics covered")
public void users_click_on_graph_under_topics_covered() throws InterruptedException {
    gr.graph();
    Thread.sleep(1300);
}


@Then("Users click on try here")
public void users_click_on_try_here() throws InterruptedException {
	  Thread.sleep(1300);
    gr.tryhere();
  
}

@Then("^users enters (.*) in the textbox$")
public void users_enters_in_the_textbox(String cod) throws InterruptedException {
	 Thread.sleep(2300);
   gr.textbox(cod);
  
}


@Then("Users click on Run and output gets displayed")
public void users_click_on_run_and_output_gets_displayed() throws InterruptedException {
	   Thread.sleep(1300);
   gr.run();
  
}

@Then("Users will go back to previous page")
public void users_will_go_back_to_previous_page() throws InterruptedException {
	   Thread.sleep(1300);
   driver.navigate().back();

}

@Then("users click on Graph Representations under topics covered")
public void users_click_on_graph_representations_under_topics_covered() throws InterruptedException {
	  Thread.sleep(1300);
	gr.graphrepresentation();
 
}
@Then("Users click on try here1")
public void users_click_on_try_here1() throws InterruptedException {
    gr.tryhere2();
    Thread.sleep(1300);
}
@Then("^users enters (.*) in the textbox1$")
public void users_enters_in_the_textbox1(String cod) throws InterruptedException {
	
   gr.textbox2(cod);
   
   Thread.sleep(1300);
}
/*
@Then("^users enters (.*) in the textbox$")
public void users_enters_in_the_textbox(String cod) throws InterruptedException {
	 Thread.sleep(2300);
   gr.textbox(cod);
  
}*/


@Then("Users click on Run and output gets display")
public void users_click_on_run_and_output_gets_display() throws InterruptedException {
   gr.run2();
   Thread.sleep(1300);
}

@Then("Users will go back to previous pages")
public void users_will_go_back_to_previous_pages() throws InterruptedException {
   driver.navigate().back();
   Thread.sleep(5300);
}


@Then("users click on practice questions and enter particular page")
public void users_click_on_practice_questions_and_enter_particular_page() throws InterruptedException {
    gr.practicequestions();
    Thread.sleep(1300);
}
@Then("User click on signout")
public void users_click_on_signout() throws InterruptedException {
gr.signout();
Thread.sleep(300);
}

@Then("User close browser")
public void users_close_browser() {
	
	 driver.close();
}


}
