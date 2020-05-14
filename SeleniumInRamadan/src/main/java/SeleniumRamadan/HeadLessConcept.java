package SeleniumRamadan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessConcept {
	
	public static void main(String[]arays) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions cmop = new ChromeOptions();
		
		cmop.addArguments("--headless");
		WebDriver driver = new ChromeDriver(cmop);
		driver.get("http://www.google.om");
		
		System.out.println("Current urls"+driver.getTitle());
		
		
		
	}

}
