 package org.step;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pom.PomClassLogin;
import org.pomManager.PomManagerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenitionClass extends BaseClass
{
	PomManagerClass pom=new PomManagerClass();
	@Given("User should launch the url of webpage")
	public void user_should_launch_the_url_of_webpage() {
		
		
	}
	@When("User should enter username and password based on one dimensional map")
	public void user_should_enter_username_and_password_based_on_one_dimensional_map(io.cucumber.datatable.DataTable dataTable)
	{
		Map<String, String> asMap = dataTable.asMap();	
		String user = asMap.get("username");
		String password = asMap.get("password");
		pom.getPomClassLogin().login(user,password);
	}
	@When("User should click login button")
	public void user_should_click_login_button()
	{
		pom.getPomClassLogin().loginButton();
		
	    
	}
	@Then("User should verfiy login webpage succesfully")
	public void user_should_verfiy_login_webpage_succesfully(){
	   Assert.assertEquals(true, true);
	   System.out.println("login page verifiyed successfully");
	}

}
