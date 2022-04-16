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
import tests.base.BaseTest;

import java.time.Duration;
import java.util.Random;

import static Constants.Constant.Urls.DIARY_REGISTRATION_PAGE;

public class FirstTest extends BaseTest {
    @Test
    public void testVisibility() throws InterruptedException {
        basePage.open(DIARY_REGISTRATION_PAGE);
        diaryRegistrationPage
                .chekTitile()
                .fillUsername("Kuzma123%^45")
                .clearUserName()
                .fillEmail("Kuzma123*/.@mail.ru")
                .clearEmail()
                .clickToRegistration()
                .clickToRegistration();
    }

    @Test
    public void testRuEngLetters() throws InterruptedException {
        basePage.open(DIARY_REGISTRATION_PAGE);
        diaryRegistrationPage
                .chekTitile()
                .fillUsername("ValeraЖукин")
                .fillEmail("lobzikitutbili@mail.ru")
                .clickToRegistration()
                .clickToSignUpBtn()
                .errorMessage();

    }

    @Test
    public void testLogIn() throws InterruptedException {

        Random random = new Random();
        int a = random.nextInt(1000) + 1;
        basePage.open(DIARY_REGISTRATION_PAGE);
        diaryRegistrationPage
                .chekTitile()
                .fillUsername("Valera"+a)
                .fillEmail("valeratest"+a+"@mail.ru")
                .clickToRegistration()
                .clickToSignUpBtn()
                .registrationConfirmPage();

    }

    @Test
    public void testFailureLogIn1() throws InterruptedException {
        basePage.open(DIARY_REGISTRATION_PAGE);
        diaryRegistrationPage
                .chekTitile()
                .clickToSignUpBtn()
                .errorMessage();
    }

    @Test
    public void testFailureLogIn2() throws InterruptedException {
        basePage.open(DIARY_REGISTRATION_PAGE);
        diaryRegistrationPage
                .chekTitile()
                .fillUsername("Tuzikyaska123")
                .clickToSignUpBtn()
                .errorMessage();

    }

    @Test
    public void testFailureLogIn3() throws InterruptedException {
        basePage.open(DIARY_REGISTRATION_PAGE);
        diaryRegistrationPage
                .chekTitile()
                .fillUsername("Tuzikyaska123")
                .fillEmail("lolikahse@mail.ru")
                .clickToSignUpBtn()
                .errorMessage();

    }

    @Test
    public void testFailureLogIn4() throws InterruptedException {
        basePage.open(DIARY_REGISTRATION_PAGE);
        diaryRegistrationPage
                .chekTitile()
                .clickToRegistration()
                .fillEmail("lolikahse@mail.ru")
                .clickToSignUpBtn()
                .errorMessage();

    }
}