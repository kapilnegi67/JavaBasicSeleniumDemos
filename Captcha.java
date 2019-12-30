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
public class Captcha {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@name,'a-')]")));
		driver.findElement(By.id("recaptcha-anchor")).click();
//		Thread.sleep(50000);
//		driver.quit();

	}

}
