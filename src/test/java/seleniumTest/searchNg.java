package seleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class searchNg {

	@Test
	public void tests() throws Throwable
	{
	
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");

//	driver.findElement(By.name("q")).sendKeys("bluetooth");
// 	List<WebElement> autosug = driver.findElements(By.tagName("li"));
//    
//    for(WebElement list:autosug)
//    {
//    	if(list.getText().contains(" oneplus"))
//    	{
//            System.out.println(list.getText());
//            Thread.sleep(1000);
//            list.click();
//            break;
//    	}
//    }
	
	
}
}
