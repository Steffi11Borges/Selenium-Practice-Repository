package Organization;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProduct {

	public static void main(String[] args) throws Throwable {
		// 02-06-2023 to 06-06-2023
 		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys("iphone");
		WebElement data = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]"));
		Rectangle val = data.getRect();
		System.out.println(val.getX());
		System.out.println(val.getY());
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<4;i++)
		{
			js.executeScript("window.scrollBy(0,229)");
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}

}
