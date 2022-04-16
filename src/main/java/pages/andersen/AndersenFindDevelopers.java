package pages.andersen;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.base.BasePage;

public class AndersenFindDevelopers extends BasePage {
    Actions actions=new Actions(driver);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    @FindBy(xpath = "//button[@class='button-module--button--P1TTA button-module--fullWidthMobile--NWml4 TitleWith-module--button--MLopd']")
    private WebElement consultationBtn;
    @FindBy(xpath = "//div[@class='calendly-popup-close']")
    private WebElement closeConsultationBtn;
    @FindBy(xpath = "//*[@id=\"calculator\"]/div/div[1]/section[3]/div[2]/div/div/article[9]/div/label/div")
    private WebElement gameBtn;
    @FindBy(xpath = "//button[@class='CloseButton-module--closeIcon--wOdet']")
    private WebElement closeGameBtn;
    @FindBy(xpath = "//*[@id=\"calculator\"]/div/div[1]/section[1]/div[3]/div[1]/div/article[1]/div[1]/div/button[2]")
    private WebElement vueBtn;


    public AndersenFindDevelopers(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public AndersenFindDevelopers checkTitleFindDevelopers() throws InterruptedException {
        String title= driver.getTitle();
        Assert.assertTrue(title.equals("Get qualified software developers & engineers"));
        Thread.sleep(2000);
        return this;
    }
    public AndersenFindDevelopers clickConsultationBtn() throws InterruptedException {
        js.executeScript(("arguments[0].scrollIntoView(true);"),consultationBtn);
        waitElementIsVisible(consultationBtn);
        actions.moveToElement(consultationBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenFindDevelopers clickCloseConsultationBtn() throws InterruptedException {
        waitElementIsVisible(closeConsultationBtn);
        actions.moveToElement(closeConsultationBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenFindDevelopers clickGameBtn() throws InterruptedException {
        js.executeScript(("arguments[0].scrollIntoView(true);"),gameBtn);
        waitElementIsVisible(gameBtn);
        actions.moveToElement(gameBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenFindDevelopers clickCloseGameBtn() throws InterruptedException {
        waitElementIsVisible(closeGameBtn);
        actions.moveToElement(closeGameBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public AndersenFindDevelopers clickVueBtn() throws InterruptedException {
        js.executeScript(("arguments[0].scrollIntoView(true);"),vueBtn);
        waitElementIsVisible(vueBtn);
        Thread.sleep(1000);
        actions.moveToElement(vueBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
}
