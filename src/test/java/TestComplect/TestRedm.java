package TestComplect;


import PageObjRed.AccountPage;
import PageObjRed.CityLocationList;
import PageObjRed.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestRedm  extends BaseTest{

        private MainPage page = PageFactory.initElements(setup(), MainPage.class);
        private AccountPage accountPage;
        private CityLocationList cityLocationList;

        @Test
        public void shouldOpenScreenshotToolLink() throws InterruptedException {
            page.open();
            accountPage = page.openAccounPage();
            accountPage.incorectLoginUser();
            Assert.assertEquals(accountPage.getTextElement(), "Неверный логин или пароль");
        }
        @Test
        public void testCity() throws InterruptedException {
            page.open();
            cityLocationList = page.openCityList();
            cityLocationList.autoClickElement(cityLocationList.listCityesRUS());

        }
    }
