package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;
import pages.Onewaytrippage;
import pages.Selectflightspage;

public class TC004_SpiceJetRoundTripPage extends ProjectSpecificationMethod {
	@Test
	public void round_Trip() throws InterruptedException {
		
		Homepage roundtrip = new Homepage(driver);
		roundtrip.roundway()
		.TripFrom()
		.TripTo()
		.DepartureDate()
		.ReturnDate()
		.PassengerDetails()
		.Currency()
		.SearchFlightButton();
		
	Onewaytrippage roundchain = new Onewaytrippage(driver);
	
	roundchain.select_Flights()
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
	
	//for validation
	String title = driver.getTitle();
	System.out.println(title);
	
	if(title.contains("Flight Booking for Domestic and International, Cheap Air Tickets")) {
		System.out.println("Booking Successful");
	}
	else {
		System.out.println("Booking not successful");
	}

	
		
		
	}

	private Selectflightspage selectFlight() {
		// TODO Auto-generated method stub
		return null;
	}

}
