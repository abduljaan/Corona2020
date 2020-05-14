package SeleniumRamadan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDropDownValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
		
		driver.get("https://facebook.com");
		
	// get all the values
	//select a value
	List<WebElement> wl =	driver.findElements(By.xpath("//select[@id='month']/optios"));
		int totalmonty = wl.size();
		
		for (int i =0; i<totalmonty;i++) {
		String totlamonths =	wl.get(i).getText();
			System.out.println(totlamonths);
			
			
		}
	}

}
