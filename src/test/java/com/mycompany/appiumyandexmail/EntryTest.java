/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appiumyandexmail;

import com.mycomapny.pages.EntryPage;
import com.mycomapny.pages.LoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author dmiller
 */
public class EntryTest {
    public DesiredCapabilities caps;
    public TestData testData;
    public EntryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //Setup test data
        testData = new TestData();
        //These are the main appium settings that are used to connect to both the device and the
        //app that is to be tested. 
        caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "My Phone");
        caps.setCapability("udid", "ce08171813a36e3e027e"); //Device ID from adb devices
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("appPackage", "ru.yandex.mail");
        caps.setCapability("appActivity", "ru.yandex.mail.ui.LoginActivity");
        caps.setCapability("noReset", "true");
        caps.setCapability("automationName", "UiAutomator1");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Entry.
     */
    @Test
    public void testMain() {
        try {
/*
    NOTE: A Page Object Model methadology has been followed.
      Each of the screens, or activities, has been placed into a seperate class file.
      This is a common technique in test automation and allows for both easier to read code
      and easier to maintain code. 
*/
            
            AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            
            //First, the email type needs to be selected
            EntryPage entryPage = new EntryPage(driver);
            entryPage.clickYandexMail();
            
            LoginPage loginPage = new LoginPage(driver);
            loginPage.typeUsername(testData.username);
            
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            
        }         
    }
    
}
