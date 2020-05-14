package SeleniumRamadan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/SeleniumInRamadan/Drivers/chromedriver.exe");
		
		driver.get("https://facebook.com");
		
		
		  WebElement month=driver.findElement(By.id("month"));
		  
		  WebElement day=driver.findElement(By.id("day")); 
		  WebElement year=driver.findElement(By.id("year"));
		 
		  Select slect = new Select(month);
		System.out.println(slect.isMultiple()) ;

		
		
		/*
		 * Select slect = new Select(month); 
		 * Select slect1 = new Select(day); 
		 * 
		 * Select slec2t = new Select(year); slect.selectByIndex(4);
		 * slect1.selectByVisibleText("20"); slec2t.selectByVisibleText("2000"); Object
		 * selectmagic;
		 */
		/*
		 *  Select test = new Select(year);
		 List<WebElement> alllist = test.getOptions();
		for (int a =0; a<alllist.size();a++) {
		String days=	alllist.get(a).getText();
		System.out.println(days);
		
		 * */ 
		 // getallvalues()
		  DropDownHandle dd=new DropDownHandle();
		  System.out.println("total number of years");
	       dd.getallvalues(year);
	       System.out.println("total number of months");
		  dd.getallvalues(month);
		  dd.getallvalues(day);
			
		}

		/*
		  DropDownHandle dd=new DropDownHandle();
		 *  dd.selectmagic(year, "2010");
		 * dd.selectmagic(day, "22");
		 *  dd.selectmagic(month,"Aug"); 
		 *  dd.selectmagic1(year,
		 * 15);
		 */
	//driver.quit();
	
	//Select slect = new Select(month);
	

				
			
	
	public static void  selectmagic(WebElement element, String value) {
		Select slct= new Select(element);
			slct.selectByVisibleText(value);
			
			Select slct1= new Select(element);
			slct1.selectByVisibleText(value);
			
			Select slct2= new Select(element);
			slct2.selectByVisibleText(value);
			
		/*
		 * Select slct1=new Select(element); slct1.selectByValue(value);
		 * 
		 * Select slct2=new Select(element); slct2.selectByValue(value);
		 */
	}
	
	public static void  selectmagic1(WebElement element, int index) {
		Select slct4= new Select(element);
			slct4.selectByIndex(index);
	/*
	 * 
	 * 
	 * */
	}	

	
	public static void getallvalues(WebElement element) {
		Select test = new Select(element);
		 List<WebElement> alllist = test.getOptions();
		for (int a =0; a<alllist.size();a++) {
		String days=	alllist.get(a).getText();
		System.out.println(days);
		
	}
	}
	}
