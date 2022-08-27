package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CydeoVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com");
        String str=driver.getCurrentUrl();
        if (str.contains("cydeo")){
            System.out.println("expectation meet");
        }else {
            System.out.println("expectation failed");}


        if(str.equalsIgnoreCase(driver.getTitle())){
            System.out.println("title is same as expected");
        }else {
            System.out.println("title is not same as expected");}
        driver.close();
    }
}
