package Practice_Day_07_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\\\ECLIPSE\\\\Drivers\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://jqueryui.com/resizable/");
		
		Actions act=new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement resize=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		act.moveToElement(resize).dragAndDropBy(resize, 90, 90).build().perform();
		Thread.sleep(6000);
	}

}
