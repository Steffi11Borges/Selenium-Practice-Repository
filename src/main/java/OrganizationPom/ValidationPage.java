package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationPage {
	
	//initialization
		public ValidationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			}
		// 'this' keyword holds the address of the 'ValidationPage ' start executing

		
		//Declaration
		@FindBy(xpath="//span[@id='dtlview_Organization Name']")
		private WebElement orgValidate;
		

		//getter methods
		public WebElement getOrgValidate() {
			return orgValidate;
		}


		//Business Logics
		public String validateOrgname()
		{
			return orgValidate.getText();
			
		}	
}