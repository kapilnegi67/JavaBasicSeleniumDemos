import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");

        // Instantiate a ChromeDriver class.
		WebDriver driver=new ChromeDriver();

        // Launch Website
		driver.get("http://www.amazon.in/");
		System.out.println("Open the amazon website on browser");

		// Maximize the browser  
		driver.manage().window().maximize();
		System.out.println("Maximize the browser window");

		// Send Query to Amazon Search box 
		WebElement amazon_searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		amazon_searchbox.sendKeys("mobiles");
		System.out.println("Send Query mobiles to Amazon Search box");

		// Click on the search button
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		System.out.println("Click on search Icon");

		// Click on the first result
		driver.findElement(By.xpath("//div[@data-index='0']//span[@data-component-type='s-product-image']")).click();
		System.out.println("Click on first result");

		// Wait for 5 seconds
		Thread.sleep(5000);
		System.out.println("Wait for 5 seconds");

		// Close the driver
		driver.quit();
		System.out.println("Close the browser");

	}

}
