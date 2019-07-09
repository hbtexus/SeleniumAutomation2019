package com.cybertek.day2;

        import org.openqa.selenium.WebDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Thread.sleep(1000);
        driver.navigate().to("http://amazon.com");
        Thread.sleep(3000);
        System.out.println("Title = " + driver.getTitle());
        System.out.println("Current URL = " + driver.getCurrentUrl());
        driver.close();

    }
}
