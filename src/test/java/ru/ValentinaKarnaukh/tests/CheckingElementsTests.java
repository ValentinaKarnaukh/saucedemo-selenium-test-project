package ru.ValentinaKarnaukh.tests;

import org.junit.jupiter.api.Test;
import ru.ValentinaKarnaukh.pages.LoginPage;

public class CheckingElementsTests extends BaseTest{
    @Test
    void ElementTest() {
        new LoginPage(driver)
                .enterLogin(username)
                .enterPassword(password)
                .clickLoginButton()
                .checkInventoryPageURL()
                .checkCartOnThePage()
                .clickCartButton()
                .clickCheckoutButton()
                .checkCheckoutStepOnePageURL()
                .checkHeaderTitle()
                .checkFirstnameTitle()
                .checkLastnameTitle()
                .checkPostalCodeTitle()
                .checkCancelButton()
                .checkContinueButton()
                .checkCartButton()
                .checkLogo()
                .checkFooterRobot()
                .checkFooterText()
                .clickOpenReactMenuButton()
                .checkAllItemsInReactMenu()
                .checkAboutInReactMenu()
                .checkResetInReactMenu()
                .checkLogoutInReactMenu()
                .clickCloseReactMenuButton()
                .goLogout();
    }
}
