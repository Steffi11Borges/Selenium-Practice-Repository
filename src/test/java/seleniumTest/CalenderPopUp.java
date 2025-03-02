package seleniumTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopUp {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		//driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
         
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[text()='February 2025']"
				+ "/ancestor::div[@class='DayPicker-Month']"
				+ "/descendant::p[text()='28']")).click();
	}

}
