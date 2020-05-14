package popupHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPoPUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
			
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Good PopUp #2")).click();
	Set<String>	 whandle =driver.getWindowHandles();
	Iterator <String> it=whandle.iterator();
	String mainwindowid = it.next();
	System.out.println("main window id is :"+mainwindowid);
	String childwindowid = it.next();
	System.out.println("Child window id is :"+childwindowid);
	//String childwindowids ="CDwindow-E05F66FED33FDC779B2777304214F310";
	driver.switchTo().window(childwindowid);
	String childwindowtitle =driver.getTitle();
	System.out.println("<childwindow title is> :"+childwindowtitle);
	if(childwindowtitle.equalsIgnoreCase("ala ala")) {
		System.out.println("pass");
	}else {
		System.out.println("could not verify title : test faild");
	}
	
	
		driver.close();
		
		driver.switchTo().window(mainwindowid); // driver will swich back to main window from child window 
		System.out.println("title of main page :"+driver.getTitle());
		driver.findElement(By.linkText("Good PopUp #3"));
	System.out.println("title of child page :"+driver.getTitle());	
		Thread.sleep(2000);
		driver.quit();


	}

}
