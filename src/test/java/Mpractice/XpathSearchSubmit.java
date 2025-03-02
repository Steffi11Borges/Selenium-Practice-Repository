package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathSearchSubmit {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
				   
	driver.get("https://www.flipkart.com/");
      // driver.findElement(By.xpath("//div[text()='My Cart']")).click();
		//driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("ice"); 
//after optimizing
		//driver.findElement(By.xpath("//input[contains(@class,'P')]")).sendKeys("icecream");
        //driver.findElement(By.xpath("//input[@class='Pke_EE' and @name='q']")).sendKeys("icecream");
		
		//driver.findElement(By.xpath("//input[@class='Pke_EE' or @name='q']"));
        
        WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE' or @name='q']"));
        search.sendKeys("icecream");
        search.submit();
	}

}
