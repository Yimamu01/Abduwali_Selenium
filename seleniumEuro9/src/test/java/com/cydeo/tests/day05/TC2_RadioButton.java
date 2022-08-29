package com.cydeo.tests.day05;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC2_RadioButton {
    public static void main(String[] args) {
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Click to “Hockey” radio button
       WebElement HockeyButton=driver.findElement(By.xpath("//*[@id='hockey']"));
        HockeyButton.click();
        //4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("Is Hockey Button Selected="+HockeyButton.isSelected());
        driver.close();
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        //
        //
    }
}
