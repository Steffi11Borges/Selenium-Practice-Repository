package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createnewaccdropdown {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();

		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

                WebElement daydrop = driver.findElement(By.id("day"));
                Select seld=new Select(daydrop);//object creation //sel space then select
                
               // seld.selectByIndex(27);
               // seld.selectByValue("28");
                seld.selectByVisibleText("28");
                
                
			 	WebElement monthdrop = driver.findElement(By.id("month"));
			 	Select selm=new Select(monthdrop);
			 	//selm.selectByIndex(0);
                //selm.selectByValue("1");
                selm.selectByVisibleText("Jan");


			 	
			 	WebElement yeardrop = driver.findElement(By.id("year"));
			 	Select sely=new Select(yeardrop);
			 	//sely.selectByIndex(0);
                //sely.selectByValue("1994");
                sely.selectByVisibleText("1994");
	}

}
