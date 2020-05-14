package SeleniumRamadan;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// launch browser   Chrome
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
		//FileInputStream file = new  FileInputStream ();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("ala bal")) {
			System.out.println("correct");
		}
		else {
			System.out.println("pass");
		}
			
			
		
		System.out.println("Current title of the page is : "+title);
		driver.findElement(By.name("firstname")).sendKeys("abdul");
		driver.findElement(By.name("lastname")).sendKeys("quddus");
		driver.close();
		
		
		
		
		
	}

}
