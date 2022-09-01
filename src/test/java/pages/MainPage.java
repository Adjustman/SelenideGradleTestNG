package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    SelenideElement popupYesBtn = $(".yes");
    SelenideElement menuBtn = $(".menu-btn");
    SelenideElement menuText = $(".mob_container > div.menu-block > div");
    SelenideElement singInBtn = $(".menu-block > a");
    SelenideElement aboutUsLink = $("a:nth-of-type(8)");


    public MainPage openMainPage(){
        open(baseUrl);
        return this;
    }
    public MainPage popupYesBtnClick(){
        popupYesBtn.shouldBe(visible).click();
        return this;

    }

    public MainPage menuBtnClick() {
        menuBtn.shouldBe(visible).click();
        return this;

    }

    public void checkMenuText(String text) {
        menuText.shouldHave(text(text));

    }

    public void checkMenuSignInBtn() {
        singInBtn.shouldBe(visible).shouldBe(exist);
    }

    public AboutUsPage clickAboutUsLink() {
        aboutUsLink.shouldBe(visible).click();
        return new AboutUsPage();
    }
}
