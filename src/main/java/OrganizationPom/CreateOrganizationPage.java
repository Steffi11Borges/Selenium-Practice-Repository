package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	
	//initialization
			public CreateOrganizationPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);	
				}
			// 'this' keyword holds the address of the 'CreateOrganizationPage' start executing
			
			
			//Declaration
			@FindBy(xpath="//img[@alt='Create Organization...']")
			private WebElement clickimg;
			
			@FindBy(name="accountname")
			private WebElement Orgname;

			@FindBy(id="phone")
			private WebElement OrgPhone;

			@FindBy(id="email1")
			private WebElement OrgEmai1;
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement saveButton;
			
			
			//getter methods
			public WebElement getClickimg() {
				return clickimg;
			}

			public WebElement getOrgname() {
				return Orgname;
			}

			public WebElement getOrgPhone() {
				return OrgPhone;
			}

			public WebElement getOrgEmai1() {
				return OrgEmai1;
			}

			public WebElement getSaveButton() {
				return saveButton;
			}

			
			//Business Logics
			public void clickOnImg()
			{
				clickimg.click();
			}
			
			public void orgData(String OrgName, String phoneNum, String email)
			{
				Orgname.sendKeys(OrgName);
				OrgPhone.sendKeys(phoneNum);
				OrgEmai1.sendKeys(email);
				
			}
			
			public void clickSaveButton()
			{
				saveButton.click();
			}
			
			
}