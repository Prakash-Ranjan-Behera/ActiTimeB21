package actiTimeTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import actiTimeLib.BaseTest;
import actiTimePO.ActiTimeLoginPO;

public class TestLogin extends BaseTest {

	@Test(priority=1)
	public void testValidCredential()
	{
		try {
			driver.get(URL);
			ActiTimeLoginPO loginPO = new ActiTimeLoginPO(driver);
			loginPO.login("prakashrb", "prb4061");
			String eTitle = "actiTIME - Enter Time-Track";
			loginPO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(eTitle, aTitle);
		} catch (Exception e) {
			Reporter.log("exception generated", true);
		}
	}
	
	@Test(priority=2)
	public void testInvalidUn()
	{
		try {
			driver.get(URL);
			ActiTimeLoginPO loginPO = new ActiTimeLoginPO(driver);
			loginPO.login("prakashrb1", "prb4061");
			loginPO.checkWebElement(loginPO.errorMsg());
			boolean aStatus = loginPO.errorMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(eStatus, aStatus);
			
		} catch (Exception e) {
			Reporter.log("exception generated", true);
		}
	}
	
	@Test(priority=3)
	public void testInvalidPw()
	{
		try {
			driver.get(URL);
			ActiTimeLoginPO loginPO = new ActiTimeLoginPO(driver);
			loginPO.login("prakashrb", "prb40611");
			loginPO.checkWebElement(loginPO.errorMsg());
			boolean aStatus = loginPO.errorMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(eStatus, aStatus);
			
		} catch (Exception e) {
			Reporter.log("exception generated", true);
		}
	}
	
	@Test(priority=4)
	public void testNoUsername()
	{
		try {
			driver.get(URL);
			ActiTimeLoginPO loginPO = new ActiTimeLoginPO(driver);
			loginPO.login("", "prb4061");
			loginPO.checkWebElement(loginPO.errorMsg());
			boolean aStatus = loginPO.errorMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(eStatus, aStatus);
			
		} catch (Exception e) {
			Reporter.log("exception generated", true);
		}
	}
	
	@Test(priority=5)
	public void testNoPassword()
	{
		try {
			driver.get(URL);
			ActiTimeLoginPO loginPO = new ActiTimeLoginPO(driver);
			loginPO.login("prakashrb", "");
			loginPO.checkWebElement(loginPO.errorMsg());
			boolean aStatus = loginPO.errorMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(eStatus, aStatus);
			
		} catch (Exception e) {
			Reporter.log("exception generated", true);
		}
	}
	
	@Test(priority=6)
	public void testNoValue()
	{
		try {
			driver.get(URL);
			ActiTimeLoginPO loginPO = new ActiTimeLoginPO(driver);
			loginPO.login("", "");
			loginPO.checkWebElement(loginPO.errorMsg());
			boolean aStatus = loginPO.errorMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(eStatus, aStatus);
			
		} catch (Exception e) {
			Reporter.log("exception generated", true);
		}
	}
	
	@Test(priority=7)
	public void testInvalidCredential()
	{
		try {
			driver.get(URL);
			ActiTimeLoginPO loginPO = new ActiTimeLoginPO(driver);
			loginPO.login("prakashrb1", "prb40611");
			loginPO.checkWebElement(loginPO.errorMsg());
			boolean aStatus = loginPO.errorMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(eStatus, aStatus);
			
		} catch (Exception e) {
			Reporter.log("exception generated", true);
		}
	}
}
