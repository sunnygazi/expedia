package Common;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	
	public static String url = "https://www.expedia.com";
	public static WebDriver driver;

	
	
	
	
	public static void getBrowserG() {
		System.setProperty("webdriver.chrome.driver", "/Users/SUNNY/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	
	

	public static void getBrowserM() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/SUNNY/Desktop/geckodriver");
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	
	
}// end of class
