package Practice_Day_07_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","D:\\\\ECLIPSE\\\\Drivers\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		Actions act=new Actions(driver);
		driver.switchTo().frame(0);
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		act.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();
	}

}
