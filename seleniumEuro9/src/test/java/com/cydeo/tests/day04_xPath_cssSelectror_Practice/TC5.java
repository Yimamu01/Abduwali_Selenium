package com.cydeo.tests.day04_xPath_cssSelectror_Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC5 {
    public static void main(String[] args) {

        //1. Go to http://practice.cydeo.com/checkboxes

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cydeo.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Confirm checkbox #1 is NOT selected by default
       WebElement checkbox1=driver.findElement(By.cssSelector("input[name='checkbox1']"));
       
        if (checkbox1.isSelected()){
            System.out.println("checkbox1 is selected");
        }else {
            System.out.println("checkbox1 is not selected");
        }

        System.out.println(" ----------------test one finished-----------------------");
        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2=driver.findElement(By.cssSelector("input[name='checkbox2']"));

        if (checkbox2.isSelected()){
            System.out.println("checkbox2 is selected");
        }else {
            System.out.println("checkbox2 is not selected");
        }
        System.out.println("-------------------test 2 finished-------------------------");
        //4. Click checkbox #1 to select it.
        checkbox1.click();
        //5. Click checkbox #2 to deselect it.
        checkbox2.click();
        //6. Confirm checkbox #1 is SELECTED.

        if (checkbox1.isSelected()){
            System.out.println("checkbox1 is selected");
        }else {
            System.out.println("checkbox1 is not selected");
        }
        System.out.println("---------------------test3 is finished-------------------------");
        //7. Confirm checkbox #2 is NOT selected.

        if (checkbox2.isSelected()){
            System.out.println("checkbox2 is selected");
        }else {
            System.out.println("checkbox2 is not selected");
        }


        driver.close();
    }
}
/*
1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.

 */