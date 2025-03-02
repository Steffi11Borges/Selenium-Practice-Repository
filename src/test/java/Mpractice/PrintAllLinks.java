package Mpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");
 
		//printing all links
          List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
         int count=0;
          for(WebElement webele:alllinks)
        {
	    System.out.println(webele.getText());
         count++; 
         }
		 	
        System.out.println(count);
	}

}
