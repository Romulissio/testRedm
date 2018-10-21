package PageObjRed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends GeneralMethods {

    public MainPage(WebDriver driver){
        super(driver);
    }

    @FindBy(className = "account-link-go")
    private WebElement acountGo;
    @FindBy (xpath = "//*[@id=\"superprocentcloseform\"]")
    private WebElement closeSpam;
    @FindBy (xpath = "//div[2]/div[2]/div/div[1]/div[3]/a[2]")
    private WebElement cityLocationButton;

    public AccountPage openAccounPage(){
        closeSpam.click();
        acountGo.click();
        return PageFactory.initElements(driver, AccountPage.class);
    }
    public CityLocationList openCityList(){
        cityLocationButton.click();
        return PageFactory.initElements(driver, CityLocationList.class);
    }

    @Override
    public void open(){
      driver.get("https://multivarka.pro");
    }

}