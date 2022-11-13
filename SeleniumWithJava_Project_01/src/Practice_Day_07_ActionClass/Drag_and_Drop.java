package Practice_Day_07_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","D:\\ECLIPSE\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("box2"));
		WebElement target=driver.findElement(By.id("box103"));
		
		WebElement source1=driver.findElement(By.id("box5"));
		WebElement target1=driver.findElement(By.id("box105"));
		
		WebElement source2=driver.findElement(By.id("box6"));
		WebElement target2=driver.findElement(By.id("box106"));
		
		WebElement source3=driver.findElement(By.id("box4"));
		WebElement target3=driver.findElement(By.id("box107"));
		
//		act.clickAndHold(source).moveToElement(target).release().build().perform();
		act.dragAndDrop(source, target).build().perform();
		act.dragAndDrop(source1, target1).build().perform();
		act.dragAndDrop(source2, target2).build().perform();
		act.dragAndDrop(source3, target3).build().perform();
		
		
		

	}

}
