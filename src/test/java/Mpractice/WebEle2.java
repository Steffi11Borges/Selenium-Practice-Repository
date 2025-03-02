package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebEle2 {

	public static void main(String[] args) {
	      
			WebDriver driver;
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
	 
		driver.get("https://www.facebook.com/");
			 
	 WebElement actclear=driver.findElement(By.id("email"));
	 actclear.sendKeys("steffi");
	 actclear.clear();
		
		
	WebElement isdis=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	//WebElement isdis=driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
	if(isdis.isDisplayed()) 
	{
		 System.out.println("yes displayed");

		}
	else {
		 System.out.println("not displayed");

	}

	 WebElement	isEn=driver.findElement(By.id("email"));
	 if(isEn.isEnabled())
	 {
		 isEn.sendKeys("Steffi");
	 }
	 else
	 {
		 System.out.println("not enabled");
	 }
		
	}

}
