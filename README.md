# Appium Test Automation
## Introduction
Several technologies are needed in order to effectively use test automation against mobile phone devices. As suggested, Appium has been selected as the main tool to use for test automation where android has been selected as the operating system to be tested. The Yandex.Mail app, found in google play store, was used to test against.
## Main Files
**[EntryTest.java](https://github.com/bigmilsy/appiumtest/blob/master/src/test/java/com/mycompany/appiumyandexmail/EntryTest.java)**<br /><br />
This is the main testing script file that is executed when the user clicks run tests. The method testMain() is what contains the actual test automation script. The class is designed using the POM, or Page Object Model, meaning it is easy to read and maintain. The more complex webdriver and appium code is contained within the various Page class’s, with each page corresponding to an activity screen within the app under tests.
**[TestData.java](https://github.com/bigmilsy/appiumtest/blob/master/src/test/java/com/mycompany/appiumyandexmail/TestData.java)**<br /><br />
Every test script must contain test data in some shape or form. This class contains the test data, basically the username and password, that is used within the test script. Separating the test data from the main programming script is wise practice as data may be imported from a flat file or even a database. The test data is hard coded in this example for ease of use.
## Technology Stack
**NetBeans 8.2:** The main IDE used for this appium android testing is NetBeans. NetBeans is a free download and is developed by Apache. NetBeans allows for more simple creation of software, particularly when developing test scripts.
**Java 1.8:** The programming language selected for building the appium test is Java. Java allows for simple integration with the appium libraries as well as providing the JUnit testing framework.<br /><br />
**Maven:** Another Apache tool, maven is a build automation tool and in particular allows for much easier integration of dependant libraries such as Appium and Selenium WebDriver.<br /><br />
**JUnit:** A testing framework harness that comes free with NetBeans. The appium scripting and programming is contained within executable JUnit class’s. This allows for extra functionality for passing and failing test case’s and works well with WebDriver types of technologies.<br /><br />
**Android:** The android operating system was selected to execute automated test against, running an a galaxy S8 note mobile phone.<br /><br />
**Appium & WebDriver:** The main driver of the automation tests, the Appium server allows for the connection between android studio and Selenium WebDriver. This means that common commands that are available within the web driver technologies, such as finding web elements and controlling these element, can be re-used for automation against mobile phone apps running on android. The downloadable appium class libraries also contain the Selenium WebDriver components with the maven build automation tool allowing for easy importing into the test automation code.<br /><br />
**App Used:** Yandex.Mail: A simple application that allows for login into a yandex email server.<br /><br />

