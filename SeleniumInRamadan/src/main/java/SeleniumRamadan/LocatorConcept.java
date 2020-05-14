package SeleniumRamadan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		// 7 locators 
		//1 id. 2. name 2. xpath 4. css selector 5. class name 
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
	
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("what is the date tody");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[2]/div/div[2]")).click();
		
		driver.navigate().back();
		
		

	}

}
