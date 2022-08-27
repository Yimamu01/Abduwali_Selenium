package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCHomework3 {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://google.com
        driver.get("https://google.com ");

        //click Accapt botton
        WebElement accaptBottonBox=driver.findElement(By.id("L2AGLb"));
        accaptBottonBox.click();
        //3- Click to Gmail from top right.
        driver.findElement(By.linkText("Gmail")).click();

        //4- Verify title contains:
      String actualTitle=  driver.getTitle();
        //  Expected: Gmail
        String expected="Gmail";

        if (actualTitle.contains(expected)){
            System.out.println("passed");
        }else {
            System.out.println("unpassed");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        actualTitle=driver.getTitle();
        //  Expected: Google
       expected="Google";

        if (actualTitle.contains(expected)){
            System.out.println("passed");
        }else {
            System.out.println("unpassed");
        }
 driver.close();
    }
}
