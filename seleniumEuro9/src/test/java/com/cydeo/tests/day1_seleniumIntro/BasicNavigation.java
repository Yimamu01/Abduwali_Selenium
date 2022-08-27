package com.cydeo.tests.day1_seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //1 set up the browser driver

        WebDriverManager.chromedriver().setup();

        //2 creat selenium web diver object
        // WebDriver driver=new ChromeDriver(); parent class
        ChromeDriver driver=new ChromeDriver();


// open the website
        driver.get("https://www.tesla.com");
        driver.manage().window().fullscreen();

        Thread.sleep(3000);

        //nevigate back
        driver.navigate().back();

        driver.manage().window().fullscreen();

        // nevigate forward
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.manage().window().fullscreen();


        // refresh
        driver.navigate().refresh();
        driver.manage().window().fullscreen();

        Thread.sleep(3000);

        // use navigate().to();
        driver.navigate().to("http://www.google.com");
        driver.manage().window().fullscreen();

        //get the title of the page
        System.out.println("current tile: "+driver.getTitle());

        // get the url of web page
        System.out.println("google url: "+driver.getCurrentUrl());


        driver.close();

    }
}
