package popupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertJSPoPup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
			
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
	Alert alrt = 	driver.switchTo().alert();
	String text = alrt.getText();
	System.out.println(text);
	
	if(text.equalsIgnoreCase("please enter")) {
		System.out.println("test passed");
	}else {
		System.out.println("test fail");
	}
	
	alrt.accept();

		
		/*
		 * WebElement mainlink= driver.findElement(By.className("menulink"));
		 * //driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 * Actions actn = new Actions(driver);
		 * actn.moveToElement(mainlink).build().perform();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement courselink= driver.findElement(By.linkText("COURSES"));
		 * actn.click(courselink).build().perform();
		 */
		
	}

}
