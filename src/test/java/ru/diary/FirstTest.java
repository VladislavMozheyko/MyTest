package ru.diary;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class FirstTest extends WebDriverSettings {
    @Test
    public void testVisibility() throws InterruptedException {
        driver.get("https://diary.ru/user/registration");
        String title = driver.getTitle();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("signupform-username"));
        WebElement element2 = driver.findElement(By.id("signupform-email"));
        WebElement element3 = driver.findElement(By.id("chk_box_user_confirm"));
        Assert.assertTrue(title.equals("Регистрация — @дневники: асоциальная сеть"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions.moveToElement(element).click().sendKeys("Kuzma123%^45").build().perform();
        Thread.sleep(1000);
        element.clear();
        Thread.sleep(1000);
        actions.moveToElement(element2).click().sendKeys("Kuzma123*/.@mail.ru").build().perform();
        Thread.sleep(1000);
        element2.clear();
        Thread.sleep(1000);
        actions.moveToElement(element3).click().build().perform();
        Thread.sleep(1000);
        actions.moveToElement(element3).click().build().perform();
        Thread.sleep(1000);
    }

    @Test
    public void testRuEngLetters() throws InterruptedException {
        driver.get("https://diary.ru/user/registration");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Регистрация — @дневники: асоциальная сеть"));
        driver.findElement(By.id("signupform-username")).sendKeys("ValeraЖукин");
        driver.findElement(By.id("signupform-email")).sendKeys("lobzikitutbili@mail.ru");
        driver.findElement(By.id("chk_box_user_confirm")).click();
        driver.findElement(By.id("signup_btn")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.id("registration_form"));
        String res = element.getText();
        System.out.println("Error: " + res);
        Thread.sleep(3000);
    }

    @Test
    public void testLogIn() {
        driver.get("https://diary.ru/user/registration");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Регистрация — @дневники: асоциальная сеть"));
        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("signupform-username")).sendKeys("Valera" + a);
        driver.findElement(By.id("signupform-email")).sendKeys("valeratest" + a + "@mail.ru");
        driver.findElement(By.id("chk_box_user_confirm")).click();
        driver.findElement(By.id("signup_btn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("page-c")));
    }

    @Test
    public void testFailureLogIn1() throws InterruptedException {
        driver.get("https://diary.ru/user/registration");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Регистрация — @дневники: асоциальная сеть"));
        driver.findElement(By.id("signup_btn")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("registration_form"));
        String res = element.getText();
        System.out.println("Error: " + res);
    }

    @Test
    public void testFailureLogIn2() throws InterruptedException {
        driver.get("https://diary.ru/user/registration");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Регистрация — @дневники: асоциальная сеть"));
        driver.findElement(By.id("signupform-username")).sendKeys("Tuzikyaska123");
        driver.findElement(By.id("signup_btn")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("registration_form"));
        String res = element.getText();
        System.out.println("Error: " + res);
    }

    @Test
    public void testFailureLogIn3() throws InterruptedException {
        driver.get("https://diary.ru/user/registration");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Регистрация — @дневники: асоциальная сеть"));
        driver.findElement(By.id("signupform-username")).sendKeys("Tuzikyaska123");
        driver.findElement(By.id("signupform-email")).sendKeys("lolikahse@mail.ru");
        driver.findElement(By.id("signup_btn")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("registration_form"));
        String res = element.getText();
        System.out.println("Error: " + res);
    }

    @Test
    public void testFailureLogIn4() throws InterruptedException {
        driver.get("https://diary.ru/user/registration");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Регистрация — @дневники: асоциальная сеть"));
        driver.findElement(By.id("chk_box_user_confirm")).click();
        driver.findElement(By.id("signupform-email")).sendKeys("lolikahse@mail.ru");
        driver.findElement(By.id("signup_btn")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.id("registration_form"));
        String res = element.getText();
        System.out.println("Error: " + res);
    }
    @Test
    public void test5(){
        driver.get("https://andersenlab.com/");
    }
}