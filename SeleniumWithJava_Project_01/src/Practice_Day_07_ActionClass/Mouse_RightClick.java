package Practice_Day_07_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
//		Build action object
		Actions act=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(button).build().perform(); //Right Click on the element button
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click(); //Clcik on the copy options
		
		System.out.println(driver.switchTo().alert().getText()); // Capture the text Value
		driver.switchTo().alert().accept(); //Accept and close the alert box
		
		
		
	}

}
