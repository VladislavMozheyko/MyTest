package com.andersenlab;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.diary.WebDriverSettings;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class andersenlabTest extends WebDriverSettings {
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://andersenlab.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        Actions actions=new Actions(driver);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement icon= driver.findElement(By.xpath("//div[@class='slick-slide slick-active slick-current']"));
        js.executeScript(("arguments[0].scrollIntoView(true);"),icon);
        actions.moveToElement(icon).click().build().perform();
        String title= driver.getTitle();
        Assert.assertTrue(title.equals("Andersen is a perfect choice for custom software development"));
        driver.get("https://andersenlab.com/");
        Thread.sleep(1000);
        WebElement button=driver.findElement(By.xpath("//button[@class='button-module--button--P1TTA button-module--fullWidthMobile--NWml4 IndexPageTitle-module--button--OGFHt']"));
        actions.moveToElement(button).click().build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='calendly-popup-close']")));
        WebElement closeButton= driver.findElement(By.xpath("//div[@class='calendly-popup-close']"));
        wait.until(ExpectedConditions.visibilityOf(closeButton));
        actions.moveToElement(closeButton).click().build().perform();
        WebElement cookieButton= driver.findElement(By.xpath("//button[@class='button-module--button--P1TTA button-module--sizeSM--CuRl3 CookiesPolicy-module--button--JZrW1']"));
        actions.moveToElement(cookieButton).click().build().perform();
        WebElement button2= driver.findElement(By.xpath("//a[@class='CardCollaborationModel-module--item--wOlqm CardCollaborationModel-module--light--SsJCn']"));
        js.executeScript(("arguments[0].scrollIntoView(true);"),button2);
        actions.moveToElement(button2).click().build().perform();
        Thread.sleep(2000);
        String title2= driver.getTitle();
        Assert.assertTrue(title2.equals("Get qualified software developers & engineers"));
        WebElement button3= driver.findElement(By.xpath("//button[@class='button-module--button--P1TTA button-module--fullWidthMobile--NWml4 TitleWith-module--button--MLopd']"));
        js.executeScript(("arguments[0].scrollIntoView(true);"),button3);
        wait.until(ExpectedConditions.visibilityOf(button3));
        actions.moveToElement(button3).click().build().perform();
        WebElement closeButton2= driver.findElement(By.xpath("//div[@class='calendly-popup-close']"));
        wait.until(ExpectedConditions.visibilityOf(closeButton2));
        actions.moveToElement(closeButton2).click().build().perform();
        WebElement gameButton= driver.findElement(By.xpath("//div[@class='radioButton-module--title--PagnF']"));
        js.executeScript(("arguments[0].scrollIntoView(true);"),gameButton);
        wait.until(ExpectedConditions.elementToBeClickable(gameButton));
        actions.moveToElement(gameButton).click().build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='CloseButton-module--closeIcon--wOdet']")));
        WebElement gameCloseButton= driver.findElement(By.xpath("//button[@class='CloseButton-module--closeIcon--wOdet']"));
        actions.moveToElement(gameCloseButton).click().build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='CounterBox-module--button--HSafK CounterBox-module--plus--RpHab CounterBox-module--active--iz0mu']")));
        WebElement valueButton= driver.findElement(By.xpath("//button[@class='CounterBox-module--button--HSafK CounterBox-module--plus--RpHab CounterBox-module--active--iz0mu']"));
        js.executeScript(("arguments[0].scrollIntoView(true);"),valueButton);
        actions.moveToElement(valueButton).click().click().click().build().perform();
        Assert.assertTrue(title2.equals("Get qualified software developers & engineers"));

    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://andersenlab.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(1000);
        Actions actions=new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Tag-module--tag--TLAxy CvSlider-module--filterTag--FffVn']")));
        WebElement element= driver.findElement(By.xpath("//div[@class='Tag-module--tag--TLAxy CvSlider-module--filterTag--FffVn']"));
        String elementText=element.getText();
        js.executeScript(("arguments[0].scrollIntoView(true);"),element);
        actions.moveToElement(element).click().build().perform();
        Assert.assertEquals(elementText,"Back-end");
        WebElement element2= driver.findElement(By.xpath("//div[@class='Tag-module--tag--TLAxy CvSlider-module--filterTag--FffVn'][2]"));
        actions.moveToElement(element2).click().build().perform();
        String elementText2=element2.getText();
        Assert.assertEquals(elementText2,"Front-end");
        WebElement button = driver.findElement(By.xpath("//div[text()='Mobile'][1]"));
        js.executeScript(("arguments[0].scrollIntoView(true);"),button);
        wait.until(ExpectedConditions.elementToBeClickable(button));
        actions.moveToElement(button).click().build().perform();
        String message= button.getText();
        Assert.assertEquals(message,"Mobile");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"technologies\"]/div/div[2]/div/div/div/div/div[6]/div/a")));
        WebElement androidButton= driver.findElement(By.xpath("//*[@id=\"technologies\"]/div/div[2]/div/div/div/div/div[6]/div/a"));
        wait.until(ExpectedConditions.elementToBeClickable(androidButton));
        Thread.sleep(1000);
        actions.moveToElement(androidButton).click().build().perform();
        WebElement main=driver.findElement(By.id("gatsby-announcer"));
        wait.until(ExpectedConditions.textToBePresentInElement(main,"Navigated to Android App Development Services"));
        String title= main.getText();
        Assert.assertEquals(title,"Navigated to Android App Development Services");
        WebElement button2=driver.findElement(By.xpath("//button[@class='button-module--button--P1TTA button-module--fullWidthMobile--NWml4 TitleWith-module--button--MLopd']"));
        js.executeScript(("arguments[0].scrollIntoView(true);"),button2);
        wait.until(ExpectedConditions.elementToBeClickable(button2));
        Thread.sleep(1000);
        actions.moveToElement(button2).click().build().perform();
        Thread.sleep(1000);
        WebElement Text=driver.findElement(By.xpath("//h3[@class='title-module--title--xW-ym requestConsultation-module--title--8RtjR title-module--h3--7ZSHu title-module--black--GTgMQ']"));
        String text=Text.getText();
        Assert.assertEquals(text,"Request specialists");
        WebElement closeButton=driver.findElement(By.xpath("//button[@class='CloseButton-module--close--4GI9o CloseButton-module--themeDark--Gr8Dp']"));
        actions.moveToElement(closeButton).click().build().perform();
        WebElement skypebutton=driver.findElement(By.xpath("//a[@class='SocialMediaButtons-module--link--crhiA']"));
        js.executeScript(("arguments[0].scrollIntoView(true);"),skypebutton);
        actions.moveToElement(skypebutton).click().build().perform();
        js.executeScript(("window.location='https://join.skype.com/aM8R4P4dNJdy'"));
        String skypeTitle=driver.getTitle();
        Assert.assertTrue(skypeTitle.equals("Присоединение к беседе"));

    }
}
