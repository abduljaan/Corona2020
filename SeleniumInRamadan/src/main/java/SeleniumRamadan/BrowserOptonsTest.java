package SeleniumRamadan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOptonsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(BrowserOptions.getChoreOptions());
		driver.get("http://www.google.com");
	String title = 	driver.getTitle();
	System.out.println("page title is " +title);
        
	}

}
