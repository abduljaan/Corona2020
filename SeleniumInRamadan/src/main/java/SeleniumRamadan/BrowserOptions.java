package SeleniumRamadan;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

	
	public static  ChromeOptions getChoreOptions() {
	
		ChromeOptions co = new ChromeOptions();
		
			co.addArguments("--start-maximized");
			co.addArguments("--ignore-certificate-error");
		    co.addArguments("--disable-pupup-blocking");
		    co.addArguments("--headless");
		    return co.addArguments("--incognito");
		 
		   
	}
	
	
	
	
	}


