package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomBookaHotel extends BaseClass
{
	public PomBookaHotel() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
		
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement ccNum;
	
	@FindBy(name="cc_type")
	private WebElement ccType;
	
	@FindBy(name="cc_exp_month")
	private WebElement xMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement xYear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(name="book_now")
	private WebElement bookNow;
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getxMonth() {
		return xMonth;
	}

	public WebElement getxYear() {
		return xYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	public void enterFirstName(String firstName) {
		sendText(getFirstName(), firstName);
	}
	public void enterLastName(String lastName)
		{
		sendText(getLastName(), lastName);
	}
	public void address(String address)
	{
		sendText(getAddress(), address);
	}
	public void ccNumber(String ccNum)
	{
		sendText(getCcNum(), ccNum);
	}
	public void ccType(String ccT)
	{
		sendText(getCcType(), ccT);
	}
	public void expMonth(String month,String year) {
		selectClass(getxMonth(), month);
		selectClass(getxYear(), year);
	}
	
	
	public void cvvnum(String cvv)
	{
		sendText(getCvv(), cvv);
	}
	public void clickBookNow()
	{
		buttonClick(getBookNow());
	}
	
}






