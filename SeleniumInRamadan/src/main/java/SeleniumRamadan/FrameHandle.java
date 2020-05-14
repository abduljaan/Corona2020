package SeleniumRamadan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/");
		 driver.switchTo().frame(2);
		//driver.switchTo().frame("mail");
		
	//WebElement title =	driver.findElement(By.linkText("Title bar"));
	WebElement title =	driver.findElement(By.xpath("/html/body/h2"));
	
	System.out.println("title of frame is :"+title.getText());
	driver.switchTo().defaultContent();
	System.out.println(driver.getTitle());
	}

}
