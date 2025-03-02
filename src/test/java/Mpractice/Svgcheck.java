package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Svgcheck {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://www.google.com/");
	    driver.findElement(By.xpath("//*[name()='svg' and @class='gb_F']")).click();
	}

}
