package PageObjRed;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ConfigProperties;

public class AccountPage extends GeneralMethods {



    public AccountPage(WebDriver driver){
        super(driver);
    }

    @FindBy(name = "USER_LOGIN")
    private WebElement loginField;
    @FindBy(name = "USER_PASSWORD")
    private WebElement passField;
    @FindBy(xpath = "//*[@id=\"authform\"]/p")
    private WebElement allert;


    public void incorectLoginUser() throws InterruptedException {
        loginField.sendKeys(ConfigProperties.getProperty("log"));
        passField.sendKeys(ConfigProperties.getProperty("pass")+ Keys.ENTER);
        //Thread.sleep(3000);
    }
    public String getTextElement(){
        return allert.getText();
    }

    @Override
    public void open(){ }
}
