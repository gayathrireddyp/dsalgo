package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Portal {
	public WebDriver driver1;
	public Portal(WebDriver Driver1)
	{
		driver1=Driver1;
		PageFactory.initElements(Driver1,this);
	}
	
	@FindBy(xpath="//div//button[@class='btn']")
	@CacheLookup
	WebElement Getstartedbutton1;
	
	@FindBy(xpath="//div[@class='nav-item dropdown']/a[contains(text(),'Data Structures')]")
	@CacheLookup
	WebElement dropdownbutton;
	
	@FindBy(xpath="//p[@class='card-text']/..//a")
	@CacheLookup
	WebElement Getstartedbutton2;

	@FindBy(xpath="//ul//a[contains(text(),'Sign in')]")
	@CacheLookup
	WebElement signinbutton;

	@FindBy(xpath="//div//a[contains(text(),'Register!')]")
	@CacheLookup
	WebElement registerbutton; 
	
	public void click_Gsbutton1()
	{
		Getstartedbutton1.click();
	}
	public void click_dropdown()
	{
		 dropdownbutton.click();
	}
	public void click_Gsbutton2()
	{
		Getstartedbutton2.click();
	}
	public void click_signin()
	{
		signinbutton.click();
	}
	public void click_register()
	{
		registerbutton.click();
	}
	

}
