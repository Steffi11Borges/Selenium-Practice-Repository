package OrganizationPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// 14-06-2023
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	// 'this' keyword holds the address of the 'LoginPage' start executing

	
	//Declaration
	@FindBy(name="user_name")
	private WebElement userTextField;
	
	@FindBy(name="user_password")
	private WebElement passWordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;

	//getter methods
	public WebElement getUserTextField() {
		return userTextField;
	}

	public WebElement getPassWordTextField() {
		return passWordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Business Logics
	public void loginToApp(String userName, String Password)
	{
		userTextField.sendKeys(userName);
		passWordTextField.sendKeys(Password);
		//loginButton.click();
	}
	
	
	}

 
