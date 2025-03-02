package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkedpgm {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();

 driver.get("https://getcssscan.com/css-checkboxes-examples");
 
WebElement issel=driver.findElement(By.xpath("//input[@id='example-1']"));
 
issel.click();
 if(issel.isSelected()) 
 {
 	 System.out.println("yes checked");

 	}
 else {
 	 System.out.println("not checked");

 }
	}

}
