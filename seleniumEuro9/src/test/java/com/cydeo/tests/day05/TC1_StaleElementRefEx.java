package com.cydeo.tests.day05;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC1_StaleElementRefEx {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/ ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Click to “Add Element” button
        WebElement addElementBotton=driver.findElement(By.xpath("(//div/button)[1]"));
        addElementBotton.click();
        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteBotton=driver.findElement(By.xpath("(//div/button)[2]"));
        System.out.println("Delete Button displayed ="+deleteBotton.isDisplayed());
        //5. Click to “Delete” button.
      deleteBotton.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //6. Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("Delete Button displayed ="+deleteBotton.isDisplayed());

        }catch (StaleElementReferenceException e){
            System.out.println("element deleted");
        }

        driver.close();
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
