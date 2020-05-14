package MouseMovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
			
		//driver.get("http://www.Mrbool.com");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		
	WebElement rightclick= 	driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
	ac.contextClick(rightclick).build().perform();
	
	WebElement copy = 	driver.findElement(By.xpath("/html/body/ul/li[3]/span"));
	String cpy = copy.getText();
	System.out.println(cpy);
	copy.click();
		
		WebElement clicki=   driver.findElement(By.linkText("right click me"));
		clicki.click();
		
		  
		 // System.out.println("pop up msg ");
		  
		  
		  driver.quit();
		 
		
		
	}
		
		
		
				
		
		

	}


