package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.tt.pageobjectmodel.Language;

public class TestApage extends BaseTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/SUNNY/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com");
		Language pm = new Language(driver);
		pm.spanish().click();
		pm.english().click();
		closebrowser();

	}

}
