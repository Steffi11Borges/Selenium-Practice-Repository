package Organization;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkarrtIphoneName {

	public static void main(String[] args) {
     //09-06-2023
	//iphone name and price fetching
		
		
//		WebDriver driver;
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

		driver.get("https://www.flipkart.com/search?q=iphone&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_4_1_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_4_1_na_na_na&as-pos=4&as-type=RECENT&suggestionId=iphone&requestId=42885b35-7b23-4200-ae5b-c9de2bdb2e13&as-searchtext=i");
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='_4rR01T']"));
	    List<WebElement> price = driver.findElements(By.xpath("//div[@class='_25b18c']/div[@class='_30jeq3 _1_WHN1']"));
	
	for(int i=0; i<names.size();i++)
	{
		System.out.println(names.get(i).getText()+"\t"+price.get(i).getText());
	}
	
	}

}
