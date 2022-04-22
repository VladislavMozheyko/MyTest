package pages.andersen;

import com.beust.ah.A;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;

public class AndersenHome extends BasePage {
    private static final Logger logger= LoggerFactory.getLogger(AndersenHome.class);
    Actions actions=new Actions(driver);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    @FindBy(xpath = "//*[@id=\"industries\"]/div/div/div/div/div/div/div[5]/div/a")
    private WebElement FinancialsServicesBtn;
    @FindBy(xpath = "//button[@class='button-module--button--P1TTA button-module--fullWidthMobile--NWml4 IndexPageTitle-module--button--OGFHt']")
    private WebElement discussProjectBtn;
    @FindBy(xpath = "//div[@class='calendly-popup-close']")
    private WebElement closeDiscussProjectBtn;
    @FindBy(xpath = "//button[@class='button-module--button--P1TTA button-module--sizeSM--CuRl3 CookiesPolicy-module--button--JZrW1']")
    private WebElement cookiesBtn;
    @FindBy(xpath = "//a[@class='CardCollaborationModel-module--item--wOlqm CardCollaborationModel-module--light--SsJCn']")
    private WebElement teamAugmentationBtn;
    @FindBy(xpath = "//*[@id=\"experts\"]/div/div[1]/div[3]")
    private WebElement backEndBtn;
    @FindBy(xpath = "//*[@id=\"experts\"]/div/div[1]/div[4]")
    private WebElement frontEndBtn;
    @FindBy(xpath = "//div[text()='Mobile'][1]")
    private WebElement mobileBtn;
    @FindBy(xpath = "//*[@id=\"technologies\"]/div/div[2]/div/div/div/div/div[6]/div/a")
    private WebElement androidBtn;

    public AndersenHome(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public AndersenHome clickFinancialServicesBtn() throws InterruptedException {
        js.executeScript(("arguments[0].scrollIntoView(true);"),FinancialsServicesBtn);
        waitElementIsVisible(FinancialsServicesBtn);
        Thread.sleep(2000);
        actions.moveToElement(FinancialsServicesBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome checkFinancialTitle() throws InterruptedException {
        String title= driver.getTitle();
        Assert.assertTrue(title.equals("Custom-Built Finance Solutions for Your Business-Specific Needs"));
        logger.info("Financial services page open.");
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome clickDiscussProjectBtn() throws InterruptedException {
        waitElementIsVisible(discussProjectBtn);
        actions.moveToElement(discussProjectBtn).click().build().perform();
        logger.info("Discuss window open.");
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome clickCloseDiscussProjectBtn() throws InterruptedException {
        waitElementIsVisible(closeDiscussProjectBtn);
        actions.moveToElement(closeDiscussProjectBtn).click().build().perform();
        logger.info("Discuss window close.");
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome clickCookiesBtn() throws InterruptedException {
        waitElementIsVisible(cookiesBtn);
        actions.moveToElement(cookiesBtn).click().build().perform();
        logger.info("Cookies accept.");
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome clickTeamAugmentationBtn() throws InterruptedException {
        js.executeScript(("arguments[0].scrollIntoView(true);"),teamAugmentationBtn);
        waitElementIsVisible(teamAugmentationBtn);
        actions.moveToElement(teamAugmentationBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome clickBackEndBtn() throws InterruptedException {
        js.executeScript(("arguments[0].scrollIntoView(true);"),backEndBtn);
        Thread.sleep(1000);
        actions.moveToElement(backEndBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome checkBackEndBtnText() throws InterruptedException {
        String backEndText=backEndBtn.getText();
        Assert.assertEquals(backEndText,"Back-end");
        logger.info("Back end button pressed.");
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome clickFrontEndBtn() throws InterruptedException {
        actions.moveToElement(frontEndBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome checkFrontEndBtnText() throws InterruptedException {
        String frontEndText=frontEndBtn.getText();
        Assert.assertEquals(frontEndText,"Front-end");
        logger.info("Front end button pressed.");
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome clickMobileBtn() throws InterruptedException {
        js.executeScript(("arguments[0].scrollIntoView(true);"),mobileBtn);
        Thread.sleep(2000);
        actions.moveToElement(mobileBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome checkMobileBtn() throws InterruptedException {
        String mobileBtnText=mobileBtn.getText();
        Assert.assertEquals(mobileBtnText,"Mobile");
        logger.info("Mobile button pressed.");
        Thread.sleep(2000);
        return this;
    }
    public AndersenHome clickAndroidBtn() throws InterruptedException {
        waitElementIsVisible(androidBtn);
        actions.moveToElement(androidBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
}
