package Mpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
				
		//launching app
		driver.get("http://www.amazon.in/");
	
		driver.navigate().to("https://www.amazon.in/s?k=bible&crid=1IRLK9DG5P6EF&sprefix=bible%2Caps%2C228&ref=nb_sb_noss_2");

		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		String  data=driver.getTitle(); //object creation 
        System.out.println(data);
        
        driver.manage().window().maximize();
        
        driver.manage().window().minimize(); //here not working

        driver.manage().window().fullscreen();
        
       String data1=driver.getPageSource();
       System.out.println(data1);  
       
       String data2=driver.getCurrentUrl();
       System.out.println(data2);
       
     //driver.quit();
       //driver.close();
	}

}
