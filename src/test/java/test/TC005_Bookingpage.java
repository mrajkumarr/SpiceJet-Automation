package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;

public class TC005_Bookingpage  extends ProjectSpecificationMethod{
	@Test
	public void BookingDisplay() {
		
		
		Homepage booking = new Homepage(driver);
		
		booking.available_Fields()
		.Checkin()
		.Flightstatus()
		.ManageBooking();
		
		
	}
	
	
	

}
