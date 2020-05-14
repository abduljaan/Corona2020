package SeleniumRamadan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
			
		driver.get("https://www.skyscanner.co.in/ ");
		//driver.get("https://www.piac.com.pk");
		
		
		/*
		 * Thread.sleep(2000); driver.manage().window().maximize();
		 * //driver.findElement(By.id("depart-fsc-datepicker-button")).click();
		 * driver.findElement(By.id("popup")).click();
		 * driver.findElement(By.linkText("Schedules")).click(); Thread.sleep(2000);
		 * driver.findElement(By.type("text")).click(); Thread.sleep(2000);
		 * 
		 * Select slt = new Select(driver.findElement(By.xpath(
		 * "//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/select)(\"dpd3")));
		 * slt.selectByIndex(20);
		 */
		
		
		 
		
		  driver.findElement(By.id("recaptcha-anchor")).click(); WebElement wb=
		  driver.findElement(By.xpath(
		  "//*[@id=\'depart-fsc-datepicker-popover\']/div/div/div[2]/div/table/tbody/tr[3]/td[3]/button"
		  )); Select slct = new Select(wb); slct.selectByIndex(5);
		 
		
		
		
		
		
		
		

	}

}
