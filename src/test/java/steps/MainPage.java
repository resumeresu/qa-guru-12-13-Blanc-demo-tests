package steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
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
/*        $(".cta cta--secondary.flex-column")
                .$(".btn--hover-marketing").click();*/
        $(byText(" Открыть счёт "));
        return this;
    }

    @Step("Check 'create account chat text'")
    public MainPage checkChatText() {
/*        $("#openAccount").$(".chat")
                .shouldHave(text(OPEN_ACCOUNT_CHAT_TEXT));*/
        for (int i = 0; i <= OPEN_ACCOUNT_CHAT_TEXT.size() - 1; i++) {
            $("#openAccount").$(".chat")
                    .shouldHave(text(OPEN_ACCOUNT_CHAT_TEXT.get(i)));
        }
        return this;
    }
}
