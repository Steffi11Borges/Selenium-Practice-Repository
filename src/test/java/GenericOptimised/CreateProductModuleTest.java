package GenericOptimised;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import GenericUtility.Excel_utility;
import GenericUtility.File_Utility;
import GenericUtility.Java_Utility;
import GenericUtility.Webdriver_utility;
import OrganizationPom.CreateProductPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateProductModuleTest {

	@Test
	//@Test (groups ="regressionTest") //23-06-2023
	public void createProductModuleTest() throws Throwable {
		// 13-06-2023
		
		File_Utility flib=new File_Utility();
		Excel_utility elib=new Excel_utility();
		Java_Utility jlib=new Java_Utility();
		Webdriver_utility wlib=new Webdriver_utility();
		
		//Launching browser
//		WebDriver driver;
//		WebDriverManager.edgedriver().setup();
//		driver=new EdgeDriver();
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		//login to application //file utility 
		String URL = flib.getStringKeyAndValue("url");
		String USERNAME = flib.getStringKeyAndValue("username");
		String PASSWORD = flib.getStringKeyAndValue("password");
		
driver.get(URL);

//maximizing the screen //webdriver utility
wlib.maximizeScreen(driver);

//Calling from POM		
LoginPage login=new LoginPage(driver);
login.loginToApp(USERNAME, PASSWORD);
login.getLoginButton().click();

//calling From POM
HomePage home= new HomePage(driver);
home.ProductLink();

//calling From POM
CreateProductPage createProduct= new CreateProductPage(driver);
createProduct.clickOnPlusSign();

//to avoid duplicate(Random method)
int ranNum = jlib.getRandomNum();

//fetching data from excel sheet
String productData = elib.getExcelDataUsingDataFormatter("Product", 0, 0)+ranNum;

//calling From POM
createProduct.productName(productData);

//calling From POM
createProduct.saveButton2(driver);

Thread.sleep(3000);

//Calling from POM		
home.logout(driver);

	}

}
