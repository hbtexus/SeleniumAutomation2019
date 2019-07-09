package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPageSource {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/hb/Documents/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  // driver.manage().window().fullscreen(); (in MAC it makes fullscreen)
        driver.get("http://practice.cybertekschool.com");
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }
}
