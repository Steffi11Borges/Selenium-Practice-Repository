package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSelenium {

	public static void main(String[] args) {
		
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
	
      WebElement dataloc=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
     Point location = dataloc.getLocation();// not getting RT as Point 
      System.out.println(location.getX());
      System.out.println(location.getY());
      System.out.println(location);
      
     Rectangle rect = dataloc.getRect();
     System.out.println(rect.getX());
     System.out.println(rect.getY());
     System.out.println(rect.getHeight());
     System.out.println(rect.getWidth());
     System.out.println(rect.getDimension());
     System.out.println(rect.getPoint());
     System.out.println(rect);
	}

}
