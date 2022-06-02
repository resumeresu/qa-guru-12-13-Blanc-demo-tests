package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.MainPage;

public class MainPageTest extends BaseTest {

    MainPage mainPage = new MainPage();

    @BeforeEach
    void openMainPage() {
        MainPage.openMainPage();
    }

    @Test
    @DisplayName("Check personal account tooltip content")
    void personalAccountTooltipTest() {
        mainPage.hoverOnPersonalAccountButton()
                .checkTooltipIsVisible()
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
    @DisplayName("Going to the submit form by clicking the 'create an account' button")
    void clickCreateAccount() {
        mainPage.clickCreateAccount()
                .checkChatText()
                .checkPhoneNumberInputIsVisible()
                .checkPhoneNumberInputIsFocused();
    }

    @Test
    @DisplayName("Going to the submit form by clicking the 'create an account' button in the header")
    void clickCreateAccountFromHeader() {
        mainPage.scrollToTariffInfo()
                .checkCreateButtonIsShownInHeader()
                .clickCreateButtonHeader()
                .checkChatText()
                .checkPhoneNumberInputIsVisible()
                .checkPhoneNumberInputIsFocused();
    }

    @Test
    @DisplayName("Enter the phone number and check if 'submit' button appears")
    void enterThePhoneNumber() {
        mainPage.clickCreateAccount()
                .enterPhoneNumber()
                .checkSubmitButtonVisible()
                .checkSubmitButtonHasText();
    }

    @Test
    @DisplayName("Close personal account tooltip by clicking outside the tooltip (failed test example")
    void closePersonalAccountTooltipByOutsideClick() {
        mainPage.clickPersonalAccountButton()
                .checkTooltipIsVisible()
                .clickOutsideTooltip()
                .checkTooltipIsHidden();
    }

    @Test
    @Disabled("Disabled test example")
    @DisplayName("Check 'send' button appears when typed in some text in the feedback form")
    void sendButtonAppearsWhenTypedInMessageText() {
        mainPage.scrollDownToFeatures()
                .typeInSomeText()
                .checkSendButtonAppears();
    }

}
