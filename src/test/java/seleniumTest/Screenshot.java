package seleniumTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	@Test
	public void screenShot() throws Throwable
	{
	WebDriver driver;
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
			
	//launching app
	driver.get("http://www.amazon.in/");
	TakesScreenshot scn=(TakesScreenshot)driver;
	File scr = scn.getScreenshotAs(OutputType.FILE);
	 File dest = new File("FailedScript.png");
	FileUtils.copyFile(scr, dest);
	
	
	
}
 }
