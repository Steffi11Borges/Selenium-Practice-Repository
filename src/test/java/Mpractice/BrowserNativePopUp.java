package Mpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNativePopUp {

	public static void main(String[] args) {
		EdgeOptions options=new EdgeOptions();
		options.addArguments("inPrivate");

			WebDriver driver;
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver(options);
			
			driver.get("https://www.zeptonow.com/");

				
	}

}
