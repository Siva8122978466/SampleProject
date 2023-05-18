package org.step;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.pom.PomClassLogin;

import org.pomManager.PomManagerClass;

import io.cucumber.java.en.*;

public class StepDefenitionClass1 extends BaseClass
{
	PomManagerClass pom=new PomManagerClass();
	@When("User should select the hotel location")
	public void user_should_select_the_hotel_location(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		String location = asList.get(0);
		pom.getPomSearchHotelPage().selectlocat(location);
	}
	@When("User should select the hotel")
	public void user_should_select_the_hotel(io.cucumber.datatable.DataTable dataTable) 
	{
		List<String> asList = dataTable.asList();
		String hotel = asList.get(0);
		pom.getPomSearchHotelPage().selecthotel(hotel);
		
	}
	@When("User should select the roomtype")
	public void user_should_select_the_roomtype(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		String roomType = asList.get(0);
		pom.getPomSearchHotelPage().selectRoomType(roomType);
	}
	@When("User should select the number of rooms")
	public void user_should_select_the_number_of_rooms(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap();
		String noRooms = asMap.get("numberOfRooms");
		pom.getPomSearchHotelPage().selectNoRooms(noRooms);
	}
	@When("User should enter the hotel check in date")
	public void user_should_enter_the_hotel_check_in_date(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap();
		String dateIn = asMap.get("checkInDate");
		pom.getPomSearchHotelPage().selectDateIn(dateIn);
	}
	@When("User should enter the hotel check out date")
	public void user_should_enter_the_hotel_check_out_date(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap();
		String dateOut = asMap.get("checkOutDate");
		pom.getPomSearchHotelPage().selectDateOut(dateOut);
	}
	@When("User should select the adults per room")
	public void user_should_select_the_adults_per_room(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		String adRoom = asList.get(0);
		pom.getPomSearchHotelPage().selectAdltRoom(adRoom);
	}
	@When("User should select the children per room")
	public void user_should_select_the_children_per_room(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		String chdRoom = asList.get(0);
		pom.getPomSearchHotelPage().selectChildRoom(chdRoom);
	}
	@When("User should click search button")
	public void user_should_click_search_button() {
		pom.getPomSearchHotelPage().searchButton();
	}




}
