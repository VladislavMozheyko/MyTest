package pages.Bbc;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.base.BasePage;

public class BbcRegistration extends BasePage {
    Actions actions=new Actions(driver);
    @FindBy(xpath = "//span[text()='Register now']")
    private WebElement registrationBtn;
    @FindBy(xpath = "//a[@data-bbc-container='register'][2]")
    private WebElement orOverBtn;
    @FindBy(id = "dateOfBirthDay-label")
    private WebElement day;
    @FindBy(id = "month-input")
    private WebElement month;
    @FindBy(id = "year-input")
    private WebElement year;
    @FindBy(id = "submit-button")
    private WebElement submitBtn;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitPasswordBtn;
    @FindBy(id = "form-message-password")
    public WebElement errorMessageOfPasswordField;

    public BbcRegistration(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public BbcRegistration clickRegistrationBtn() throws InterruptedException {
        waitElementIsVisible(registrationBtn);
        actions.moveToElement(registrationBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public BbcRegistration clickOrOverBtn() throws InterruptedException {
        waitElementIsVisible(orOverBtn);
        actions.moveToElement(orOverBtn).click().perform();
        Thread.sleep(2000);
        return this;
    }
    public BbcRegistration fillBerthDay() throws InterruptedException {
        waitElementIsVisible(day);
        actions.moveToElement(day).click().sendKeys("19")
                .moveToElement(month).click().sendKeys("11")
                .moveToElement(year).click().sendKeys("1989").build().perform();
        Thread.sleep(2000);
        return this;
    }
    public BbcRegistration clickSubmitBtn() throws InterruptedException {
        waitElementIsVisible(submitBtn);
        actions.moveToElement(submitBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public BbcRegistration fillPassword(String passwordText) throws InterruptedException {
        waitElementIsVisible(passwordField);
        actions.moveToElement(passwordField).click().sendKeys(passwordText).build().perform();
        Thread.sleep(1000);
        return this;
    }
    public BbcRegistration clickPasswordSubmitBtn() throws InterruptedException {
        waitElementIsVisible(submitPasswordBtn);
        actions.moveToElement(submitPasswordBtn).click().build().perform();
        Thread.sleep(1000);
        return this;
    }
    public BbcRegistration checkPasswordErrorText1() throws InterruptedException {
        waitElementIsVisible(errorMessageOfPasswordField);
        String error=errorMessageOfPasswordField.getText();
        Assert.assertEquals(error,"Извините, этот пароль недействителен. Пожалуйста, включите одну букву.");
        Thread.sleep(1000);
        return this;
    }
    public BbcRegistration checkPasswordErrorText2() throws InterruptedException {
        waitElementIsVisible(errorMessageOfPasswordField);
        String error2=errorMessageOfPasswordField.getText();
        Assert.assertEquals(error2,"Извините, этот пароль слишком короткий. В нём должно быть не менее 8 символов.");
        Thread.sleep(1000);
        return this;
    }
    public BbcRegistration checkPasswordErrorText3() throws InterruptedException {
        waitElementIsVisible(errorMessageOfPasswordField);
        String error3=errorMessageOfPasswordField.getText();
        Assert.assertEquals(error3,"Извините, этот пароль слишком длинный. В нём должно быть не более 50 символов.");
        Thread.sleep(1000);
        return this;
    }
    public BbcRegistration checkPasswordErrorText4() throws InterruptedException {
        waitElementIsVisible(errorMessageOfPasswordField);
        String error4=errorMessageOfPasswordField.getText();
        Assert.assertEquals(error4,"Извините, этот пароль недействителен. Пожалуйста, включите что-нибудь, кроме букв.");
        Thread.sleep(1000);
        return this;
    }
    public BbcRegistration checkPasswordErrorText5() throws InterruptedException {
        waitElementIsVisible(errorMessageOfPasswordField);
        String error5=errorMessageOfPasswordField.getText();
        Assert.assertEquals(error5,"Извините, этот пароль недействителен. Пожалуйста, включите одну букву.");
        Thread.sleep(1000);
        return this;
    }
    public BbcRegistration checkPasswordErrorText6() throws InterruptedException {
        waitElementIsVisible(errorMessageOfPasswordField);
        String error6=errorMessageOfPasswordField.getText();
        Assert.assertEquals(error6,"Извините, этот пароль недействителен. Пожалуйста, включите одну букву.");
        Thread.sleep(1000);
        return this;
    }
    public BbcRegistration clearPasswordField() throws InterruptedException {
        waitElementIsVisible(passwordField);
        passwordField.clear();
        Thread.sleep(1000);
        return this;
    }
    public BbcRegistration checkTitleOfRegistration() throws InterruptedException {
        String title=driver.getTitle();
        Assert.assertTrue(title.equals("BBC – Register – enter your details"));
        Thread.sleep(2000);
        return this;
    }
}
