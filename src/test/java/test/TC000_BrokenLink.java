package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;
import base.ProjectSpecificationMethod;

public class TC000_BrokenLink extends ProjectSpecificationMethod {
	
	
	@Test
	public void Linkbroken() throws IOException, InterruptedException {

		 String spicejetUrl = "https://www.spicejet.com/";

	        try {
	            URL url = new URL(spicejetUrl);
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");

	            int statusCode = connection.getResponseCode();

	            if (statusCode == 200) {
	                System.out.println("\nChecking for broken links on -> " + spicejetUrl);

	                // Check each link on the page
	                // Add your logic here to extract and check links

	                System.out.println("\nWelcome To Spicejet");
	            } else {
	                System.out.println("\nFailed to fetch URL -> " + spicejetUrl);
	            }

	            connection.disconnect();
	        } 
	        
	        catch (IOException e)
	        {
	            System.out.println("\nError -> " + e.getMessage());
	        }
	    }
	}