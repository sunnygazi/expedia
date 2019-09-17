package Common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	public static String url = "https://www.expedia.com";
	public static WebDriver driver;

	public static void chromebrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/SUNNY/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void firefoxbrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/SUNNY/Desktop/geckodriver");
		driver = new FirefoxDriver();
		driver.get(url);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

//	@Test
//	public void ScrollByPixel() {
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		// This will scroll down the page by 1000 pixel vertical
//		js.executeScript("window.scrollBy(0,1000)");
//	}

	public static void closebrowser() {
		driver.close();
	}

	public static void quitbrowser() {
		driver.quit();
	}

}// end of class
