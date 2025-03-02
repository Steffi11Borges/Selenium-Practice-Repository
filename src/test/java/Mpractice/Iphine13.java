package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iphine13 {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
				  
	driver.get("https://www.flipkart.com/");
		
	WebElement	sear=driver.findElement(By.name("q"));
	sear.sendKeys("iphone13");
	sear.submit();

	WebElement	text=driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Starlight, 128 GB)']"
			+ "/ancestor::div[@class='yKfJKb row']"
			+ "/descendant::div[text()='₹44,999']"));

 String mobtext = text.getText();
 System.out.println(mobtext);

 WebElement	actionclick=driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Starlight, 128 GB)']"));
 actionclick.click();
 
	}

}
