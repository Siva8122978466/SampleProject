package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSearchHotelPage extends BaseClass
{
	public PomSearchHotelPage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(name="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement noRooms;
	
	@FindBy(name="datepick_in")
	private WebElement dateIn;
	
	@FindBy(name="datepick_out")
	private WebElement dateOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	@FindBy(name="Submit")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomtype;
	}

	public WebElement getNoRooms() {
		return noRooms;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}
	
	public void selectlocat(String locat) 
	{
		selectClass(getLocation(),locat);
	}
	public void selecthotel(String hotel)
	{
		selectClass(getHotel(), hotel);
	}
	public void selectRoomType(String room)
	{
		selectClass(getRoomType(), room);
	}
	public void selectNoRooms(String noRoom)
	{
		selectClass(getNoRooms(), noRoom);
	}
	public void selectDateIn(String dateIn)
	{
		textClear(getDateIn());
		sendText(getDateIn(), dateIn);
	}
	public void selectDateOut(String dateOut)
	{
		textClear(getDateOut());
		sendText(getDateOut(), dateOut);
	}
	public void selectAdltRoom(String adRoom)
	{
		selectClass(getAdultRoom(), adRoom);
	}
	public void selectChildRoom(String cdRoom)
	{
		selectClass(getChildRoom(), cdRoom);
	}
	public void searchButton()
	{
		buttonClick(getSearch());
	}

}
