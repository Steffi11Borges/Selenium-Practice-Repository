package Mpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpSwitching {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Windows.html");

        // Click on link and button to open new window
        driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click();
        driver.findElement(By.xpath("//button[.='click']")).click();

        // Store parent window
        String parentWindow = driver.getWindowHandle();

        // Get all windows
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            driver.switchTo().window(window);
            System.out.println("Window Title: " + driver.getTitle());
        }

        // Switch back to parent
        driver.switchTo().window(parentWindow);
        System.out.println("Back to parent window: " + driver.getTitle());

        driver.quit();
}
}


//driver.get("https://demo.automationtesting.in/Windows.html"); driver.findElement(By.xpath("//a[.='Open New Seperate Windows']")).click(); driver.findElement(By.xpath("//button[.='click']")).click(); 
//String win = driver.getWindowHandle(); 
//for (String window : win) 
//{ 
//driver.switchTo().window(window); 
//String title = driver.getTitle(); 
//System.out.println(title); 
//}
//
