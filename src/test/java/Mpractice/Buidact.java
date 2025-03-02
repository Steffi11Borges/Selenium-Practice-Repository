package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buidact {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();

		driver.get("https://www.facebook.com/");
        WebElement un = driver.findElement(By.id("email"));
        WebElement psw = driver.findElement(By.id("pass")) ;
        WebElement log = driver.findElement(By.name("login"));
		
		Actions acts=new Actions(driver);
		acts.sendKeys(un, "steffi").sendKeys(psw, "borges").sendKeys(log).build().perform();

	}

}
