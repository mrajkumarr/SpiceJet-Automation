package base;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import utils.Utility;

public class ProjectSpecificationMethod extends Utility{

	public static ExtentReports extent;

	@BeforeSuite
	// create a extent report
	public void getreport() {
		// Create a Physical Report
		String path = "C:\\Users\\mrajk\\eclipse-workspace\\SpiceJet\\Reports\\Spicejet.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Spicejet Report");

		// Add automation data to physical report
		extent = new ExtentReports();
		extent.attachReporter(reporter);

	
	}

	// Browser Launch
	@BeforeMethod
	@Parameters({ "browser", "url" })
	public void launchBrowser(String browser, String url) {

		browserLaunch(browser, url);
	}

	// Headless Launch
//	@BeforeMethod
	@Parameters({ "headless", "url" })
	public void browserHeadless(String headless, String url) {

		headlessBrowser(headless, url);

	}

	// AfterMethod annotation for browser close
	@AfterMethod
	public void browserClose() {

		closeBrowser();

	}

	// Dataprovider for get data to excel
	@DataProvider(name = "exceldata")
	public String[][] excelReaddata() throws IOException {

		String[][] data = excelRead();
		return data;
	}

	// Close the report
	@AfterSuite
	public void closereport() {
		extent.flush();

	}
}
