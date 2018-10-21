package trial.test.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class CityLocationTest {
    protected WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://multivarka.pro");
    }
    @Test
    public void testnumberone() throws InterruptedException {
        WebElement cityLocation = driver.findElement(By.xpath("//div[2]/div[2]/div/div[1]/div[3]/a[2]"));
        cityLocation.click();
        Thread.sleep(3000);
        WebElement cityList = driver.findElement(By.id("alphabeter1"));
        Thread.sleep(3000);
        List<String> spisik = new ArrayList<String>();
        List<WebElement> listCity = cityList.findElements(By.tagName("a"));
        for (WebElement element : listCity) {
            spisik.add(element.getText());
        }
        for (String element : spisik) {
            Thread.sleep(3000);
            driver.findElement(By.linkText(element)).click();
            Thread.sleep(6000);
            driver.findElement(By.cssSelector("body > div.layout > div.header > div.line-second > div > div.line-1 > div.right.country-city.hasLangs.russia_wrapper > a.city-link.popuper")).click();
            Thread.sleep(6000);
        }

    }
    @AfterTest
    public void tearDown()throws Exception{
        driver.quit();
    }















}
