package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProKabaddiTable {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();

		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://www.prokabaddi.com/standings");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[@class='table-body']")).click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//p[text()='Jaipur Pink Panthers']")).click();

			
		}

	}


