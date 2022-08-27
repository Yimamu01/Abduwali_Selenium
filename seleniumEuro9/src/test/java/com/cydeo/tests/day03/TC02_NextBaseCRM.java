package com.cydeo.tests.day03;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC02_NextBaseCRM {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver=WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/  ");
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
       WebElement rememberMe =driver.findElement(By.className("login-item-checkbox-label"));
       String actualName=rememberMe.getText();
       String expectedName="Remember me on this computer";

       if (actualName.equalsIgnoreCase(expectedName)){
           System.out.println("Remember Lable test passed");
       }else {
           System.out.println("Remember Lable test failed");}

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?

        WebElement forgetYourPassword =driver.findElement(By.className("login-link-forgot-pass"));
         actualName=forgetYourPassword.getText();
          expectedName="Forgot your password?";

        if (actualName.equalsIgnoreCase(expectedName)){
            System.out.println("Forgot your password test passed");
        }else {
            System.out.println("Forgot your password test failed");}

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        WebElement forgetYourPassword1=driver.findElement(By.className("login-link-forgot-pass"));
        actualName=forgetYourPassword1.getAttribute("href");
                expectedName="forgot_password=yes";

        if (actualName.equalsIgnoreCase(expectedName)){
            System.out.println("forgot_password=yes href test passed");
        }else {
            System.out.println("forgot_password=yes href test failed");}
    }

}
