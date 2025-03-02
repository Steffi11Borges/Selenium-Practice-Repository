package Mpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advsel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		
//		WebDriver driver2;
//		WebDriverManager.firefoxdriver().setup();
//		driver2=new FirefoxDriver();


		
		
	}

}
