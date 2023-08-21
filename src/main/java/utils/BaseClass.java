package utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected WebDriver driver;
	protected static String url = "https://demoblaze.com/";

	
	@BeforeClass
    public void setUp() {
        try {
            WebDriverManager.chromedriver().clearDriverCache();
            WebDriverManager.chromedriver().browserVersion("116").setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
            driver.get(url);
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.err.println("Error during test setup: " + e.getMessage());
            tearDown(); 
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	
	public static void javaScriptClick(WebElement element, WebDriver ldriver) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) ldriver;
		TimeUnit.SECONDS.sleep(2);
		jse.executeScript("arguments[0].click();", element);
	}
}
