package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSelectHotelPage extends BaseClass
{
	public PomSelectHotelPage() 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	@FindBy(name="continue")
	private WebElement contButton;
	
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getContButton() {
		return contButton;
	}
	
	
	public void radioButton()
	{
		buttonClick(radioButton);
	}
	
	public void conButton()
	{
		buttonClick(contButton);
	}

}
