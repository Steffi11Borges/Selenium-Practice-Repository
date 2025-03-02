package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelWebELe {

	public static void main(String[] args) {
		
	
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
				  
		
		driver.get("https://www.facebook.com/");
		
		 WebElement fontsize=driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
		 String data=fontsize.getCssValue("font-size");
		 System.out.println(data);
		 
		 String data3=fontsize.getCssValue("font-weight");
		 System.out.println(data3);

		 String data1=fontsize.getCssValue("color");
	       System.out.println(data1);
	        
	       String data2=fontsize.getCssValue("background-color");
	       System.out.println(data2);
		 
      WebElement color=driver.findElement(By.id("email"));
       String data4=color.getCssValue("color");
       System.out.println(data4);
        
       String data5=color.getCssValue("background-color");
       System.out.println(data5);
       
       WebElement dataloc=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
     org.openqa.selenium.Point location = dataloc.getLocation();// not getting RT as Point 
       System.out.println(location.getX());
       System.out.println(location.getY());
       System.out.println(location);
       
      org.openqa.selenium.Rectangle rect=dataloc.getRect();
      System.out.println(rect.getX());
      System.out.println(rect.getY());
      System.out.println(rect.getHeight());
      System.out.println(rect.getWidth());
      System.out.println(rect.getDimension());
      System.out.println(rect.getPoint());
      System.out.println(rect);

      
      Dimension dimen = dataloc.getSize();
      System.out.println(dimen.getHeight());
      System.out.println(dimen.getWidth());
      System.out.println(dimen);

     WebElement loca=driver.findElement(By.name("pass"));
     org.openqa.selenium.Point locc=loca.getLocation();
     System.out.println(locc);

	
 
	}

}
