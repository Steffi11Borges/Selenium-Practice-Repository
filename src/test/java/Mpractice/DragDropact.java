package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropact {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();

	
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions dragdrop=new Actions(driver);
		//dragdrop.dragAndDrop(drag, drop).perform();
		
		dragdrop.clickAndHold(drag).perform();
		dragdrop.release(drop).perform();
		
	}

}
