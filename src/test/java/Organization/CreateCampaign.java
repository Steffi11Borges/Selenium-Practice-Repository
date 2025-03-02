package Organization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampaign {

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
				driver.findElement(By.linkText("More")).click();
				driver.findElement(By.linkText("Campaigns")).click();
				driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();
				driver.findElement(By.name("campaignname")).sendKeys("marketing");
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
				driver.findElement(By.linkText("Sign Out")).click();


	}

}
