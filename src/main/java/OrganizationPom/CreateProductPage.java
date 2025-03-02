package OrganizationPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.Webdriver_utility;

public class CreateProductPage {
	//16-06-2023
	
	//1 initialization
			public CreateProductPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
				}
			// 'this' keyword holds the address of the 'LoginPage' start executing

			
			//2 Declaration
			@FindBy(xpath="//img[@title='Create Product...']")
			private WebElement imgSign;
			
			@FindBy(name="productname")
			private WebElement productName;
			
			@FindBy(xpath="//input[@title='Save [Alt+S]']")
			private WebElement saveButton;
			
			@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
			private WebElement saveButton2;
			
			//for Create product and delete product
			@FindBy(xpath="//input[@value='Delete']")
			private WebElement deleteProduct;
			


			//3 Getter Methods
			public WebElement getImgSign() {
				return imgSign;
			}

			public WebElement getProductName() {
				return productName;
			}

			public WebElement getSaveButton() {
				return saveButton;
			}
			
			public WebElement getSaveButton2() {
				return saveButton2;
			}
			
			//for Create product and delete product
			public WebElement getDeleteProduct() {
				return deleteProduct;
			}

	
			
			//4 Business Logics
			public void clickOnPlusSign()
			{
				imgSign.click();
			}
			
			public void productName(String productNAme)
			{
				productName.sendKeys(productNAme);
			}

			public void saveButton()
			{
				saveButton.click();
			}
			
			public void saveButton2(WebDriver driver) throws InterruptedException
			{				
				Webdriver_utility wlib=new Webdriver_utility();

//WebElement data = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]"));
WebElement saveButton = driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]"));

				//WebDriver Utility
				wlib.javaScriptExecutor(driver);
				saveButton2.click();				
			}
		
			//for Create product and delete product
public void deleteprdData(WebDriver driver,String productData)
{
	driver.findElement(By.xpath("//table[@class='lvt small']/tbody//td//a[text()='"+productData+"']"
			+ "/../preceding-sibling::td/input")).click();
	deleteProduct.click();
}

}
