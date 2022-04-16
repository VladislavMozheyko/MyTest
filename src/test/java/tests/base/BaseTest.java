package tests.base;

import Common.CommonActions;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import pages.Bbc.BbcAutorisation;
import pages.Bbc.BbcRegistration;
import pages.andersen.AndersenAndroidApp;
import pages.andersen.AndersenFindDevelopers;
import pages.andersen.AndersenHome;
import pages.base.BasePage;
import pages.diary_registration.DiaryRegistrationPage;

import static Common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected DiaryRegistrationPage diaryRegistrationPage = new DiaryRegistrationPage(driver);
    protected BbcAutorisation bbcAutorisation=new BbcAutorisation(driver);
    protected BbcRegistration bbcRegistration=new BbcRegistration(driver);
    protected AndersenHome andersenHome=new AndersenHome(driver);
    protected AndersenFindDevelopers andersenFindDevelopers=new AndersenFindDevelopers(driver);
    protected AndersenAndroidApp andersenAndroidApp=new AndersenAndroidApp(driver);

    @After
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}