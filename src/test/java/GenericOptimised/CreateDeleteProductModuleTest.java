package GenericOptimised;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class CreateDeleteProductModuleTest{

	@Test
	public void createDeleteProductModuleTest() throws Throwable {
		// 13-06-2023
		
		File_Utility flib=new File_Utility();
		Excel_utility elib=new Excel_utility();
		Java_Utility jlib=new Java_Utility();
		Webdriver_utility wlib=new Webdriver_utility();
		
		//Launching browser
				WebDriver driver;
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
		
		//login to application
		String URL = flib.getStringKeyAndValue("url");
		String USERNAME = flib.getStringKeyAndValue("username");
		String PASSWORD = flib.getStringKeyAndValue("password");
		
driver.get(URL);

//webdiver utility
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

//java utility method
int ranNum = jlib.getRandomNum();

//excel utility
String productData = elib.getExcelDataUsingDataFormatter("Product", 0, 0)+ranNum;

//calling From POM
createProduct.productName(productData);
	
//calling From POM
createProduct.saveButton();

//calling From POM
home.ProductLink();

//calling From POM
createProduct.deleteprdData(driver, productData);

//WebDriver Utility
wlib.switchToAlertAndAccpect(driver);

//Validation
 List<WebElement> productList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr/td[3])[position()>1]"));

 boolean flag=false;
 
 for(WebElement prdName:productList)
 {
	String actData = prdName.getText();
	if(actData.contains(productData))//	Markerting293.contains(iphone)
	{
		flag=true;
		break;
	}
 }
if(flag)
{
	System.out.println("product data is deleted");
}
else
{
	System.out.println("product data not deleted");
}

//Calling from POM		
home.logout(driver);


	}

}
