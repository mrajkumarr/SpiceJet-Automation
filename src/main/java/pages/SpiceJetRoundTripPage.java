package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificationMethod;



public class SpiceJetRoundTripPage extends ProjectSpecificationMethod {

    public SpiceJetRoundTripPage(WebDriver driver) {
        this.driver = driver;
    }

    // To select the departure city
    public SpiceJetRoundTripPage TripFrom() {
    	 findElement("Xpath", "//div[text()='From']").click();
    	 findElement("Xpath", "//div[text()='Delhi']").click();
        return this;
    }

    // To select the destination city
    public SpiceJetRoundTripPage TripTo() {
    	findElement("Xpath", "//div[text()='Chennai']").click();	
    	return this;
    }
    

    // To select the departure date
    public SpiceJetRoundTripPage DepartureDate(){
    	
    	
    	String expMonth  = "April 2024";
    	int expDate=8;
    	
    	driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
    	
    	List<WebElement> departMonths = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"));
    	
    	// (//div[text()='March '])[1]
    	int i =1;
    	
    	for (WebElement departMonth : departMonths) {

    		String monthStr = departMonth.getText();
    		//System.out.println("Depart Month is :"+monthStr);
    		if (expMonth.equals(monthStr)) {
    			break;
    		} else {
    			// Clicking next arrow click
    			driver.findElement(By.xpath(
    					"//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[1]"))
    					.click();
    			i++;
    			
    		}
    	}

    	driver.findElement(By.xpath("(//div[text()='"+expDate+"'])["+i+"]")).click();
    	return this;

    }
    

    // To select the return date
    public SpiceJetRoundTripPage ReturnDate(){
    	
    String ReturnMonth  = "April 2024";
    	int ReturnsDate=9;
    	
    	driver.findElement(By.xpath("//div[text()='Return Date']")).click();
    	
    	List<WebElement> ReturnMonths = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"));
    	
    	// (//div[text()='March '])[1]
    	int j =1;
    	
    	for (WebElement MonthReturn : ReturnMonths) {

    		String monthStr = MonthReturn.getText();
    		//System.out.println("Depart Month is :"+monthStr);
    		if (ReturnMonth.equals(monthStr)) {
    			break;
    		} else {
    			// Clicking next arrow click
    			driver.findElement(By.xpath(
    					"//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[1]")).click();
    			j++;
    			
    		}
    	}
    	
    	 driver.findElement(By.xpath("(//div[text()='" + ReturnMonth + "'])["+j+"]")).click();
    	    return this;
    }

	//To click the passenger
	public SpiceJetRoundTripPage PassengerDetails() {
		
		findElement("Xpath", "//div[text()='1 Adult']").click();
		return this;
	}


    // To select the currency
    public SpiceJetRoundTripPage Currency() {
        findElement("Xpath", "//div[text()='INR']").click();
        return this;
    }

    // To click the search flight button
    public SpiceJetRoundTripPage SearchFlightButton() {
        WebElement search = findElement("Xpath", "//div[@data-testid='home-page-flight-cta']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        search.click();
        wait.until(ExpectedConditions.elementToBeClickable(search));
        return this;
    }

}