package MouseMovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
			
		//driver.get("http://www.Mrbool.com");
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement sourceElement= driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));
		Actions acton = new  Actions(driver);
		acton.clickAndHold(sourceElement).moveToElement(Target).release().perform();
		
		
		

	}

}
