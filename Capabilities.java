import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 */

/**
 * @author kapilnegi
 *
 */
public class Capabilities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("version", 78);
		WebDriver driver = new ChromeDriver(capabilities);
		System.out.println("Capabilities = " + capabilities);
		driver.quit();

	}

}
