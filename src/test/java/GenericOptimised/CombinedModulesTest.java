 package GenericOptimised;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.Excel_utility;
import GenericUtility.File_Utility;
import GenericUtility.Java_Utility;
import GenericUtility.Webdriver_utility;
import OrganizationPom.CreateCampaignsPage;
import OrganizationPom.CreateOrganizationPage;
import OrganizationPom.HomePage;
import OrganizationPom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CombinedModulesTest extends BaseClass{
	
	@Test
	public void combinedModulesTest() throws Throwable {
		// 13-06-2023 and 	//21-06-2023

		
		Webdriver_utility wlib=new Webdriver_utility();
		File_Utility flib=new File_Utility();
		Java_Utility jlib=new Java_Utility();
		Excel_utility elib=new Excel_utility();
	
		//Webdiver utility
		wlib.implicitwait(driver);
		
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
	
			
				//Calling From POM
				HomePage home=new HomePage(driver);
				home.organizationLink();
				
//Calling from POM		
CreateOrganizationPage org=new CreateOrganizationPage(driver);
org.clickOnImg();

//java utility
int ranNumber = jlib.getRandomNum();
//int ranNumber = jlib.getRandomNum();

//excel utility
String orgName = elib.getExcelData("Organization", 1, 0)+ranNumber;
String phoneNum = elib.getExcelDataUsingDataFormatter("Organization", 2, 0);
String email = elib.getExcelDataUsingDataFormatter("Organization", 3, 0);
  
	//Calling from POM		
  CreateOrganizationPage orgData= new CreateOrganizationPage(driver);
  orgData.orgData(orgName, phoneNum, email);
  
Thread.sleep(1000);

 //Calling from POM		
org.clickSaveButton();

//Validation
 String actData = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
{
	if(actData.contains(orgName))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}

//Calling from POM		
home.logout(driver);

	}
	
	@Test
	public void campaignsModuleTest() throws Throwable {
		// 13-06-2023 and 	//21-06-2023

		
		//Launching browser
				WebDriver driver;
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
		
				//webdriver utility
		Webdriver_utility wlib=new Webdriver_utility();
		wlib.implicitwait(driver);
		
	  //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
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
HomePage home= new HomePage(driver);
home.clickMoreLink();
home.clickCampLink();

//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();

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
