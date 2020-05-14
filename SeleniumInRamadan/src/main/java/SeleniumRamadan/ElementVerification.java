package SeleniumRamadan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerification {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
	WebElement bttn = 	driver.findElement(By.id("submitButton"));
 System.out.println(bttn.isEnabled()); 
 System.out.println(bttn.isDisplayed());
 System.out.println(bttn.isSelected());
 
  WebElement checkbox = driver.findElement(By.name("agreeTerms"));
   System.out.println("checkbox status :"+ checkbox.isSelected());
   driver.close();
   }
	}


