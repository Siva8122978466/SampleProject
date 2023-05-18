package org.pomManager;

import org.pom.PomBookaHotel;
import org.pom.PomClassLogin;
import org.pom.PomSearchHotelPage;
import org.pom.PomSelectHotelPage;

public class PomManagerClass 
{
	private PomClassLogin pomClassLogin;
	
	private PomSearchHotelPage pomSearchHotelPage;
	
	private PomSelectHotelPage pomSelectHotelPage;
	
	private PomBookaHotel pomBookaHotel;

	public PomClassLogin getPomClassLogin() {
		return (pomClassLogin==null)?pomClassLogin=new PomClassLogin():pomClassLogin;
	}

	public PomSearchHotelPage getPomSearchHotelPage() {
		return (pomSearchHotelPage==null)?pomSearchHotelPage= new PomSearchHotelPage():pomSearchHotelPage;
	}

	public PomSelectHotelPage getPomSelectHotelPage() {
		return (pomSelectHotelPage==null)? pomSelectHotelPage =new PomSelectHotelPage() :pomSelectHotelPage;
	}

	public PomBookaHotel getPomBookaHotel() {
		return (pomBookaHotel==null)?pomBookaHotel=new PomBookaHotel() :pomBookaHotel;
	} 


}
