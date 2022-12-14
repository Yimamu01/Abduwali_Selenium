package com.cydeo.tests.day04_xPath_cssSelectror_Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC4 {
    public static void main(String[] args) {


        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2- Go to: https://practice.cydeo.com/abtest
     driver.get("https://practice.cydeo.com/abtest ");
        //3- Locate all the links in the page.
        List<WebElement> links=driver.findElements(By.tagName("a"));
        //4- Print out the number of the links on the page.
        System.out.println(links.size());
        //5- Print out the texts of the links.

        for (WebElement each:links) {
            System.out.println(each.getText());
        }
        //6- Print out the HREF attribute values of the links
        for (WebElement each:links) {
            System.out.println(each.getAttribute("href"));
        }

        driver.close();
    }
}
/*
TC #4: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */