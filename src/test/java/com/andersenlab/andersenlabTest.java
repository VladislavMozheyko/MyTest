package com.andersenlab;

import org.junit.Test;
import tests.base.BaseTest;

import static Constants.Constant.Urls.ANDERSEN_HOME_PAGE;

public class andersenlabTest extends BaseTest {
    @Test
    public void checkAnyVisualElementsCaseOne() throws InterruptedException {
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
    public void checkAnyVisualElementsCaseTwo() throws InterruptedException {
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
