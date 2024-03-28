package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.Homepage;

public class TC002_Login extends ProjectSpecificationMethod {
	
	//To pass the value to excel file
	@BeforeTest
	public void excelfile() {
		excelfile = "Logindata";
	}

	//To test using @test annotation
	@Test(dataProvider = "exceldata")
	public void login(String mail, String password, String match) throws InterruptedException {

		Homepage login = new Homepage(driver);

		login.login()
		.email()
		.emailid(mail)
		.password(password)
		.loginbutton();
		
		//for validation 
		Thread.sleep(2000);
		if (match.equals("correct")) {
			WebElement logelement = findElement("Xpath", "//div[contains(text(),'Hi Rajkumar')]");
			String logintext = logelement.getText();
			Assert.assertEquals(logintext, "Hi Rajkumar");
			
			System.out.println("\n");
			System.out.println("Current User -> " +logintext);
			System.out.println("Welcome To SpiceJet");

		} else if (match.equals("emailwrong")) {

			String emailtext = findElement("Xpath", "//div[contains(text(),'Please enter a valid email address')]").getText();
			Assert.assertEquals(emailtext, "Please enter a valid email address");

			System.out.println("\nInvalid Email, Please enter a valid email address");
		}

		else if (match.equals("passwordwrong")) {

			String emailtext = findElement("Xpath", "//div[contains(text(),'Please enter a valid password')]").getText();
			Assert.assertEquals(emailtext, "Please enter a valid password");
			System.out.println("\nInvalid Password, Please enter a valid password");
		}

		else 
		{
			System.out.println("\nPlease enter a valid email address and password");
		}

	}
}