package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;

    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS );
        driver.get("https://www.pazarama.com/login");
    }

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeTest
    public void beforeMethod() {
        openBrowser();
    }

    @AfterTest
    public void afterMethod() {
    }
}
