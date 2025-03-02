
package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignsPage {
	//15-06-2023
	
	//1 initialization
		public CreateCampaignsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			}
		// 'this' keyword holds the address of the 'LoginPage' start executing

		
		//2 Declaration
		@FindBy(xpath="//img[@alt='Create Campaign...']")
		private WebElement clickplusimg; //clickplusimg is a variable name 
		                                //as it is private we can give any name
		
		
		@FindBy(name="campaignname")
		private WebElement campName;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		private WebElement saveButton;
		
		//For Create campaign with product
				
		@FindBy(xpath="//img[@alt='Select']")
		private WebElement selectButton;
		
		@FindBy(name="search_text")
		private WebElement productNameSwitching;
		
		@FindBy(name="search")
		private WebElement productSearchSwitching;
		
		
		
		//3 Getter Methods
		
		public WebElement getClickplusimg() {
			return clickplusimg;    // clickplusimg is a declared variable name
		}

		public WebElement getCampName() {
			return campName;
		}

		public WebElement getSaveButton() {
			return saveButton;
		}
		
		//For Create campaign with product

		public WebElement getSelectButton() {
			return selectButton;
		}
		
		public WebElement getProductNameSwitching() {
			return productNameSwitching;
		}

		public WebElement getProductSearchSwitching() {
			return productSearchSwitching;
		}

		
		//4 Business Logics
		public void clickOnImg() //method name //we call using method name 
		                         //after object creation in hard coding
		{
			clickplusimg.click(); // clickplusimg is a declared variable name
		}

		public void campaignsName(String CampNAme)
		{
			campName.sendKeys(CampNAme);
		}
		
		public void saveCamp()
		{
			saveButton.click();
		}

		
		//For Create campaign with product
		public void selectPlusButton()
		{
			selectButton.click();
		}
		
		public void productNameSwitching(String prdName)
		{
			productNameSwitching.sendKeys(prdName);
		}
		
		public void searchProductData()
		{
			productSearchSwitching.click();
		}
}
