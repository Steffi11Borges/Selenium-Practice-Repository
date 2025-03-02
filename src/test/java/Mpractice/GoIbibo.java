package Mpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoIbibo {

	public static void main(String[] args) throws Throwable {
		// 06-06-2023
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();


			driver.get("https://www.goibibo.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    driver.findElement(By.xpath("//span[@role='presentation']")).click();
    driver.findElement(By.xpath("//span[text()='Departure']")).click();
    
    Thread.sleep(1000);
    
    String month="July 2023";
    String num="25";
    
    //driver.findElement(By.xpath("//div[text()='June 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='30']")).click();
    driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+num+"']")).click();


	}

}
