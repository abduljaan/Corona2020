package SeleniumRamadan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
		
		driver.get("https://www.google.com");
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().fullscreen();
		driver.manage().getCookieNamed("name");
		String url =driver.getCurrentUrl();
		System.out.println("current url is :" +url);
		if(url.equalsIgnoreCase("https://www.google.com/")) {
			System.out.println("Test passed");
		}else {
			System.out.println("test fail");
		}
		
	String pg=	driver.getPageSource();
		System.out.println("page source :"+pg);
		
		
		driver.close();
		
		

	}

}
