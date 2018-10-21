package PageObjRed;

import org.openqa.selenium.WebDriver;

public abstract class GeneralMethods {

    protected WebDriver driver;

    public GeneralMethods(WebDriver driver) {
        this.driver = driver;
    }
    public abstract void open();
}

