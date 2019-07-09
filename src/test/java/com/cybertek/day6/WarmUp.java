package com.cybertek.day6;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WarmUp {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //    TEST 1
//    go to amazon
//    enter any search term
//    click on search button
//    verify title contains search term

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.get("https://www.amazon.com");
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Book");
            driver.findElement(By.className("nav-input")).click();
            String title = driver.getTitle();

            if (title.contains("Book")) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            // driver.close();

        //    TEST 2
//    go to wikipedia.org
//    enter search term ‘selenium webdriver’
//    click on search button
//    click on search result ‘Selenium (software)’
//    verify url ends with ‘x’

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://www.wikipedia.org/");
            driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver", Keys.ENTER);

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.findElement(By.linkText("Selenium (software)")).click();

            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            String url = driver.getCurrentUrl();
            if (url.endsWith("x")) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
            driver.close();

        }
    }



