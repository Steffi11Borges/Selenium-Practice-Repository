package Mpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Browser {

	public static void main(String[] args) throws Throwable {
		// 30-05-2023
		// fetching the data from property file
		
		WebDriver driver1;
		WebDriverManager.edgedriver().setup();
		driver1=new EdgeDriver();
	
		FileInputStream fis=new FileInputStream("./src/test/resources/propertiesfile10.properties");
		Properties pro=new Properties();
		pro.load(fis);
        String URL = pro.getProperty("url");
        String Username = pro.getProperty("username");
        String PASSWORD = pro.getProperty("password");
        driver1.get(URL);
        driver1.findElement(By.id("username")).sendKeys(Username);
       // driver1.findElement(By.id("username")).sendKeys(Username);

        driver1.findElement(By.name("pwd")).sendKeys(PASSWORD);
        driver1.findElement(By.id("loginButton")).click();
        //today 22-09-2025 comming from github

	}

}


