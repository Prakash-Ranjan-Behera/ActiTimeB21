package actiTimePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import actiTimeLib.BasePage;

public class ActiTimeLoginPO extends BasePage {

	public ActiTimeLoginPO(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(id="username")
	private WebElement unTxtBx;
	public WebElement unTxtBx()
	{
		return unTxtBx;
	}
	
	@FindBy(name="pwd")
	private WebElement pwdTxtBx;
	public WebElement pwdTxtBx()
	{
		return pwdTxtBx;
	}
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	public WebElement loginBtn()
	{
		return loginBtn;
	}
	
	@FindBy(xpath="(//span[@class='errormsg'])[1]")
	private WebElement errorMsg;
	public WebElement errorMsg()
	{
		return errorMsg;
	}
	
	public void login(String un, String pw) {
	
		unTxtBx().sendKeys(un);
		pwdTxtBx().sendKeys(pw);
		loginBtn().click();
	}
}
