package GenericOptimised;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericUtility.Excel_utility;
import GenericUtility.File_Utility;
import GenericUtility.Java_Utility;
import GenericUtility.Webdriver_utility;
import OrganizationPom.CreateCampaignsPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CampaignsModuleTest {

	@Test
	//@Test(groups ="smokeTest") //23-06-2023
	public void campaignsModuleTest() throws Throwable {
		// 13-06-2023 
		
				//webdriver utility
		Webdriver_utility wlib=new Webdriver_utility();
		//wlib.implicitwait(driver);
		
		//Launching browser
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
				
		//file utility
		File_Utility flib=new File_Utility();
		String URL = flib.getStringKeyAndValue("url");
		String USERNAME = flib.getStringKeyAndValue("username");
		String PASSWORD = flib.getStringKeyAndValue("password");
		
		driver.get(URL);
		
		//webdriver utility
wlib.maximizeScreen(driver);
//driver.manage().window().maximize();


//Calling from POM		
LoginPage login=new LoginPage(driver);
login.loginToApp(USERNAME, PASSWORD);
login.getLoginButton().click();

//Calling from POM		
HomePage home= new HomePage(driver);//object creation
home.clickMoreLink();//calling
home.clickCampLink();


//java utility
Java_Utility jlib=new Java_Utility();
int ranNum = jlib.getRandomNum();

//excel utility
Excel_utility elib=new Excel_utility();
String campData = elib.getExcelDataUsingDataFormatter("Campaigns", 2, 1)+ranNum;

//Calling from POM		
CreateCampaignsPage camp=new CreateCampaignsPage(driver);
camp.clickOnImg();
camp.campaignsName(campData);
camp.saveCamp();


Thread.sleep(2000);

//Validation
String actData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
{
	if(actData.contains(campData))
	{
		System.out.println("script pass");
	}
	else
	{
		System.out.println("script fail");
	}
}

//Calling from POM		
home.logout(driver);

	}

}
