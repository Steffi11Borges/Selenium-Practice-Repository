package InterviewExamples;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example1 {

	public static void main(String[] args) {
		// 04-06-2023
		
				//Launching browser
         //WebDriver driver= new ChromeDriver();
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
 		driver.get("https://www.zeptonow.com/");

				Dimension di = new Dimension(200, 300);
				driver.manage().window().setSize(di);
				
				Point po = new Point(400, 200);
				driver.manage().window().setPosition(po);
				             
	}

}
