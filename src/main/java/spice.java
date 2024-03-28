
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class spice {
	public static void main(String[] args) {
	String expMonth  = "June 2024";
	int expDate=8;

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
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
	


	
	String ReturnMonth  = "June 2024";
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
	
}
}
