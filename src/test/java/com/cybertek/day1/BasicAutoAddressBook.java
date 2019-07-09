package com.cybertek.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutoAddressBook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/hb/Documents/Selenium Dependencies/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://a.testaddressbook.com/sign_in");
        WebElement inputEmail = driver.findElement(By.id("session_email"));
        inputEmail.sendKeys("kexesobepu@zsero.com");
        WebElement inputPassword = driver.findElement(By.id("session_password"));
        inputPassword.sendKeys("password");

        // inputEmail.clear(); clears the email field after the data is entered

        WebElement signinButton = driver.findElement(By.name("commit"));
        signinButton.click();
        System.out.println(driver.getTitle());
        WebElement username = driver.findElement(By.className("navbar-light"));
        String actualUsername = username.getText();
        System.out.println(actualUsername);

        // Verify username is displayed on page
        if("kexesobepu@zsero.com".equals(actualUsername)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("EXPECTED: kexesobepu@zsero.com");
            System.out.println("ACTUAL USERNAME = "+actualUsername);
        }

        // Full screen for MAC -->> driver.manage().window().fullscreen();
        // Full screen for Windows -->> driver.manage().window().maximize();

        // Verify title
        if(!driver.getTitle().contains("Sign in")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println(driver.getTitle());
        }

    }
}
