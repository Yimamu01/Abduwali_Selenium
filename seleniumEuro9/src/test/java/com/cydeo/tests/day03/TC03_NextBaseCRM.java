package com.cydeo.tests.day03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC03_NextBaseCRM {
    public static void main(String[] args) {

        //1- Open a chrome browser
       WebDriver driver=WebDriverFactory.getDriver("Chrome");
       driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        WebElement logInButton= driver.findElement(By.cssSelector("input[type='submit']"));
       String actualValue= logInButton.getAttribute("value");
        //Expected: Log In
        String ExpectedValue="Log In";
        if (actualValue.equalsIgnoreCase(ExpectedValue)){
            System.out.println("LogInButton Value test passed");
        }else {
            System.out.println("LogInButton Value test failed");
        }

    }
}
