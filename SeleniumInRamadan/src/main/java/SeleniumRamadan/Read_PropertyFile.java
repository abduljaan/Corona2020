package SeleniumRamadan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_PropertyFile {

	static WebDriver driver; // declared webdriver as class level
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("src/main/java/ConfigurationPackage/config.properties");
		prop.load(file);
		
System.out.println(prop.getProperty("browser"));
   String browsername =   prop.getProperty("browser");
   
   if (browsername.equalsIgnoreCase("chrome")) {
	   System.out.println("browser is :"+browsername);
	   
	   WebDriverManager.chromiumdriver().setup();
	   driver = new ChromeDriver();
	   
	   
   }
   else if(browsername.equalsIgnoreCase("ff")) {
	   WebDriverManager.firefoxdriver().setup();
	   driver = new FirefoxDriver();
	   
   }
   else if(browsername.equalsIgnoreCase("ie")) {
	   WebDriverManager.iedriver().setup();
	   driver = new InternetExplorerDriver();
   } else {
	   System.out.println("No such driver exists");
   }
   
   driver.get(prop.getProperty("appurl2"));
  // driver.get(prop.getProperty(browsername));
   Thread.sleep(6000);
   driver.findElement(By.id("username")).sendKeys(prop.getProperty("uname"));
   driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
	}
	
	

}
