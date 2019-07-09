package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    // it's a method that returns object of webdriver, it can be firefox or chrome based on value of parameter
    public static WebDriver getDriver(String browser) {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/hb/Documents/Selenium Dependencies/Drivers/chromedriver");
            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/Users/hb/Documents/Selenium Dependencies/Drivers/geckodriver");
            return new FirefoxDriver();
        } else {
            return null;
        }
    }
}

