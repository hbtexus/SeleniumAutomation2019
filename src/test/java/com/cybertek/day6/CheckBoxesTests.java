package com.cybertek.day6;

import com.cybertek.day2.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBoxesTests {
    static WebDriver driver = BrowserFactory.getDriver("chrome");

    public static void main(String[] args) {
        test1();
    }

    public static void openCheckBoxesPage(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/checkboxes");
    }

    //verify  that checkbox 1 is not selected and checkbox 2 is selected
    public static void test1(){
        openCheckBoxesPage();
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        //to verify if checkbox 1 is not selected
        if(!checkbox1.isSelected()){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
        //to verify if checkbox 2 is selected

        if(checkbox2.isSelected()){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
       // driver.close();
    }
}
