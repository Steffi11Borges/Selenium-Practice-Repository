package Mpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GenericUtility.File_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowser {

	public static void main(String[] args) throws Throwable {
		
		
	       WebDriver driver = null;  // declare WebDriver

	        File_Utility flib = new File_Utility();
	        String BROWSER = flib.getStringKeyAndValue("browser");

	        if (BROWSER.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	        } else if (BROWSER.equalsIgnoreCase("firefox")) {
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	        } else if (BROWSER.equalsIgnoreCase("edge")) {
	            WebDriverManager.edgedriver().setup();
	            driver = new EdgeDriver();
	        } else {
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();  // default fallback
	        }

	        // Example: open Google
	        driver.get("https://www.google.com");
	        System.out.println("Browser launched: " + BROWSER);
	        System.out.println("Title: " + driver.getTitle());

	        driver.quit();

//		File_Utility flib=new File_Utility();
//		String BROWSER = flib.getStringKeyAndValue("browser");
//		if(BROWSER.equalsIgnoreCase("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//		}
//		else if(BROWSER.equalsIgnoreCase("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		else if(BROWSER.equalsIgnoreCase("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		}
//		else
//		{
//			driver=new ChromeDriver();
//		}

	}

}
