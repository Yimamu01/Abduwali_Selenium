package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.image.Kernel;

public class TC_GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();


        // open google
        driver.get("http://www.googl.com");

        //click Accapt botton
       WebElement accaptBottonBox=driver.findElement(By.id("L2AGLb"));
        accaptBottonBox.click();

        //write"apple" in searchbox
        WebElement googleSearchBox=driver.findElement(By.name("q"));
        googleSearchBox.click();
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);


    }
}
