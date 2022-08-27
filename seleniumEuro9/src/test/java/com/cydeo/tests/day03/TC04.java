package com.cydeo.tests.day03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC04 {
    public static void main(String[] args) {
       //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        //3- Verify “Reset password” button text is as expected:
        WebElement resetPassword=driver.findElement(By.cssSelector("button.login-btn"));
        resetPassword.getAttribute("value");
        //Expected: Reset password
        String actualValue= resetPassword.getAttribute("value");
        String expectedValue="Reset password";

        if(actualValue.equalsIgnoreCase(expectedValue)){

            System.out.println("ResetPassword test passed");
        }else {
            System.out.println("ResetPassword test failed");
        }

    }
}
