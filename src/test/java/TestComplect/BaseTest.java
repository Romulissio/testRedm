package TestComplect;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import utils.ConfigProperties;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    public WebDriver setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().
                implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
        return driver;
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
