package pages.Bbc;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.base.BasePage;

public class BbcAutorisation extends BasePage {
    Actions actions=new Actions(driver);
    @FindBy(id="idcta-link")
    private WebElement signInBtn;
    @FindBy(xpath="//input[@type='email']")
    private WebElement email;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;
    @FindBy(xpath = "//p[@class='form-message__text'][1]")
    private WebElement emailError;

    public BbcAutorisation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public BbcAutorisation pressSignInBtn() throws InterruptedException {
        waitElementIsVisible(signInBtn);
        actions.moveToElement(signInBtn).click().build().perform();
        Thread.sleep(1000);
        return this;
    }
    public BbcAutorisation fillEmail(String setEmail) throws InterruptedException {
        waitElementIsVisible(email);
        actions.moveToElement(email).click().sendKeys(setEmail).build().perform();
        Thread.sleep(2000);
        return this;
    }
    public BbcAutorisation fillPassword(String setPassword) throws InterruptedException {
        waitElementIsVisible(password);
        actions.moveToElement(password).click().sendKeys(setPassword).build().perform();
        Thread.sleep(2000);
        return this;
    }
    public BbcAutorisation checkTitle(){
        String title= driver.getTitle();
        Assert.assertTrue(title.equals("BBC – Sign in"));
        return this;
    }
    public BbcAutorisation clearEmail() throws InterruptedException {
        email.clear();
        Thread.sleep(1000);
        return this;
    }
    public BbcAutorisation clearPassword() throws InterruptedException {
        password.clear();
        Thread.sleep(1000);
        return this;
    }
    public BbcAutorisation simpleClickPassword() throws InterruptedException {
        actions.moveToElement(password).click().build().perform();
        Thread.sleep(1000);
        return this;
    }
    public BbcAutorisation checkEmailErrorText(){
        String message=emailError.getText();
        Assert.assertEquals(message,"Sorry, that email doesn’t look right. Пожалуйста, проверьте, правильность адреса электронной почты.");
        return this;
    }
}
