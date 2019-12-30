import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");

        // Instantiate a ChromeDriver class.
		WebDriver driver=new ChromeDriver();

        // Launch Website
		driver.get("http://www.google.com/");
		System.out.println("Open the google website on browser");

		//Maximize the browser  
		driver.manage().window().maximize();
		System.out.println("Maximize the browser window");

		// Click on the Search button  
		driver.findElement(By.name("q")).sendKeys("Java Selenium");
		System.out.println("Send Java selenium in Google Search Box");

		// Wait for 5 seconds
		Thread.sleep(5000);
		System.out.println("Wait for 5 seconds");

		// Close the driver
		driver.quit();
		System.out.println("Close the browser");

	}

}
