package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisonPopUp {

	public static void main(String[] args) {

		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		
		driver.get("https://chercher.tech/practice/hidden-division-popup");
		driver.findElement(By.className("cd-popup-trigger")).click();
		
		// send text to Name field on overlay
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hidden Division Text");
	}

}
