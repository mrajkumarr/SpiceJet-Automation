package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;

public class TC003_Oneway extends ProjectSpecificationMethod{
	@Test
	public void one_way() throws InterruptedException {
		
		Homepage oneway = new Homepage(driver);
		oneway.oneway()
		.from()
		.to()
		.depature_Date()
		.passengers()
		.currency()
		.searchflight_Button()
		.select_Flights()
		.continue_button()
		.passengers()
		.bookingTitle()
		.firstname()
		.lastname()
		.contact_Number()
		.email_Id()
		.city()
		.passenger_Checkclick()
		.clickContinue()
		.addon()
		.continuebutton();
		
	//For validation	
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.contains("Flight Booking for Domestic and International, Cheap Air Tickets"))
		
	{ 
		System.out.println("\n");
		System.out.println("Your Booking on SpiceJet is successful");
	}
	else 
	{
		System.out.println("Sorry, Your Booking not successful");
	}
		
		}

}
