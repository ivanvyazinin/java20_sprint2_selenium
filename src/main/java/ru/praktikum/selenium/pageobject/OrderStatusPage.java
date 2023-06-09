package ru.praktikum.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class OrderStatusPage {
    WebDriver webDriver;

    public OrderStatusPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By notFoundContainer = By.xpath(".//div[@class='Track_NotFound__6oaoY']");

    public void checkNotFoundContainer(){
        boolean isDisplayed  = webDriver.findElement(notFoundContainer).isDisplayed();
        assertTrue(isDisplayed);
    }
}
