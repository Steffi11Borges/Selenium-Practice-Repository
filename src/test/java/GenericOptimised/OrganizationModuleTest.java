 package GenericOptimised;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.Excel_utility;
import GenericUtility.Java_Utility;
import OrganizationPom.CreateOrganizationPage;
import OrganizationPom.HomePage;
import OrganizationPom.ValidationPage;

public class OrganizationModuleTest extends BaseClass {

	@Test
	public void organizationModuleTest() throws Throwable {
		// 13-06-2023 and 	//21-06-2023 //23-06-2023

		
		Java_Utility jlib=new Java_Utility();
		Excel_utility elib=new Excel_utility();
		
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

//String actData = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();

//Calling from POM	//28-06-2023	
ValidationPage valid= new ValidationPage(driver);

//String actData = valid.getOrgValidate().getText(); //method 1
 String actData = valid.validateOrgname(); //method 2

Assert.assertEquals(actData, orgName);
//Calling from POM		
home.logout(driver); //23-06-2023


	}


}
