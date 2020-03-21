/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycomapny.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author dmiller
 */
public class EntryPage {
    public AppiumDriver<MobileElement> driver;
    public EntryPage(AppiumDriver<MobileElement> drv) {
        this.driver = drv;
    }
    public void clickYandexMail() {
        //Click the Yandex option on the first entry page
        WebDriverWait wait = new WebDriverWait(driver,30);            
        String selEmailService = "//android.widget.ImageView[@resource-id='ru.yandex.mail:id/list_yandex']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selEmailService)));            
        driver.findElement(By.xpath(selEmailService)).click();
    }
}
