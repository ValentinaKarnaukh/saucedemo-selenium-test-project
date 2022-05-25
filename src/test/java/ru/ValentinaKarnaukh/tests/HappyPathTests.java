package ru.ValentinaKarnaukh.tests;

import org.junit.jupiter.api.Test;
import ru.ValentinaKarnaukh.pages.LoginPage;

public class HappyPathTests extends BaseTest {

    @Test
    void happyPathTest() {
        new LoginPage(driver)
                .enterLogin(username)
                .enterPassword(password)
                .clickLoginButton()
                .checkInventoryPageURL()
                .checkCartOnThePage()
                .clickButtonAddBackPack()
                .clickCartButton()
                .checkCartPageURL()
                .checkBackpackOnTheCart()
                .clickCheckoutButton()
                .checkCheckoutStepOnePageURL()
                .enterFirstname(firstname)
                .enterLastname(lastname)
                .enterPostalCode(postalcode)
                .clickContinueButton()
                .checkCheckOutStepTwoRageURL()
                .checkBackpackOnOrder()
                .clickFinishButton()
                .checkCheckoutCompletePageURL()
                .checkCompleteMessage()
                .clickBackToProductButton()
                .checkInventoryPageURL()
                .goLogout();
    }
}

