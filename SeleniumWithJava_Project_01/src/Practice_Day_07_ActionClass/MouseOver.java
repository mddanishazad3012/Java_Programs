package Practice_Day_07_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://ECLIPSE//Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement hov1=driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[5]/a"));
		WebElement hov_and_click=driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[5]/div/div/section/div/div[2]/div/div[3]/div/div/a/span/span"));
		
		act.moveToElement(hov1).moveToElement(hov_and_click).click().build().perform();
		
	}

}
