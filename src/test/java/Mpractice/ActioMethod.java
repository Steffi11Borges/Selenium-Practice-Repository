package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActioMethod {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
       
		driver.get("https://www.flipkart.com/");
        WebElement movetoele = driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']"));
		
		Actions act=new Actions(driver); 
		//act.moveToElement(movetoele).perform();
		act.contextClick(movetoele).perform();
		
		act.contextClick().perform();
		
		
		
	}

}
