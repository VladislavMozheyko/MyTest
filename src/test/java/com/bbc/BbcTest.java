package com.bbc;

import net.bytebuddy.implementation.bytecode.ShiftLeft;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.diary.WebDriverSettings;
import tests.base.BaseTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static Constants.Constant.Urls.BBC_HOME_PAGE;

public class BbcTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {
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
    public void test2() throws InterruptedException {
        basePage.open(BBC_HOME_PAGE);
        bbcAutorisation
                .pressSignInBtn()
                .checkTitle()
                .fillEmail("КукушкинВася@mail.ru")
                .simpleClickPassword()
                .checkEmailErrorText();
    }

    @Test
    public void test3() throws InterruptedException {
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
