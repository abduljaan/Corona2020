package MouseMovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
			
		//driver.get("http://www.Mrbool.com");
		driver.get("http://makemytrip.com");
		
		//*[@id="SW"]/div[2]/div[2]/div/div/nav/ul/li[10]/a/span[2]/span[1]
		
		  Thread.sleep(2000); 
		  Actions acton = new Actions(driver);
		  //acton.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		  
		  acton.moveToElement(driver.findElement(By.xpath("//*[@id=\"SW\"]/div[2]/div[2]/div/div/nav/ul/li[10]/a/span[2]/span[1]"))).build().perform();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("International Hotels")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//ul[@class='submenu']//li//a//[text()='Articles']")).click();
		 * 
		 * Thread.sleep(2000);
		 * //driver.findElement(By.xpath("//*[@id=\'headermenudesktop\']/ul/li/ul/a")).
		 * driver.findElement(By.linkText("Courses")).click();
		 */
		  Thread.sleep(2000);
		 
	}
	

	

}
