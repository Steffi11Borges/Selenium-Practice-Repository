package seleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollupDown {

	public static void main(String[] args) throws AWTException {

		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("https://www.zeptonow.com/");
		
        Robot r=new Robot();	
        
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);

        
        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);

        r.keyPress(KeyEvent.VK_PAGE_DOWN);
        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        r.keyPress(KeyEvent.VK_PAGE_UP);
        r.keyRelease(KeyEvent.VK_PAGE_UP);

        
        r.keyPress(KeyEvent.VK_PAGE_UP);
        r.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}
