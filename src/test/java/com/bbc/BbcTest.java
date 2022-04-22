package com.bbc;

import org.junit.Test;
import tests.base.BaseTest;

import static Constants.Constant.Urls.BBC_HOME_PAGE;

public class BbcTest extends BaseTest {
    @Test
    public void authorizationVisibility() throws InterruptedException {
        basePage.open(BBC_HOME_PAGE);
        bbcAutorisation
                .pressSignInBtn()
                .checkTitle()
                .fillEmail("MarusyaTut2022@gmail.com")
                .fillPassword("Kuzya123456789")
                .clearEmail()
                .clearPassword();
    }

    @Test
    public void authorizationVisibilityWarning() throws InterruptedException {
        basePage.open(BBC_HOME_PAGE);
        bbcAutorisation
                .pressSignInBtn()
                .checkTitle()
                .fillEmail("КукушкинВася@mail.ru")
                .simpleClickPassword()
                .checkEmailErrorText();
    }

    @Test
    public void negativePasswordCheck() throws InterruptedException {
        basePage.open(BBC_HOME_PAGE);
        bbcAutorisation.pressSignInBtn();
        bbcRegistration
                .clickRegistrationBtn()
                .clickOrOverBtn()
                .fillBerthDay()
                .clickSubmitBtn()
                .fillPassword("лилудаллас")
                .clickPasswordSubmitBtn()
                .checkPasswordErrorText1()
                .clearPasswordField()
                .fillPassword("***")
                .clickPasswordSubmitBtn()
                .checkPasswordErrorText2()
                .clearPasswordField()
                .fillPassword("555555555555555555555555555555555555555555555555555")
                .clickPasswordSubmitBtn()
                .checkPasswordErrorText3()
                .clearPasswordField()
                .fillPassword("lobzikkolya")
                .clickPasswordSubmitBtn()
                .checkPasswordErrorText4()
                .clearPasswordField()
                .fillPassword("1928374648")
                .clickPasswordSubmitBtn()
                .checkPasswordErrorText5()
                .clearPasswordField()
                .fillPassword("!@#$%^&*()")
                .clickPasswordSubmitBtn()
                .checkPasswordErrorText6()
                .clearPasswordField()
                .fillPassword("1 % p W 1 * ) @ j W")
                .clickPasswordSubmitBtn()
                .checkTitleOfRegistration();
    }
}
