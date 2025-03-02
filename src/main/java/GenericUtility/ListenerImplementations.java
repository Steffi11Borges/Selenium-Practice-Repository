 package GenericUtility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementations implements ITestListener{

	public void onTestFailure(ITestResult result) {
		// 30-06-2023	
		
String testData = result.getMethod().getMethodName();

  EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.Sdriver);
	 
 File src = edriver.getScreenshotAs(OutputType.FILE);
		 
		 try {
			 
			 FileUtils.copyFile(src, new File("./ScreenShot/"+testData+".png"));
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
			 
 }
	 
 }   
  
	