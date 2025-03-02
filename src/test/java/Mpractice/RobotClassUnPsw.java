package Mpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClassUnPsw {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();

		//Robot class
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("steffi");  //1st method
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);

        r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_C);
        
        r.keyPress(KeyEvent.VK_TAB);      
        r.keyRelease(KeyEvent.VK_TAB);
        
        r.keyPress(KeyEvent.VK_CONTROL);
     	r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
         
        
	}

}
