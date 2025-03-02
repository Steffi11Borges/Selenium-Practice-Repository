package seleniumTest;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptScrooling {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("https://www.zeptonow.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver; //downcasting
		{
			//page scrolling down  

			for (int i=0; i<3; i++)
			{
			
        js.executeScript("window.scrollBy(0,800)");

    }
			//Page scrolling up
			
			for (int i=0; i<3; i++)
			{
			
        js.executeScript("window.scrollBy(0,-200)");
	}
	 }
	  }
	   }
