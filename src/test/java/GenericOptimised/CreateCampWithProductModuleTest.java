package GenericOptimised;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import GenericUtility.Excel_utility;
import GenericUtility.File_Utility;
import GenericUtility.Java_Utility;
import GenericUtility.Webdriver_utility;
import OrganizationPom.CreateCampaignsPage;
import OrganizationPom.CreateProductPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCampWithProductModuleTest {

	@Test
	public void createCampWithProductModuleTest() throws Throwable {
		// 13-06-2023
		
		Webdriver_utility wlib=new Webdriver_utility();
		Java_Utility jlib=new Java_Utility();
		Excel_utility elib=new Excel_utility();
		File_Utility flib=new File_Utility();
		
		//Launching browser
//				WebDriver driver;
//				WebDriverManager.edgedriver().setup();
//				driver=new EdgeDriver();
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
				//file utility
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

//calling From POM
HomePage home= new HomePage(driver);
home.ProductLink();

//calling From POM
CreateProductPage createProduct= new CreateProductPage(driver);
createProduct.clickOnPlusSign();

//Java utility
int ranNum = jlib.getRandomNum();

//excel utility
String ProductData = elib.getExcelDataUsingDataFormatter("Product", 0, 0)+ranNum;
  
//calling From POM
createProduct.productName(ProductData);

//calling From POM
createProduct.saveButton();

//Calling from POM		
home.clickMoreLink();
home.clickCampLink();

//excel utility
String campData = elib.getExcelDataUsingDataFormatter("Campaigns", 2, 1)+ranNum;

//Calling from POM		
CreateCampaignsPage camp=new CreateCampaignsPage(driver);
camp.clickOnImg();
camp.campaignsName(campData);
camp.selectPlusButton();

//Webdriver utility
    wlib.switchWindow(driver, "Products&action");
    
	//Calling from POM		
    camp.productNameSwitching(ProductData);
    camp.searchProductData();
    
	Thread.sleep(2000);
	
	//Dyanamic xpath
	driver.findElement(By.xpath("//a[text()='"+ProductData+"']")).click();
	
    //Webdriver utility
	wlib.switchWindow(driver, "Campaigns&action");
		
	//Calling from POM		
	camp.saveCamp();

		Thread.sleep(2000);
		
		//Calling from POM		
		home.logout(driver);

	}

}
