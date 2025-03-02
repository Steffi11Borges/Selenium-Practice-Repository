package Mpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliMiniBar {

	public static void main(String[] args) throws Throwable {


			Screen src=new Screen();
			
			Pattern minibar=new Pattern("C:\\Users\\Steffi\\Mproject\\MiniBar1.png");
			
			src.click(minibar);
	}

}
