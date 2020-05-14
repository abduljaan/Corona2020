package SeleniumRamadan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
		
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.amazon.com");
		
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
	System.out.println(driver.getTitle()
			);	
				
		
		
		
		

	}

}
