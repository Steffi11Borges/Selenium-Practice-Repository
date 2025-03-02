package Mpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class advsel2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		FileInputStream fis= new FileInputStream("src/test/resources/propertiesfile10.properties");
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String un = pro.getProperty("admin");
		String psw = pro.getProperty("manager");

		driver.get(URL);
		
		//Below code will not work bz actitime login page has changed
		//only url will work
//		driver.findElement(By.id("username")).sendKeys(un);
//		driver.findElement(By.name("pwd")).sendKeys(psw);
//		driver.findElement(By.id("loginButton")).click();

		
		
	}

}
