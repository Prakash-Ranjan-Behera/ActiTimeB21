package actiTimeTest;

import org.testng.annotations.Test;

import actiTimeLib.BaseTest;
import actiTimePO.ActiTimeHomePagePO;
import actiTimePO.ActiTimeLoginPO;

public class TestHomePage extends BaseTest{

	@Test
	public void testLogout()
	{
		driver.get(URL);
		ActiTimeLoginPO loginPO = new ActiTimeLoginPO(driver);
		loginPO.login("prakashrb", "prb4061");
		ActiTimeHomePagePO homePagePO = new ActiTimeHomePagePO(driver);
		homePagePO.logout();
	}
}
