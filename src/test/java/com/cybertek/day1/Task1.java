package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/hb/Documents/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.cybertekschool.com");

        System.setProperty("webdriver.gecko.driver","/Users/hb/Documents/Selenium Dependencies/Drivers/geckodriver");
        WebDriver geckoDriver = new FirefoxDriver();
        driver.get("http://www.practice.cybertekschool.com");
    }

}
