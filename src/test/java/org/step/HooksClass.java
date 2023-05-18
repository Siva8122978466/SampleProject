package org.step;

import java.time.Duration;


import org.base.BaseClass;
import org.junit.AfterClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.base.BaseClass;
public class HooksClass extends BaseClass
{
	@Before
	public void tc01()
	{
		getDriver("chrome");
		UrlLaunch("https://adactinhotelapp.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
	}
	@After
	public static void tc02()
	{
		
		driver.close();
		
	
	}

}
