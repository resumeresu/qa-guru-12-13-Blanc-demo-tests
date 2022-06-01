package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.MainPage;

public class MainPageTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @BeforeAll
    static void openMainPage() {
        MainPage.openMainPage();
    }

    @Test
    @DisplayName("Check personal account tooltip content")
    void personalAccountTooltipTest() {
        mainPage.hoverOnPersonalAccountButton()
                .checkTooltipText()
                .checkQRIsDisplayed();
    }

    @Test
    @DisplayName("Check exchange rate tooltip shows exchange rates for CNY, GBP, CHF")
    void exchangeRateTooltipTest() {
        mainPage.hoverOnExchangeRateTooltip()
                .checkExchangeRateTooltipShowsCurrencies();
    }

    @Test
    @DisplayName("Open and close the sidebar")
    void openAndCloseSidebar() {
        mainPage.openSideBar()
                .closeSideBar()
                .checkSideBarClosed();
    }

    @Test
    @DisplayName("Click 'create an account' button")
    void clickCreateAccount() {
        mainPage.clickCreateAccount()
                .checkChatText();
    }


}
