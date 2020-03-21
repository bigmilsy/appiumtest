/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycomapny.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import static org.junit.Assert.assertEquals;
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
    public void assertPage() {
        //Discover the "Get Yandex Mail" at the bottom of the screen
        WebDriverWait wait = new WebDriverWait(driver,30);            
        String xpath = "//android.widget.TextView[@resource-id='ru.yandex.mail:id/list_registration']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));            
        String testText = driver.findElement(By.xpath(xpath)).getText();
        assertEquals("Get Yandex.Mail", testText);
    }
    public void clickYandexMail() {
        //Click the Yandex option on the first entry page
        WebDriverWait wait = new WebDriverWait(driver,30);            
        String xpath = "//android.widget.ImageView[@resource-id='ru.yandex.mail:id/list_yandex']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));            
        driver.findElement(By.xpath(xpath)).click();
    }    
}
