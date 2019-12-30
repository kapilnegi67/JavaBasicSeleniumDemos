import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author kapilnegi
 *
 */
public class BrowserCommands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");

		WebDriver driver=new ChromeDriver();

		driver.get("http://www.seleniumframework.com/demo-sites/");

		String pageTitle = driver.getTitle();
		System.out.println("Page Title = " + pageTitle);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL = " + currentUrl);

		String pageSource = driver.getPageSource();
		System.out.println("Current Page Source = " + pageSource);

		driver.close();
		driver.quit();

	}

}
