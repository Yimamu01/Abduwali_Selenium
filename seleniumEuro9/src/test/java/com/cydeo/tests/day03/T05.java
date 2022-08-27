package com.cydeo.tests.day03;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T05 {
    public static void main(String[] args) throws InterruptedException {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");
        Thread.sleep(10000);
        //3- Enter incorrect username into login box:
        WebElement LogInButton = driver.findElement(By.xpath("//input[@type='text']"));
        LogInButton.click();
        LogInButton.sendKeys("ajddls@gmail.com" + Keys.ENTER);
        //4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.xpath("//*[@value='Reset password']"));
        //5- Verify “error” label is as expected
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='errortext']"));
        String actualErrorMessage = errorMessage.getText();
        System.out.println(actualErrorMessage);

        //Expected: Login or E-mail not found
        String expectedErroMessage = "Login or E-mail not found";

        if (actualErrorMessage.equalsIgnoreCase(expectedErroMessage)) {
            System.out.println("ErrorMessage Test passed");
        } else {
            System.out.println("ErrorMessage Test Failed");

        }

        driver.close();
    }
}