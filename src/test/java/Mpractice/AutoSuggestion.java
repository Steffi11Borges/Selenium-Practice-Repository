package Mpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		//auto suggestion
				driver.get("https://www.flipkart.com/");

				driver.findElement(By.name("q")).sendKeys("Bible");
			 	List<WebElement> autosug = driver.findElements(By.tagName("li"));
		        
		        for(WebElement list:autosug)
		        {
		        	if(list.getText().contains("bible covers"))
		        	{
		                System.out.println(list.getText());
		                list.click();
		                break;
		        	}
		        }
	}

}
