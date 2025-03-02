package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliwIthSvg {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("svg[class='gb_F']")).click();
		
	Screen src=new Screen();
	
	Pattern play=new Pattern("./PlayIcon.png");
	
	src.click(play);
	}

}
