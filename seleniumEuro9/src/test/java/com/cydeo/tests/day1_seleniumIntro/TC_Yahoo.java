package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  TC_Yahoo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver1.get("http://www.yahoo.com");
        driver1.manage().window().fullscreen();
        String actualTitle=driver1.getTitle();
        System.out.println("Expected title= "+actualTitle );

        String expectedTitle="Yahoo";
        if (expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println("Verification passed");
        }else {
            System.out.println("Verification failed");
        }

        driver1.close();

    }
}
