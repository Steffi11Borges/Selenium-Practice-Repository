package Mpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 class MakeMyTripTest {

	public static void main(String[] args) throws Throwable {
//Test basic selenium
		
	WebDriver driver;
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();

	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='June 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='5']")).click();
	}

}
