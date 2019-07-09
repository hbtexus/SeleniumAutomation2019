package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumUtils {

    public void verifyEquals(String expectedResult, String actualResult){
        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Result = " + expectedResult);
            System.out.println("Actual Result = " + actualResult);
        }
    }

    public static void openPage(String page, WebDriver driver){
    List<WebElement> lisOfExamples = driver.findElements(By.tagName("a"));
    for(WebElement example: lisOfExamples){
        if(example.getText().contains(page)){
            example.click();
            break;
        }
    }
    }

    public static void waitPlease(int seconds){
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
