package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.Webdriver_utility;

public class HomePage {
	// 14-06-2023
	
		//initialization
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);	
			}
		// 'this' keyword holds the address of the 'LoginPage' start executing

		
		//Declaration
		@FindBy(linkText="Organizations")
		private WebElement OrganizationLink;
		
		@FindBy(xpath="//a[text()='Products']")
		private WebElement ProductLink;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement Administrator;
		
		@FindBy(linkText="More")
		private WebElement moreLink;

		@FindBy(linkText="Campaigns")
		private WebElement campaignsLink;
		
		
		@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement signout;
		

		//Getter Method
		public WebElement getOrganizationLink() {
			return OrganizationLink;
		}
		
		public WebElement getProductLink() {
			return ProductLink;
		}
		
		public WebElement getAdministrator() {
			return Administrator;
		}
		
		public WebElement getMoreLink() {
			return moreLink;
		}

		public WebElement getCampaignsLink() {
			return campaignsLink;
		}

		public WebElement getSignout() {
			return signout;
		}
		
		
		//Business Logic
		public void organizationLink()
		{
			OrganizationLink.click();
		}
		
		public void ProductLink()
		{
			ProductLink.click();
		}
		
		public void clickMoreLink()
		{
			moreLink.click();
		}
		
		public void clickCampLink()
		{
			campaignsLink.click();
		}
		
		public void logout(WebDriver driver)
		{
			Webdriver_utility wlib= new Webdriver_utility();
			wlib.ActionsMoveToElement(driver, Administrator);
			signout.click();			
		}
		
		
}
