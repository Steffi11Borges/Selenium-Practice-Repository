package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEle3 {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
 

	driver.get("https://www.facebook.com/");
		 
		 WebElement att=driver.findElement(By.id("email"));
		  //String attname = att.getAttribute("class");
		 	 System.out.println(att.getAttribute("class"));
		 	 
		 	//String tagname = att.getTagName();
			 	 System.out.println(att.getTagName());

				//String eletype = att.getAriaRole();
			 	 System.out.println(att.getAriaRole());    

			 	//String accname = att.getAccessibleName();
			 	 System.out.println(att.getAccessibleName());

			 	att.sendKeys("steffi");
			 	 System.out.println(att.getDomAttribute("name"));
			 	 
			 	 System.out.println(att.getDomProperty("name"));
	}

}
