package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificationMethod;

public class Bookingpage extends ProjectSpecificationMethod {

	public Bookingpage(WebDriver driver) {

		this.driver = driver;
	}
	
	//To check the checkin field available in booking page
	public Bookingpage Checkin() {

		WebElement check = findElement("Xpath", "//div[text()='check-in']");
		
		System.out.println("\n");
		
		if (check.isDisplayed()) 
		{
			System.out.println("SpiceJet -> Checkin Feild Available In Booking Page");
		} 
		else
		{
			System.out.println("SpiceJet -> Checkin Feild Not Available In Booking Page");
		}

		return this;
	}
	
	//To check the flightstatus field available in booking page
	public Bookingpage Flightstatus() {
		
		WebElement flight = findElement("Xpath", "//div[text()='flight status']");
		
		System.out.println("\n");
		
		if (flight.isDisplayed())
		{
			System.out.println("SpiceJet -> Flight Status Feild Available In Booking Page");
		} 
		else 
		{
			System.out.println("SpiceJet -> Flight Status Feild Not Available In Booking Page");
		}
		return this;
	}

	//To check the manage booking field available in booking page
	public Bookingpage ManageBooking() {
		
		WebElement manage = findElement("Xpath", "//div[text()='manage booking']");

		System.out.println("\n");
		
		if (manage.isDisplayed()) 
		{
			System.out.println("SpiceJet -> Manage Booking Feild Available In Booking Page");
		} 
		else 
		{
			System.out.println("SpiceJet -> Manage Booking Feild Not Available In Booking Page");
		}
		
		return this;
	}

}
