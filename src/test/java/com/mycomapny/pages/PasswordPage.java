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
public class PasswordPage {
    public AppiumDriver<MobileElement> driver;
    public PasswordPage(AppiumDriver<MobileElement> drv) {
        this.driver = drv;
    }
    public void typePassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver,30);            
        String xpath = "//android.widget.EditText[@resource-id='ru.yandex.mail:id/edit_password']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));            
        driver.findElement(By.xpath(xpath)).sendKeys(password);        
    }
    public void clickSignIn() {
        WebDriverWait wait = new WebDriverWait(driver,30);            
        String xpath = "//android.widget.Button[@resource-id='ru.yandex.mail:id/button_next']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));            
        driver.findElement(By.xpath(xpath)).click();                
    }
}