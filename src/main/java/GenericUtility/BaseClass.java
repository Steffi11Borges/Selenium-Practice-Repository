  package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import OrganizationPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public	WebDriver driver;

public static WebDriver Sdriver;//only to take screenshot we have added it
	
	/*@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("Database connection");
	}
	
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("Parellel Execution");
	}*/
	

//@Parameters("BROWSER")//fetching the data from TestNg for browser from external resource 
//cross browser execution//26-06-2023
	@BeforeClass //(groups ={"smokeTest","regressionTest"})
	//public void beforeClass(String BROWSER) throws Throwable 
	public void beforeClass() throws Throwable 

	{
		File_Utility flib=new File_Utility();
		
		//file utility
		String BROWSER = flib.getStringKeyAndValue("browser");
		//WebDriver driver; // not required as already globally mentioned
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}

		System.out.println("Launching Browser");
		Sdriver=driver;// only to take screenshot
	}
	
				
	@BeforeMethod //(groups ={"smokeTest","regressionTest"})
	public void beforeMethod() throws Throwable 
	{
		Webdriver_utility wlib=new Webdriver_utility();
		File_Utility flib=new File_Utility();
		//Webdiver utility
		//wlib.implicitwait(driver);
		
				
				//File utility
				String URL = flib.getStringKeyAndValue("url");
				String USERNAME = flib.getStringKeyAndValue("username");
				String PASSWORD = flib.getStringKeyAndValue("password");
				
				driver.get(URL);
				
				//Webdriver utility
				wlib.maximizeScreen(driver);
				
				//Calling from POM		
				LoginPage login=new LoginPage(driver);
				login.loginToApp(USERNAME, PASSWORD);
				login.getLoginButton().click();
		
		System.out.println("Login to application");
	}
	
	
	/*@AfterMethod //(groups ={"smokeTest","regressionTest"})
	public void afterMethod()
	{
		HomePage home=new HomePage(driver);
        home.logout(driver);
        
	System.out.println("Logout the Application");	
	}*/
	
	
	/*@AfterClass //(groups ={"smokeTest","regressionTest"})
	public void afterClass()
	{
		driver.close();
		System.out.println("Close the browser");
	}*/
	
	
	/*@AfterTest
	public void afterTest()
	{
		System.out.println("Parellel Execution done");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Database close");
	}*/

}
