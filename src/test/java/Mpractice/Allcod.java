package Mpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allcod {
	//20-01-2025
	//WebDriver Methods

	public static void main(String[] args) throws Throwable {
		//launching empty browser 
      
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
				
		//launching app
		//driver.get("http://www.amazon.in/");
	
		/* driver.navigate().to("https://www.amazon.in/s?k=bible&crid=1IRLK9DG5P6EF&sprefix=bible%2Caps%2C228&ref=nb_sb_noss_2");

		driver.navigate().refresh();
		
		driver.navigate().forward();
		
		driver.navigate().back();
		
		String  data=driver.getTitle(); //object creation 
        System.out.println(data);
        
        driver.manage().window().maximize();
        
        driver.manage().window().minimize(); //here not working

        driver.manage().window().fullscreen();
        
       String data1=driver.getPageSource();
       System.out.println(data1);  
       
       String data2=driver.getCurrentUrl();
       System.out.println(data2);*/
       
     /* driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bible");
       driver.navigate().refresh();
       driver.findElement(By.name("field-keywords")).sendKeys("Jesus");
       driver.findElement(By.id("nav-search-dropdown-card")).click();
      driver.findElement(By.className("hm-icon-label")).click();
      
      driver.findElement(By.linkText("Best Sellers")).click();
      driver.findElement(By.partialLinkText("Best S")).click();
      
      // here id is # in css selector and for class .
      driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("cross");
     // driver.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("cross");*/

   // driver.findElement(By.cssSelector("[class='a-declarative nav-progressive-attribute']")).click();

      /*
     driver.get("https://demo.actitime.com/login.do");
     
     driver.findElement(By.id("cookie-button--got-it")).click();
     
     driver.findElement(By.id("FirstName")).sendKeys("steffi");
     
     driver.findElement(By.id("confirm-button")).click();*/


//driver.quit();
        //driver.close();
        
       //driver.get("https://blinkit.com/s/");

		//driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']" )).sendKeys("chocholate");

	/*	driver.get("https://www.flipkart.com/");
      // driver.findElement(By.xpath("//div[text()='My Cart']")).click();
		//driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("ice"); 
//after optimizing
		//driver.findElement(By.xpath("//input[contains(@class,'P')]")).sendKeys("icecream");
        //driver.findElement(By.xpath("//input[@class='Pke_EE' and @name='q']")).sendKeys("icecream");
		
		//driver.findElement(By.xpath("//input[@class='Pke_EE' or @name='q']"));
        
        WebElement search=driver.findElement(By.xpath("//input[@class='Pke_EE' or @name='q']"));
        search.sendKeys("icecream");
        search.submit();
        */
		
		/*
		driver.get("https://www.facebook.com/");
		
		 WebElement fontsize=driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
		 String data=fontsize.getCssValue("font-size");
		 System.out.println(data);
		 
		 String data3=fontsize.getCssValue("font-weight");
		 System.out.println(data3);

		 String data1=fontsize.getCssValue("color");
	       System.out.println(data1);
	        
	       String data2=fontsize.getCssValue("background-color");
	       System.out.println(data2);
		 
      WebElement color=driver.findElement(By.id("email"));
       String data4=color.getCssValue("color");
       System.out.println(data4);
        
       String data5=color.getCssValue("background-color");
       System.out.println(data5);
       
       WebElement dataloc=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
     org.openqa.selenium.Point location = dataloc.getLocation();// not getting RT as Point 
       System.out.println(location.getX());
       System.out.println(location.getY());
       System.out.println(location);
       
      org.openqa.selenium.Rectangle rect=dataloc.getRect();
      System.out.println(rect.getX());
      System.out.println(rect.getY());
      System.out.println(rect.getHeight());
      System.out.println(rect.getWidth());
      System.out.println(rect.getDimension());
      System.out.println(rect.getPoint());
      System.out.println(rect);

      
      Dimension dimen = dataloc.getSize();
      System.out.println(dimen.getHeight());
      System.out.println(dimen.getWidth());
      System.out.println(dimen);

     WebElement loca=driver.findElement(By.name("pass"));
     org.openqa.selenium.Point locc=loca.getLocation();
     System.out.println(locc);*/

		/*driver.get("https://www.flipkart.com/");
		
	WebElement	sear=driver.findElement(By.name("q"));
	sear.sendKeys("iphone13");
	sear.submit();

	WebElement	text=driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Starlight, 128 GB)']"
			+ "/ancestor::div[@class='yKfJKb row']"
			+ "/descendant::div[text()='₹44,999']"));

 String mobtext = text.getText();
 System.out.println(mobtext);

 WebElement	actionclick=driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Starlight, 128 GB)']"));
 actionclick.click();*/
 
	//driver.get("https://www.facebook.com/");
		 
/* WebElement actclear=driver.findElement(By.id("email"));
 actclear.sendKeys("steffi");
 actclear.clear();*/
	
	/*
WebElement isdis=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//WebElement isdis=driver.findElement(By.xpath("//img[contains(@class,'fb_logo _8ilh img')]"));
if(isdis.isDisplayed()) 
{
	 System.out.println("yes displayed");

	}
else {
	 System.out.println("not displayed");

}

 WebElement	isEn=driver.findElement(By.id("email"));
 if(isEn.isEnabled())
 {
	 isEn.sendKeys("Steffi");
 }
 else
 {
	 System.out.println("not enabled");
 }
	*/
 
		/*
 driver.get("https://getcssscan.com/css-checkboxes-examples");
 
WebElement issel=driver.findElement(By.xpath("//input[@id='example-1']"));
 
issel.click();
 if(issel.isSelected()) 
 {
 	 System.out.println("yes checked");

 	}
 else {
 	 System.out.println("not checked");

 }*/
	
		//driver.get("https://www.facebook.com/");
		 
		/* WebElement att=driver.findElement(By.id("email"));
		  //String attname = att.getAttribute("class");
		 	 System.out.println(att.getAttribute("class"));
		 	 
		 	//String tagname = att.getTagName();
			 	 System.out.println(att.getTagName());

				//String eletype = att.getAriaRole();
			 	 System.out.println(att.getAriaRole());

			 	//String accname = att.getAccessibleName();
			 	 System.out.println(att.getAccessibleName());

			 	att.sendKeys("steffi");
			 	 System.out.println(att.getDomAttribute("name"));
			 	 
			 	 System.out.println(att.getDomProperty("name"));*/
		
		//driver.get("https://www.flipkart.com/");
 /*
		//printing all links
          List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
         int count=0;
          for(WebElement webele:alllinks)
        {
	    System.out.println(webele.getText());
         count++; 
         }
		 	
        System.out.println(count);*/
		
		
		/*
		//auto suggestion
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("bluetooth");
	 	List<WebElement> autosug = driver.findElements(By.tagName("li"));
        
        for(WebElement list:autosug)
        {
        	if(list.getText().contains(" oneplus"))
        	{
                System.out.println(list.getText());
                Thread.sleep(1000);
                list.click();
                break;
        	}
        }
        */
		
		//driver.get("https://www.facebook.com/");
		/*driver.findElement(By.id("email")).sendKeys("steffi");  //1st method
		WebElement dkeys = driver.findElement(By.id("pass"));
		dkeys.sendKeys("Borges");
		dkeys.sendKeys(Keys.ENTER);*/
		
		//driver.findElement(By.id("email")).sendKeys("steffi",Keys.ENTER); 
		
		//driver.findElement(By.id("email")).sendKeys("Steffi",Keys.TAB,"Borges",Keys.ENTER);
		
		/*driver.findElement(By.xpath("//a[text()='Create new account']")).click();

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
*/
		
	/*	//Robot class
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("steffi");  //1st method
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);

        r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_C);
        
        r.keyPress(KeyEvent.VK_TAB);      
        r.keyRelease(KeyEvent.VK_TAB);
        
        r.keyPress(KeyEvent.VK_CONTROL);
     	r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
         
        */
		
		//driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//*[name()='svg' and @class='gb_F']")).click();
     
		/*driver.get("https://www.flipkart.com/");
        WebElement movetoele = driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']"));
		
		Actions act=new Actions(driver); 
		//act.moveToElement(movetoele).perform();
		act.contextClick(movetoele).perform();
		
		act.contextClick().perform();*/
		
		
		
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

               WebElement daydrop = driver.findElement(By.id("day"));
                daydrop.click();
                daydrop.sendKeys(Keys.ARROW_DOWN);
                daydrop.sendKeys(Keys.ARROW_DOWN);
                daydrop.sendKeys(Keys.ARROW_UP);

                
			 	WebElement monthdrop = driver.findElement(By.id("month"));
			 	monthdrop.click();
			 	monthdrop.sendKeys(Keys.ARROW_DOWN);
			 	monthdrop.sendKeys(Keys.ARROW_DOWN);
			 	monthdrop.sendKeys(Keys.ARROW_UP);

			 	
			 	WebElement yeardrop = driver.findElement(By.id("year"));
			 	yeardrop.click();
			 	yeardrop.sendKeys(Keys.ARROW_DOWN);
			 	yeardrop.sendKeys(Keys.ARROW_UP);*/
		
		/*
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions acttActions=new Actions(driver);
		acttActions.doubleClick(doubleclick).perform();*/
		
		/*
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions dragdrop=new Actions(driver);
		//dragdrop.dragAndDrop(drag, drop).perform();
		
		dragdrop.clickAndHold(drag).perform();
		dragdrop.release(drop).perform();
		*/
		
		driver.get("https://www.facebook.com/");
        WebElement un = driver.findElement(By.id("email"));
        WebElement psw = driver.findElement(By.id("pass")) ;
        WebElement log = driver.findElement(By.name("login"));
		
		Actions acts=new Actions(driver);
		acts.sendKeys(un, "steffi").sendKeys(psw, "borges").sendKeys(log).build().perform();
	
}
}
