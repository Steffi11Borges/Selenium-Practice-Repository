package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blinkitsearch {
//PULL BACK data to Ts framework
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
       driver.get("https://blinkit.com/s/");

		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']" )).sendKeys("chocholate");

	
	}

}
