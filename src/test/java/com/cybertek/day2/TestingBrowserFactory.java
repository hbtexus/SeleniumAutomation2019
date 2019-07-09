package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

public class TestingBrowserFactory {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();  // command to maximize browser
        driver.get("https://practice.cybertekschool.com");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("Expected Title = " + expectedTitle);
            System.out.println("Actual Title = " + actualTitle);
        }

        // driver.close();  // close browser at the end of use

        // WebDriver is an interface, ChromeDriver FirefoxDriver, EdgeDriver, OperaDriver,SafariDriver, RemoteWebDriver
        // implement this interface
    }
}
