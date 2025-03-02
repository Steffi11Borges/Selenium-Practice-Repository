package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlPropertiesLaunch {
	public static void main(String[] args) throws Throwable {
		
//    08-06-2023
	
			WebDriver driver;
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		    FileInputStream fis=new FileInputStream("./src/test/resources/AdvSelenium.properties");
			Properties pro=new Properties();
			pro.load(fis);
			String URL = pro.getProperty("url");
			String USERNAME = pro.getProperty("username");
			String PASSWORD = pro.getProperty("password");
			
			driver.get(URL);
			
			driver.manage().window().maximize();
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			driver.findElement(By.id("submitButton")).click();

}
}
