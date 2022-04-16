package pages.andersen;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.time.Duration;

public class AndersenAndroidApp extends BasePage {
    Actions actions=new Actions(driver);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    @FindBy(id = "gatsby-announcer")
    private WebElement titleAndroidPage;
    @FindBy(xpath = "//button[@class='button-module--button--P1TTA button-module--fullWidthMobile--NWml4 TitleWith-module--button--MLopd']")
    private WebElement requestBtn;
    @FindBy(xpath = "//h3[@class='title-module--title--xW-ym requestConsultation-module--title--8RtjR title-module--h3--7ZSHu title-module--black--GTgMQ']")
    private WebElement requestTitle;
    @FindBy(xpath = "//button[@class='CloseButton-module--close--4GI9o CloseButton-module--themeDark--Gr8Dp']")
    private WebElement requestCloseBtn;
    @FindBy(xpath = "//a[@class='SocialMediaButtons-module--link--crhiA']")
    private WebElement skypeBtn;

    public AndersenAndroidApp(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public AndersenAndroidApp checkAndroidTitle() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.textToBePresentInElement(titleAndroidPage,"Navigated to Android App Development Services"));
        String title=titleAndroidPage.getText();
        Assert.assertEquals(title,"Navigated to Android App Development Services");
        Thread.sleep(2000);
        return this;
    }
    public AndersenAndroidApp clickRequestBtn() throws InterruptedException {
        js.executeScript(("arguments[0].scrollIntoView(true);"),requestBtn);
        waitElementIsVisible(requestBtn);
        actions.moveToElement(requestBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenAndroidApp checkRequestTitle() throws InterruptedException {
        String requestText=requestTitle.getText();
        Thread.sleep(1000);
        Assert.assertEquals(requestText,"Request specialists");
        Thread.sleep(2000);
        return this;
    }
    public AndersenAndroidApp clickCloseRequestBtn() throws InterruptedException {
        waitElementIsVisible(requestCloseBtn);
        actions.moveToElement(requestCloseBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenAndroidApp clickSkypeBtn() throws InterruptedException {
        js.executeScript(("arguments[0].scrollIntoView(true);"),skypeBtn);
        waitElementIsVisible(skypeBtn);
        actions.moveToElement(skypeBtn).click().build().perform();
        js.executeScript(("window.location='https://join.skype.com/aM8R4P4dNJdy'"));
        Thread.sleep(2000);
        return this;
    }
    public AndersenAndroidApp checkSkypeTitle() throws InterruptedException {
        String skypeText=driver.getTitle();
        Assert.assertTrue(skypeText.equals("Присоединение к беседе"));
        Thread.sleep(1000);
        return this;
    }
}
