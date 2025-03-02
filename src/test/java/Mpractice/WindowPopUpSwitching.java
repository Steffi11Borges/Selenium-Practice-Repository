package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpSwitching {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[.='click']")).click();
		
		String win = driver.getWindowHandle();
		
		for (String window : win)
		{
			driver.switchTo().window(window);
			String title = driver.getTitle(); 
			System.out.println(title);

	}

	 }
	  }
