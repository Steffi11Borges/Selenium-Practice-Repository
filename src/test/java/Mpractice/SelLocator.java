package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelLocator {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("http://www.amazon.in/");
		   
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bible");
	       driver.navigate().refresh();
	       driver.findElement(By.name("field-keywords")).sendKeys("Jesus");
	       driver.findElement(By.id("nav-search-dropdown-card")).click();
	      driver.findElement(By.className("hm-icon-label")).click();
	      
	      driver.findElement(By.linkText("Best Sellers")).click();
	      driver.findElement(By.partialLinkText("Best S")).click();
	      
	      // here id is # in css selector and for class .
	      driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("cross");
	     driver.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("cross");

	   driver.findElement(By.cssSelector("[class='a-declarative nav-progressive-attribute']")).click();
	}

}
