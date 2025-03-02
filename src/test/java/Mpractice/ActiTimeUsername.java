package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeUsername {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
				
	
     driver.get("https://demo.actitime.com/login.do");
     
     driver.findElement(By.id("cookie-button--got-it")).click();
     
     driver.findElement(By.id("FirstName")).sendKeys("steffi");
     
     driver.findElement(By.id("confirm-button")).click();

	}

}
