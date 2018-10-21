package PageObjRed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CityLocationList extends GeneralMethods{
    public CityLocationList(WebDriver driver){
        super(driver);
    }
    @FindBy(id = "alphabeter1")
    private WebElement popupCityesList;

    public List<String> listCityesRUS(){
        List<String> listNameCityRUS = new ArrayList<String>();
        List<WebElement> listCity = popupCityesList.findElements(By.tagName("a"));
        for (WebElement element : listCity) {
            listNameCityRUS.add(element.getText());
        }
        return listNameCityRUS;
    }
    public void autoClickElement(List<String> list){
        List<String> lists = listCityesRUS();
        for (String element : lists) {
            driver.findElement(By.linkText(element)).click();
            driver.findElement(By.xpath("//div[2]/div[2]/div/div[1]/div[3]/a[2]")).click();
        }
    }
    @Override
    public void open() {

    }
}
