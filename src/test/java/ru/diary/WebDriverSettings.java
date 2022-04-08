package ru.diary;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverSettings {
    public ChromeDriver driver;
    public WebDriverWait wait;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:/Users/User/Downloads/chromedriver/chromedriver.exe");
        driver=new ChromeDriver();
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void close() {
        driver.quit();
    }
}
