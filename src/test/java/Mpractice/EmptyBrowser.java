package Mpractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {

	public static void main(String[] args) {
		
	WebDriver driver;
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	
	}

}
