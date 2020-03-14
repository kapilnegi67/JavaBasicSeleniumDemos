import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SavitriPhuleMouseOver {
	
	public static void main(String[] args) {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "/Users/kapilnegi/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.unipune.ac.in/");
		WebElement about_univ = driver.findElement(By.id("stUI5_txt"));

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(about_univ)
                .build();
        mouseOverHome.perform();

//        String bgColor = td_Home.getCssValue("background-color");
//        System.out.println("Before hover: " + bgColor);        
//        mouseOverHome.perform();        
//        bgColor = td_Home.getCssValue("background-color");
//        System.out.println("After hover: " + bgColor);
//
//        driver.get("https://www.facebook.com");
//        WebElement txtUsername = driver.findElement(By.id("email"));
//
//        Action seriesOfActions = builder
//        	.moveToElement(txtUsername)
//        	.click()
//        	.keyDown(txtUsername, Keys.SHIFT)
//        	.sendKeys(txtUsername, "hello")
//        	.keyUp(txtUsername, Keys.SHIFT)
//        	.doubleClick(txtUsername)
//        	.contextClick()
//        	.build();
//
//        seriesOfActions.perform() ;

        driver.quit();

	}

}
