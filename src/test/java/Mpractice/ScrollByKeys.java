package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByKeys {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
				
				
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		                WebElement daydrop = driver.findElement(By.id("day"));
//		                daydrop.sendKeys(Keys.ARROW_UP);
//		                daydrop.sendKeys(Keys.ARROW_UP);
//		                daydrop.sendKeys(Keys.ARROW_UP);
		                
		                //in single line
		                daydrop.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP);


					 	WebElement monthdrop = driver.findElement(By.id("month"));
					 	monthdrop.sendKeys(Keys.ARROW_UP);
					 	monthdrop.sendKeys(Keys.ARROW_DOWN);

					 	WebElement yeardrop = driver.findElement(By.id("year"));
					 	yeardrop.sendKeys(Keys.ARROW_DOWN);

	}

}
