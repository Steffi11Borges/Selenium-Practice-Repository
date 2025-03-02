package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePopUp {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("https://jqueryui.com/droppable");
		
		driver.switchTo().frame(0);//only one frame is there so index value is 0
		
		Actions actframe=new Actions(driver);
		
		//WebElement framedrag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement framedrag = driver.findElement(By.id("draggable"));

		
		//WebElement framedrop = driver.findElement(By.xpath("//p[text()='Drop here']"));
		WebElement framedrop = driver.findElement(By.id("droppable"));

		
		actframe.dragAndDrop(framedrag, framedrop).perform();
		
		

		
	
	}

}
