import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
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
		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions cc_Options = new ChromeOptions();
		cc_Options.addArguments("--headless");
		cc_Options.merge(capabilities);
		WebDriver driver = new ChromeDriver(cc_Options);
		driver.get("https://cacert.org/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
