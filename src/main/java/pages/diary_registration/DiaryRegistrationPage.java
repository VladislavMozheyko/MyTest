package pages.diary_registration;
import org.junit.Before;
import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.base.BasePage;

public class DiaryRegistrationPage extends BasePage {
    private static final Logger logger= LoggerFactory.getLogger(DiaryRegistrationPage.class);
    Actions actions=new Actions(driver);
    @FindBy(id="signupform-username")
    private WebElement userName;
    @FindBy(id="signupform-email")
    private WebElement email;
    @FindBy(id="chk_box_user_confirm")
    private WebElement registrationBtn;
    @FindBy(id="signup_btn")
    private WebElement signUpBtn;
    @FindBy(id="registration_form")
    private WebElement errorText;
    @FindBy(id="page-c")
    private WebElement registrationConfirm;
    public DiaryRegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }
    public DiaryRegistrationPage fillUsername(String setUsername) throws InterruptedException {
        waitElementIsVisible(userName);
       actions.moveToElement(userName).click().sendKeys(setUsername).build().perform();
        Thread.sleep(2000);
        return this;
    }
    public DiaryRegistrationPage fillEmail(String setEmail) throws InterruptedException {
        waitElementIsVisible(email);
        actions.moveToElement(email).click().sendKeys(setEmail).build().perform();
        Thread.sleep(2000);
        return this;
    }
    public DiaryRegistrationPage clickToRegistration() throws InterruptedException {
        waitElementIsVisible(registrationBtn);
        actions.moveToElement(registrationBtn).click().build().perform();
        Thread.sleep(1000);
        return this;
    }
    public DiaryRegistrationPage clearUserName() throws InterruptedException {
        userName.clear();
        logger.info("User name field cleared.");
        Thread.sleep(1000);
        return this;
    }
    public DiaryRegistrationPage clearEmail() throws InterruptedException {
        email.clear();
        logger.info("Email field cleared.");
        Thread.sleep(1000);
        return this;
    }
    public DiaryRegistrationPage chekTitile() throws InterruptedException {
        String title=driver.getTitle();
        Assert.assertTrue(title.equals("Регистрация — @дневники: асоциальная сеть"));
        logger.info("Title check complete");
        Thread.sleep(1000);
        return this;
    }
    public DiaryRegistrationPage clickToSignUpBtn() throws InterruptedException {
        actions.moveToElement(signUpBtn).click().build().perform();
        Thread.sleep(2000);
        return this;
    }
    public DiaryRegistrationPage errorMessage(){
        String error=errorText.getText();
        logger.error(error);
        return this;
    }
    public DiaryRegistrationPage registrationConfirmPage() throws InterruptedException {
        waitElementIsVisible(registrationConfirm);
        Thread.sleep(2000);
        return this;
    }

}
