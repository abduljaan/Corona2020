package SeleniumRamadan;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapinSelenium {

	public static void main(String[] args) {
	// customer place an order
	//admin user can see all the orders 
	// seller user >>>
		System.out.println(credentials());
		
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 */
		
		

	}
	
	public static HashMap<String, String> credentials() {
		HashMap<String, String> usermap = new HashMap<String, String>();
		
		usermap.put("admin", "abduljan:Test123");
		usermap.put("distributer", "jan:Test123");
		usermap.put("seller", "abduljan:baboo222");
		usermap.put("deliverboy", "khano:Test123");
		return usermap;
	}

}
