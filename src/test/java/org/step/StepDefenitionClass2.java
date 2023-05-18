package org.step;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;

import org.pomManager.PomManagerClass;

import io.cucumber.java.en.When;

public class StepDefenitionClass2 extends BaseClass
{
	PomManagerClass pom =new PomManagerClass();
	@When("User should select the radio button")
	public void user_should_select_the_radio_button() {
	   pom.getPomSelectHotelPage().radioButton();
	}
	@When("User should click the continue button")
	public void user_should_click_the_continue_button() {
		pom.getPomSelectHotelPage().conButton();
	}
	@When("User should enter the first name based on one dimensional map")
	public void user_should_enter_the_first_name_based_on_one_dimensional_map(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> asMap = dataTable.asMap();
	  String fName = asMap.get("firstname");
	  pom.getPomBookaHotel().enterFirstName(fName);
	}
	@When("User should enter the last name based on one dimensional list")
	public void user_should_enter_the_last_name_based_on_one_dimensional_list(io.cucumber.datatable.DataTable dataTable) {
	    List<String> asList = dataTable.asList();
	    String lName = asList.get(0);
	    pom.getPomBookaHotel().enterLastName(lName);
	}
	@When("User should enter the address based on one dimensional map")
	public void user_should_enter_the_address_based_on_one_dimensional_map(io.cucumber.datatable.DataTable dataTable) {
	  Map<String, String> asMap = dataTable.asMap();
	  String address = asMap.get("address");
	  pom.getPomBookaHotel().address(address);
	}
	@When("User should enter the sixteen digit credit card number based on one dimensional list")
	public void user_should_enter_the_sixteen_digit_credit_card_number_based_on_one_dimensional_list(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		String ccNum = asList.get(0);
		pom.getPomBookaHotel().ccNumber(ccNum);
	}
	@When("User should select the credit card type based on one dimensional map")
	public void user_should_select_the_credit_card_type_based_on_one_dimensional_map(io.cucumber.datatable.DataTable dataTable) {
		 Map<String, String> asMap = dataTable.asMap();
		  String cType = asMap.get("creditCardType");
		  pom.getPomBookaHotel().ccType(cType);
	}
	@When("User should select the  expiryMonth and expiryYear two dimensional list")
	public void user_should_select_the_expiry_month_and_expiry_year_two_dimensional_list(io.cucumber.datatable.DataTable dataTable) {
	   List<List<String>> asLists = dataTable.asLists();
	  String month = asLists.get(0).get(1);
	 String year = asLists.get(1).get(1);
	 pom.getPomBookaHotel().expMonth(month, year);
	
	}
	@When("User should enter the four digit one dimensional map")
	public void user_should_enter_the_four_digit_one_dimensional_map(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap();
		  String cvvNum = asMap.get("cvvNumber");
		  pom.getPomBookaHotel().cvvnum(cvvNum);
	}
	@When("User should click booknow button")
	public void user_should_click_booknow_button() {
		pom.getPomBookaHotel().clickBookNow();
	}

}
