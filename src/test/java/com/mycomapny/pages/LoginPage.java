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
public class LoginPage {
    public AppiumDriver<MobileElement> driver;
    public LoginPage(AppiumDriver<MobileElement> drv) {
        this.driver = drv;
    }
    public void assertPage() {
        //Discover the "Sign in via social network" at the bottom of the screen
        WebDriverWait wait = new WebDriverWait(driver,30);            
        String xpath = "//android.widget.TextView[@resource-id='ru.yandex.mail:id/text_social_message']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));            
        String testText = driver.findElement(By.xpath(xpath)).getText();
        assertEquals("Sign in via social network", testText);
    }
    public void typeUsername(String username) {
        //Enter in the username in the test field
        WebDriverWait wait = new WebDriverWait(driver,30);            
        String xpath = "//android.widget.EditText[@resource-id='ru.yandex.mail:id/edit_login']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));            
        driver.findElement(By.xpath(xpath)).sendKeys(username);        
    }
    public void clickNext() {
        //Click the next button
        WebDriverWait wait = new WebDriverWait(driver,30);            
        String xpath = "//android.widget.Button[@resource-id='ru.yandex.mail:id/button_next']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));            
        driver.findElement(By.xpath(xpath)).click();
    }
}
