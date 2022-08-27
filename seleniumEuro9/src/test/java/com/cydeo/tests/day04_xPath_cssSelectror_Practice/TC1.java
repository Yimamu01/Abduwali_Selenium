package com.cydeo.tests.day04_xPath_cssSelectror_Practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1 {
    public static void main(String[] args) {
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password ");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeLink=driver.findElement(By.cssSelector("a[class='nav-link']"));
        //b. “Forgot password” header
        WebElement forgetPassWord=driver.findElement(By.cssSelector("div.example>h2"));
        //c. “E-mail” text
        WebElement emailText=driver.findElement(By.xpath("//label[@for='email']"));
        //d. E-mail input box
        WebElement emailInputBox=driver.findElement(By.cssSelector("input[type='text']"));
        //e. “Retrieve password” button
        WebElement retrievePassWordButton=driver.findElement(By.xpath("//*[@class='icon-2x icon-signin']"));
        //f. “Powered by Cydeo text
        WebElement poweredByText=driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        //4. Verify all web elements are displayed.
        System.out.println(poweredByText.isDisplayed());
        System.out.println(homeLink.isDisplayed());
        System.out.println(forgetPassWord.isDisplayed());
        System.out.println(emailText.isDisplayed());
        System.out.println(emailInputBox.isDisplayed());
        System.out.println(retrievePassWordButton.isDisplayed());

        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
        //

    }
}
/*
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible

 */