package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graphs {
	public WebDriver driver1;
	public Graphs(WebDriver Driver1)
	{
		this.driver1=Driver1;
		PageFactory.initElements(Driver1,this);
	}
		//get started	
			@FindBy(xpath="//div//button[@class='btn']")
			@CacheLookup
			WebElement Getstartedbutton1;
		//signin again
			@FindBy(xpath="//ul//a[contains(text(),'Sign in')]")
			@CacheLookup
			WebElement signinbutton;
		
		//username
			@FindBy(id="id_username")
			@CacheLookup
			WebElement textusername; 
		//password
			@FindBy(id="id_password")
			@CacheLookup
			WebElement textpswd1; 
		//login
			@FindBy(xpath="//div[@class='container']//input[@value='Login']")
			@CacheLookup
			WebElement loginbutton;
		//graph Getstarted button
			@FindBy(xpath="//a[@href='graph']")
			@CacheLookup
			WebElement Getstartedbutton_under_graph;
		//Graph under topics
			@FindBy(xpath="//a[@href='graph']")
			@CacheLookup
			WebElement clickonGraph;
		//try here
			@FindBy(xpath="//a[contains(text(),'Try here>>>')]")
			@CacheLookup
			WebElement clickontryhere;
			
		//click text box and enter text
			@FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")
			@CacheLookup
			WebElement entercode;
		//click on run
			@FindBy(xpath="//button[contains(text(),'Run')]")
			@CacheLookup
			WebElement clickonrun;
		//click on graphrepresentation
			@FindBy(xpath="//a[contains(text(),'Graph Representations')]")
			@CacheLookup
			WebElement clickgraphrepresentation;
			//try here
			@FindBy(xpath="//a[contains(text(),'Try here>>>')]")
			@CacheLookup
			WebElement clickontryhere2;
			
		//click text box and enter text
			@FindBy(xpath="//form[@id='answer_form']/div/div/div[1]/textarea")
			@CacheLookup
			WebElement entercode2;
		//click on run
			@FindBy(xpath="//button[contains(text(),'Run')]")
			@CacheLookup
			WebElement clickonrun2;
		//practice questions
			@FindBy(xpath="//a[contains(text(),'Practice Questions')]")
			@CacheLookup
			WebElement clickonpracticequestions;
		//signout
			@FindBy(xpath="//ul/a[contains(text(),'Sign out')]")
			@CacheLookup
			WebElement signoutbtn;
			
			public void click_Gsbutton1()
			{
				Getstartedbutton1.click();
			}
			public void login()
			{
				signinbutton.click();
			}
			public void user_name(String uname) 
			{
				textusername.clear();
				textusername.sendKeys(uname);
			}
			public void pass_word(String pwd)
			{
				textpswd1.clear();
				textpswd1.sendKeys(pwd);
			}
			public void login_button()
			{
				loginbutton.click();	
			}
			public void get_startedbutton_under_graph()
			{
				Getstartedbutton_under_graph.click();
			}
			public void graph()
			{
				clickonGraph.click();
			}
			public void tryhere()
			{
				clickontryhere.click();
			}
			public void textbox(String codes)
			{
				entercode.sendKeys(codes);
				
			}
			public void run()
			{
				clickonrun.click();	
			}
			public void graphrepresentation()
			{
				clickgraphrepresentation.click();
			}
			public void tryhere2()
			{
				clickontryhere2.click();
			}
			public void textbox2(String code)
			{
				entercode2.sendKeys(code);
				
			}
			public void run2()
			{
				clickonrun2.click();	
			}
			public void practicequestions()
			{
				clickonpracticequestions.click();
			}
			public void signout()
			{
				signoutbtn.click();
			}
}
