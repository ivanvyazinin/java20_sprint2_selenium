package ru.praktikum.selenium;

import org.junit.Test;
import ru.praktikum.selenium.pageobject.MainPage;

public class OrderTestNew extends BaseTest {
    String orderNotFoundNumber = "123";

    @Test
    public void checkSearchOfInvalidOrder() {
        new MainPage(webDriver)
                .clickOrderStateButton()
                .writeOrderNumber(orderNotFoundNumber)
                .clickGoButton()
                .checkNotFoundContainer();
    }
}
