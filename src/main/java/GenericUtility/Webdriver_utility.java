package GenericUtility;

import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_utility { 

	/**
	 * this method is used to maximize the screen
	 * 	@param driver
	 */
	
	public void maximizeScreen(WebDriver driver)
	{
	driver.manage().window().maximize();
	}
	
/**
 * this method is used to minimize the screen
 * 	@param driver
 */
	
	
	public void minimizeScreen(WebDriver driver)
	{
	//driver.manage().window().minimize();
	}
	
	/**
	 *wait for page to load before indentifying any sychronized element in DOM
       @author Steffi
	 * 
	 */
	
	public void implicitwait(WebDriver driver)
	{
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //version3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //version4
	}
	
	
	/**
	 * 
	 * 
	 */
	
	
	/**
	 *After every action it will for next action to perform
	 * @author Steffi
	 */
	
	public void scriptTimeOut(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
	}
	
	/**
	 * 
	 * Javascript executor
	 * @param driver
	 * @param partialText
	 * @throws InterruptedException 
	 */
	
	public void javaScriptExecutor(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<4;i++)
		{
			js.executeScript("window.scrollBy(0,229)");
			Thread.sleep(1000);
		}	
	}
	
	/*
	 * this method is used for switching window
	 * 
	 */
	public void switchWindow(WebDriver driver,String partialText)
	{
		Set<String> allWindows = driver.getWindowHandles();
		 Iterator<String> id = allWindows.iterator();
			while(id.hasNext())
		 {
			 String win = id.next();
			 driver.switchTo().window(win);
			 
			
			 String title = driver.getTitle();
			 
			 if(title.contains(partialText))
			 {
				 break;
			 }
			 }
	}

	
	/**
	 * 
	 * This method is used to perform action class
	 * 
	 */
	
	public void ActionsMoveToElement(WebDriver driver,WebElement ele)
	{
     Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
	}
	
	
	/**
	 * used to wait for element to be clickable in GUI and check for specific element for every 500 milliseconds
	 * 
	 */
	public void waitForElementWithCustomTimeOut(WebDriver driver,WebElement Element,int pollingTime)
	{
		FluentWait wait= new FluentWait(driver);
	    wait.pollingEvery(Duration.ofSeconds(20));	
	    wait.until(ExpectedConditions.elementToBeClickable(Element));
	}

	/**
	 * used to switch to any Window based on window title
	 * @param driver
	 * @param PartialWindowTitle
	 * @author Steffi
	 * 
	 */

	public void switchToWindow(WebDriver driver,String PartialWindowTitle)
	{
		  Set<String> allId = driver.getWindowHandles();
	      Iterator<String> it=allId.iterator();
	      while(it.hasNext())
	      {
	      	String wid = it.next();
	      	driver.switchTo().window(wid);
	      	if(driver.getTitle().contains(PartialWindowTitle))
	      	{
	      		break;
	      	}
	}}
	/**
	 *used to switch to AlertWindow and Accept(click on ok Button) 
	 *@param driver
	 *@author Steffi 
	 */
	public void switchToAlertAndAccpect(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

	/**
	 * used to switch to AlertWindow and dismiss(click on Cancel Button)
	 *  @param driver
	 * @author Steffi
	 */
	public void switchToAlertAndDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	
//	public void AlertAccept(WebDriver driver)
//	{
//		Alert alt= driver.switchTo().alert();
//		alt.accept();	
//	}
//	
	/**
	 * used to switch to frame window based on Index
	 * @param driver
	 * @param index
	 * @author Steffi
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
		}
	/**
	 * 
	 * used to switch to frame window based on id or name attribute
	 * @param driver
	 * @param id_name_attribute
	 * @author Steffi
	 */
	public void switchToFrame(WebDriver driver,String id_name_Attribute)
	{
	driver.switchTo().frame(id_name_Attribute);	
	}
	/**
	 * used to select the value from the dropDown based on index
	 * @param element
	 * @param index
	 * @author Steffi
	 */
	public void select(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * used to select the value from the dropDown based on text
	* @param element
	 * @param text
	 * @author Steffi
	 */
	public void select(WebElement element, String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}

	/**
	 * used to place mouse cursor on specified element
	 * @param driver
	 * @param element
	 * @author Steffi
	 * 
	 */
	public void mouseOverOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	/**
	 * used to right click on specific element
	 * @param driver
	 * @param element
	 * @author Steffi
	 */
	public void rightClickOnElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	
	public void moveByOffest(WebDriver driver,int x,int y)
	{
		Actions act=new Actions(driver);
		act.moveByOffset(x, y).click().perform();
	}
	
	public  String takeScreenshot(WebDriver sDriver, String methodName) {
		
		Date date=new Date();
		date.toString().replace(" "," ").replace(":","-");
		//TakesScreenshot ts=(TakesScreenshot)driver;
		return null;
	}
	
}

