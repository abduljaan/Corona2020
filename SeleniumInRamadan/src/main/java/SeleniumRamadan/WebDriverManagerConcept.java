package SeleniumRamadan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		// no need to setup .exe file for chrome or firfox
		// boni gracia
		
		//WebDriverManager.chromiumdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new gicodriver()
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com ");
		
	}

}
