package com.andersenlab;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.diary.WebDriverSettings;
import tests.base.BaseTest;

import java.time.Duration;

import static Constants.Constant.Urls.ANDERSEN_HOME_PAGE;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class andersenlabTest extends BaseTest {
    @Test
    public void test1() throws InterruptedException {
        basePage.open(ANDERSEN_HOME_PAGE);

        andersenHome
                .clickFinancialServicesBtn()
                .checkFinancialTitle();
        basePage.open(ANDERSEN_HOME_PAGE);

        andersenHome
                .clickDiscussProjectBtn()
                .clickCloseDiscussProjectBtn()
                .clickCookiesBtn()
                .clickTeamAugmentationBtn();
        andersenFindDevelopers
                .checkTitleFindDevelopers()
                .clickConsultationBtn()
                .clickCloseConsultationBtn()
                .clickGameBtn()
                .clickCloseGameBtn()
                .clickVueBtn()
                .clickVueBtn()
                .clickVueBtn()
                .checkTitleFindDevelopers();
    }
    @Test
    public void test2() throws InterruptedException {
        basePage.open(ANDERSEN_HOME_PAGE);

        andersenHome
                .clickBackEndBtn()
                .checkBackEndBtnText()
                .clickFrontEndBtn()
                .checkFrontEndBtnText()
                .clickMobileBtn()
                .checkMobileBtn()
                .clickAndroidBtn();
        andersenAndroidApp
                .checkAndroidTitle()
                .clickRequestBtn()
                .checkRequestTitle()
                .clickCloseRequestBtn()
                .clickSkypeBtn()
                .checkSkypeTitle();
    }
}
