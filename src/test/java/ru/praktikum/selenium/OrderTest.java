package ru.praktikum.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static ru.praktikum.selenium.config.AppConfig.APP_URL;

public class OrderTest {
    WebDriver webDriver;

    @Test
    public void checkSearchOfInvalidOrder() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.get(APP_URL);
        webDriver.findElement(By.className("Header_Link__1TAG7")).click();
        webDriver.findElement(By.xpath(".//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")).sendKeys("123");
        webDriver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']")).click();
        var isDisplayed = webDriver.findElement(By.xpath(".//div[@class='Track_NotFound__6oaoY']")).isDisplayed();
        assertTrue(isDisplayed);
    }

    @After
    public void clean(){
        webDriver.quit();
    }
}
