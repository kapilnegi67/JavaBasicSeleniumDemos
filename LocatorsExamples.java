import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class LocatorsExamples {

	public static void main(String[] args) throws InterruptedException {
		// System Property for Chrome Driver
				System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");

				ChromeOptions cc_options = new ChromeOptions();
				cc_options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

//		         Instantiate a ChromeDriver class.
				WebDriver driver=new ChromeDriver(cc_options);

//		        // Launch Website
//				driver.get("https://www.google.com");
//
//				Thread.sleep(1000);
//
//				//Maximize the browser  
//				driver.manage().window().maximize();
//				Thread.sleep(1000);
//
//
//				driver.findElement(By.name("q")).sendKeys("selenium");
//				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//				Thread.sleep(3000);

				
				driver.get("https://in.msn.com");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				
				WebElement nextBtn = driver.findElement(By.xpath("//button[@title='Next Slide']"));
				System.out.println("Class = " + nextBtn.getAttribute("class"));
				for (int i = 0; i < 5; i++) {
					nextBtn.click();
				}
				WebElement previousBtn = driver.findElement(By.xpath("//button[@title='Previous Slide']"));
				System.out.println("Class = " + nextBtn.getAttribute("class"));
				for (int i = 0; i < 5; i++) {
					previousBtn.click();
				}
				// Close the driver
				driver.quit();
				System.out.println("Close the browser");
	}

}
