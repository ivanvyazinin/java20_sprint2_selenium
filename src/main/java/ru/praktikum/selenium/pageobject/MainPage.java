package ru.praktikum.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static ru.praktikum.selenium.config.AppConfig.APP_URL;

public class MainPage {
    WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get(APP_URL);
    }

    private By orderStateButton = By.className("Header_Link__1TAG7");
    private By orderNumberInput = By.xpath(".//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
    private By goButton = By.xpath(".//button[@class='Button_Button__ra12g Header_Button__28dPO']");

    public MainPage clickOrderStateButton(){
        webDriver.findElement(orderStateButton).click();
        return this;
    }

    public MainPage writeOrderNumber(String order){
        webDriver.findElement(orderNumberInput).sendKeys(order);
        webDriver.findElement(orderNumberInput).sendKeys(order);
        return this;
    }

    public OrderStatusPage clickGoButton(){
        webDriver.findElement(goButton).click();
        return new OrderStatusPage(webDriver);
    }
}
