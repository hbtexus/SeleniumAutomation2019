package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws Exception {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        for (String url : urls) {
            driver.get(url); // we are opening URL
            Thread.sleep(2000);
        }
        String expectedTitle = "Practice";
        System.out.println();

        if (driver.getTitle().equals(expectedTitle)) {
            System.out.println("Title correct and PASSED");
        } else {
            System.out.println("Title incorrect = " + driver.getTitle() + "FAILED");
        }
            System.out.println("Verify page URLs");
        //to verify if every page url starts with expected URL

        String expectedURL = "http://practice.cybertekschool.com";
        if (driver.getCurrentUrl().startsWith(expectedURL)) {
            System.out.println("URL is correct, PASSED");
        } else {
            System.out.println("URL does not start as expected : " + driver.getCurrentUrl() + "FAILED");
        }
        driver.close();
    }
}
