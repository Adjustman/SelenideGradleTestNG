import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;

public class MainTests extends BaseTest{

  //  MainPage mainPage = new MainPage();

    @BeforeTest
    public void closePopup() {
        new MainPage().openMainPage()
                .popupYesBtnClick();

    }

    @Test
    public  void checkMenu() {
        new MainPage().openMainPage()
                .menuBtnClick()
                .checkMenuText("ОСОБИСТИЙ КАБІНЕТ");
    }

    @Test
    public  void checkMenuSingInBtn() {
        new MainPage().openMainPage()
                .menuBtnClick()
                .checkMenuSignInBtn();
    }

    @Test
    public  void checkMenuAboutUsLink() {
        new MainPage().openMainPage()
                .menuBtnClick()
                .clickAboutUsLink()
                .checkTitle();

    }
}
