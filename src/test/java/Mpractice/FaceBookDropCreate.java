package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDropCreate {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();

		driver.get("https://www.facebook.com/");
/*driver.findElement(By.id("email")).sendKeys("steffi");  //1st method
	WebElement dkeys = driver.findElement(By.id("pass"));
	dkeys.sendKeys("Borges");
		dkeys.sendKeys(Keys.ENTER);*/
		
		//driver.findElement(By.id("email")).sendKeys("steffi",Keys.ENTER); 
		
		//launching app in one line
		
		driver.findElement(By.id("email")).sendKeys("Steffi",Keys.TAB,"Borges",Keys.ENTER);
		
		
	}

}
