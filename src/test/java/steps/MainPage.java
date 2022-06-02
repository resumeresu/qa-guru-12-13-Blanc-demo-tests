package steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static constants.MainPageText.*;

public class MainPage {

    @Step("Open the main page")
    public static void openMainPage() {
        Selenide.open("/");
    }

    @Step("Hover the mouse on personal account button")
    public MainPage hoverOnPersonalAccountButton() {
        $(byText("Личный кабинет")).hover();
        return this;
    }

    @Step("Click on personal account button")
    public MainPage clickPersonalAccountButton() {
        $(byText("Личный кабинет")).click();
        return this;
    }

    @Step("Click outside the personal account tooltip")
    public MainPage clickOutsideTooltip() {
        $(".header__nav").click();
        return this;
    }

    @Step("Check tooltip is visible")
    public MainPage checkTooltipIsVisible() {
        $("#active-tooltip").shouldBe(visible);
        return this;
    }

    @Step("Check tooltip is hidden")
    public MainPage checkTooltipIsHidden() {
        $("#active-tooltip").shouldNotBe(visible);
        return this;
    }


    @Step("Check tooltip text")
    public MainPage checkTooltipText() {
        $("#active-tooltip").shouldHave(text(ACCOUNT_TOOLTIP_TEXT));
        return this;
    }

    @Step("Check QR code is displayed")
    public MainPage checkQRIsDisplayed() {
        $(byAttribute("name", "marketing_lk-qr-code")).shouldBe(visible);
        return this;
    }

    @Step("Hover the mouse on exchange rate tooltip")
    public MainPage hoverOnExchangeRateTooltip() {
        $(".rate-dropdown__icon").hover();
        return this;
    }

    @Step("Check exchange rate tooltip shows certain currencies")
    public void checkExchangeRateTooltipShowsCurrencies() {
        $(".rate-dropdown__body").shouldBe(visible);
        for (int i = 0; i <= TOOLTIP_CURRENCIES.size() - 1; i++) {
            $(".rate-dropdown__body").shouldHave(text(TOOLTIP_CURRENCIES.get(i)));
        }
    }

    @Step("Click burger menu button to open the sidebar menu")
    public MainPage openSideBar() {
        $(".burger-btn").click();
        return this;
    }

    @Step("Close the sidebar")
    public MainPage closeSideBar() {
        $(".sidebar__close").click();
        return this;
    }

    @Step("Check the sidebar is closed")
    public void checkSideBarClosed() {
        $(".sidebar").shouldNotBe(visible);
    }

    @Step("Click 'create account' button")
    public MainPage clickCreateAccount() {
        $(".main")
                .$("button.btn-component")
                .$(".btn-component__inner").click();
        return this;
    }

    @Step("Check 'create account chat text'")
    public MainPage checkChatText() {
        $("#openAccount").$(".chat").shouldBe(visible);
        for (int i = 0; i <= OPEN_ACCOUNT_CHAT_TEXT.size() - 1; i++) {
            $("#openAccount").$(".chat")
                    .shouldHave(text(OPEN_ACCOUNT_CHAT_TEXT.get(i)));
        }
        return this;
    }

    @Step("Check phone number input is shown and has focus")
    public MainPage checkPhoneNumberInputIsVisible() {
        $("#phoneInputRegistration").shouldBe(visible);
        return this;
    }

    @Step("Check phone number input is shown and has focus")
    public void checkPhoneNumberInputIsFocused() {
        $("#phoneInputRegistration").shouldBe(focused);
    }

    @Step("Enter the phone number")
    public MainPage enterPhoneNumber() {
        $("#phoneInputRegistration").setValue("9998887766");
        return this;
    }

    @Step("Check 'submit' button has appeared")
    public MainPage checkSubmitButtonVisible() {
        $(byAttribute("type", "submit")).shouldBe(visible)
                .shouldHave(text("Отправить"));
        return this;
    }

    @Step("Check 'submit' button has certain text")
    public void checkSubmitButtonHasText() {
        $(byAttribute("type", "submit"))
                .shouldHave(text("Отправить"));
    }

    @Step("Scroll down to to tariff-info")
    public MainPage scrollToTariffInfo() {
        $(".main").$(".cta__animation").shouldBe(visible);
        $(".tariff-info__description").scrollIntoView(true);
        return this;
    }

    @Step("Check 'create account' button appears in the header")
    public MainPage checkCreateButtonIsShownInHeader() {
        $(".header__nav")
                .$(byText("Открыть счёт"))
                .shouldBe(visible);
        return this;
    }


    @Step("Click 'create account' button in the header")
    public MainPage clickCreateButtonHeader() {
        $(".header__nav").$(byText("Открыть счёт")).click();
        return this;
    }
}
