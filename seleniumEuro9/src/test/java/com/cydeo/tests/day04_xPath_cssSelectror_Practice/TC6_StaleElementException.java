package com.cydeo.tests.day04_xPath_cssSelectror_Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC6_StaleElementException {
    public static void main(String[] args) {
        //TC #6: StaleElementReferenceException Task
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink=driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("CydeoLink Displayed: "+cydeoLink.isDisplayed());
        //4- Refresh the page.
        driver.navigate().refresh();
        //5- Verify it is displayed, again.
        //resign the web element
        cydeoLink=driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("CydeoLink Displayed: "+cydeoLink.isDisplayed());
    }
}
