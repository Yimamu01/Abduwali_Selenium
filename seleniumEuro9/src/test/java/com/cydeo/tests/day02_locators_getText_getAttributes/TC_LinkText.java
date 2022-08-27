package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LinkText {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        driver.findElement(By.linkText("A/B Testing")).click();
        WebElement aTestLink=driver.findElement(By.linkText("A/B Testing"));

        String expectedTitle="A/B Testing";
        String actualTitle=driver.getTitle();

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("pass");
        }else {
            System.out.println("failed");
        }

         Thread.sleep(2000);
        driver.navigate().back();

   expectedTitle="Practice";
     actualTitle=driver.getTitle();

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("pass");
        }else {
            System.out.println("failed");
        }


    }
}
