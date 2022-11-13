package Practice_Day_08_BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver","D:\\\\ECLIPSE\\\\Drivers\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/selenium/newtours/");
		Thread.sleep(5000);
		
		//To capture link from a websites
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0; i<links.size(); i++)
		{
		//By using href attributes we can get URL of required links
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			
			//Create a connection using url objects link
			
			HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
			
			//Wait for 2 seconds
			Thread.sleep(2000);
			
			//Establish a connection
			httpConn.connect();
			
			//Return response code if response code is above 400: broken links
			int rescode=httpConn.getResponseCode();
			 
			 if(rescode>=400)
			 {
				 System.out.println(url+ " - "+ "is broken link");
			 }
			 else
			 {
				 System.out.println(url+ " - "+ "is Valid link");
			 }
		}
		
	}

}
