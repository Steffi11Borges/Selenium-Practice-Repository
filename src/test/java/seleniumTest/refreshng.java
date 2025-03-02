package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class refreshng {
	@Test
	public void test() {
		
	WebDriver driver;
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
			
	driver.get("http://www.amazon.in/");

	driver.navigate().to("https://www.amazon.in/s?k=bible&crid=1IRLK9DG5P6EF&sprefix=bible%2Caps%2C228&ref=nb_sb_noss_2");

	driver.navigate().refresh();
	}
}
