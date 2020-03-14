import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 */

/**
 * @author kapilnegi
 *
 */
public class BrowserDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");

		ChromeOptions cc_options = new ChromeOptions();
		cc_options.setPageLoadStrategy(PageLoadStrategy.NONE);

		// System Property for Firefox Driver
		System.setProperty("webdriver.gecko.driver", "/Users/kapilnegi/Downloads/geckodriver");
		FirefoxOptions ff_options = new FirefoxOptions();
		ff_options.setAcceptInsecureCerts(true);
		ff_options.setPageLoadStrategy(PageLoadStrategy.NONE);
		WebDriver driver = new FirefoxDriver(ff_options);
        // Instantiate a ChromeDriver class.
//		WebDriver driver=new ChromeDriver(options);

        // Launch Website
		driver.get("http://www.javatpoint.com/");
		System.out.println("Open the javatpoint website on browser");
		
		Thread.sleep(1000);

		//Maximize the browser  
		driver.manage().window().maximize();
		System.out.println("Maximize the browser window");
		Thread.sleep(1000);

       //Scroll down the webpage by 5000 pixels  
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 5000)");
		System.out.println("Scroll to the page End");
		Thread.sleep(1000);

		// Click on the Search button  
		driver.findElement(By.linkText("Core Java")).click();
		System.out.println("Click on Core Java link");
		Thread.sleep(1000);

		// Close the driver
		driver.quit();
		System.out.println("Close the browser");

	}

}
