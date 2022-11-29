package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
		public WebDriver driver1;
		public Login_page(WebDriver Driver1)
		{
			driver1=Driver1;
			PageFactory.initElements(Driver1,this);
		}
	//get started	
		@FindBy(xpath="//div//button[@class='btn']")
		@CacheLookup
		WebElement Getstartedbutton1;
	//register! button main page
		@FindBy(xpath="//div//a[contains(text(),'Register')]")
		@CacheLookup
		WebElement registerbutton; 
	//username
		@FindBy(id="id_username")
		@CacheLookup
		WebElement txtusername; 
	//password
		@FindBy(id="id_password1")
		@CacheLookup
		WebElement txtpswd1; 
	//confirm password
		@FindBy(id="id_password2")
		@CacheLookup
		WebElement txtpswd2; 
	//register button 
		@FindBy(xpath="//input[@value='Register']")
		@CacheLookup
		WebElement registerbtn;
		
	//NumpyNinja title
		@FindBy(xpath="div//nav//a[contains(text(),'NumpyNinja')]")
		@CacheLookup
		WebElement Numpyninja;
	//signout	
		@FindBy(xpath="//ul/a[contains(text(),'Sign out')]")
		@CacheLookup
		WebElement signoutbutton;
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
	//signout
		@FindBy(xpath="//ul/a[contains(text(),'Sign out')]")
		@CacheLookup
		WebElement signoutbtn;
		
		public void click_Gsbutton1()
		{
			Getstartedbutton1.click();
		}
		public void click_register()
		{
			registerbutton.click();
		}
		public void set_username(String uname)
		{
			//txtusername.clear();
			txtusername.sendKeys(uname);
		}
		public void set_password1(String pwd1)
		{
			//textpswd1.clear();
			txtpswd1.sendKeys(pwd1);
			System.out.println("check control");
		}
		public void set_confirmpassword1(String pwd2)
		{
			//txtpswd2.clear();
			txtpswd2.sendKeys(pwd2);
		}
		public void register_button()
		{
			registerbtn.click();
		}
		public void title()
		{
			Numpyninja.click();
		}
		public void logout()
		{
			signoutbutton.click();
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
		
		public void logout_button()
		{
			signoutbtn.click();
		}
}

