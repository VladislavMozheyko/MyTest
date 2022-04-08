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

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BbcTest extends WebDriverSettings {
    @Test
    public void test() {
        driver.get("https://www.bbc.com/");
        Actions actions = new Actions(driver);
        driver.findElement(By.id("idcta-link")).click();
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("BBC – Sign in"));
        actions.moveToElement(email).click().sendKeys("MarusyaTut2022@gmail.com").build().perform();
        actions.moveToElement(password).click().sendKeys("Kuzya123456789").build().perform();
        email.clear();
        password.clear();
    }

    @Test
    public void test2() {
        driver.get("https://www.bbc.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions = new Actions(driver);
        driver.findElement(By.id("idcta-link")).click();
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        actions.moveToElement(email).click().sendKeys("КукушкинВася@mail.ru").build().perform();
        actions.moveToElement(password).click().build().perform();
        WebElement error = driver.findElement(By.xpath("//p[@class='form-message__text'][1]"));
        String message = error.getText();
        Assert.assertEquals(message, "Sorry, that email doesn’t look right. Пожалуйста, проверьте, правильность адреса электронной почты.");
    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("https://www.bbc.com/");
        driver.findElement(By.id("idcta-link")).click();
        driver.findElement(By.xpath("//span[text()='Register now']")).click();
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//a[@data-bbc-container='register'][2]"));
        actions.moveToElement(element).click().build().perform();
        Thread.sleep(3000);
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("dateOfBirthDay-label")));
        WebElement dayInput = driver.findElement(By.id("dateOfBirthDay-label"));
        WebElement mothInput = driver.findElement(By.id("month-input"));
        WebElement yearInput = driver.findElement(By.id("year-input"));
        WebElement button = driver.findElement(By.id("submit-button"));
        actions.moveToElement(dayInput).click().sendKeys("19").moveToElement(mothInput).click().sendKeys("11").moveToElement(yearInput).click().sendKeys("1989").build().perform();
        actions.moveToElement(button).click().build().perform();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        Thread.sleep(2000);
        actions.moveToElement(password).click().sendKeys("лилудаллас").build().perform();
        //wait.until(ExpectedConditions.textToBePresentInElement(password,"лилудаллас"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement error1 = driver.findElement(By.id("form-message-password"));
        String errorText = error1.getText();
        Assert.assertEquals(errorText,"Извините, этот пароль недействителен. Пожалуйста, включите одну букву.");
        System.out.println("Error: " + errorText);
        password.clear();
        String title = driver.getTitle();
        actions.moveToElement(password).click().sendKeys("***").build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Thread.sleep(2000);
        WebElement error2 = driver.findElement(By.id("form-message-password"));
        String errorText2 = error2.getText();
        Assert.assertEquals(errorText2,"Извините, этот пароль слишком короткий. В нём должно быть не менее 8 символов.");
        System.out.println("Error: " + errorText2);
        password.clear();
        actions.moveToElement(password).click().sendKeys("555555555555555555555555555555555555555555555555555").build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement error3 = driver.findElement(By.id("form-message-password"));
        String errorText3 = error3.getText();
        Assert.assertEquals(errorText3,"Извините, этот пароль слишком длинный. В нём должно быть не более 50 символов.");
        System.out.println("Error: " + errorText3);
        password.clear();
        actions.moveToElement(password).click().sendKeys("lobzikkolya").build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement error4 = driver.findElement(By.id("form-message-password"));
        String errorText4 = error4.getText();
        Assert.assertEquals(errorText4,"Извините, этот пароль недействителен. Пожалуйста, включите что-нибудь, кроме букв.");
        System.out.println("Error: " + errorText4);
        password.clear();
        actions.moveToElement(password).click().sendKeys("1928374648").build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement error5 = driver.findElement(By.id("form-message-password"));
        String errorText5 = error5.getText();
        Assert.assertEquals(errorText5,"Извините, этот пароль недействителен. Пожалуйста, включите одну букву.");
        System.out.println("Error: " + errorText5);
        password.clear();
        actions.moveToElement(password).click().sendKeys("!@#$%^&*()").build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement error6 = driver.findElement(By.id("form-message-password"));
        String errorText6 = error6.getText();
        Assert.assertEquals(errorText6,"Извините, этот пароль недействителен. Пожалуйста, включите одну букву.");
        System.out.println("Error: " + errorText6);
        password.clear();
        actions.moveToElement(password).click().sendKeys("1 % p W 1 * ) @ j W").build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Assert.assertTrue(title.equals("BBC – Register – enter your details"));


        //Тут данный тип пароля устраивает поле регистрации сайта bbc.com и она не выдает предупреждающего сообщения.

        //WebElement error7=driver.findElement(By.id("form-message-password"));
        //String errorText7=error7.getText();
        //Assert.assertEquals(errorText7,"");
        //System.out.println("Error: "+errorText7);

        Thread.sleep(3000);

    }
}
