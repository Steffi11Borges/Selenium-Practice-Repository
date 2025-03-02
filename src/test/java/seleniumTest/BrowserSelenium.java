package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSelenium {
	
	public static void main(String[] args) {
		
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		//launching app
				driver.get("http://www.amazon.in/");
				
		        driver.findElement(By.id("username")).sendKeys("Username");
				 //driver.switchTo().window(win);

				 driver.navigate().forward();

		         String  data=driver.getTitle(); //object creation 
		         System.out.println(data);
		         
		         driver.manage().window().maximize();
		         
		         //driver.manage().window().minimize(); //here not working

		         driver.manage().window().fullscreen();
		         
		      /*  String data1=driver.getPageSource();
		        System.out.println(data1);  */
		        
		        String data2=driver.getCurrentUrl();
		        System.out.println(data2);
		        
		         //driver.quit();
		         //driver.close();
     
	}
	}

