
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;



public class automate {

	 public static void main(String[] args) throws InterruptedException {  

				 WebDriver driver=new EdgeDriver();  

		 driver.navigate().to("https://www.spicejet.com/");  

		 driver.findElement(By.xpath("(//div[@data-testid='departure-date-dropdown-label-test-id']//div[2])//div[2]")).click();

		 Thread.sleep(5000);

		 driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2024']//div[@data-testid='undefined-calendar-day-14']//div[1][text()='14']")).click();

		 Thread.sleep(5000);

		 driver.findElement(By.xpath("(//div[@data-testid='return-date-dropdown-label-test-id']//div[2])//div[2]")).click();

		 Thread.sleep(5000);

		 driver.findElement(By.xpath("//div[@data-testid='undefined-month-May-2024']//div[@data-testid='undefined-calendar-day-14']//div[1][text()='14']")).click();

		 Thread.sleep(5000);

		 System.out.println("Success");

		 

	 }

}