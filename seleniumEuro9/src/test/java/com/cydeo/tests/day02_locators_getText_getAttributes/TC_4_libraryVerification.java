package com.cydeo.tests.day02_locators_getText_getAttributes;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_4_libraryVerification {
    public static void main(String[] args) {
        //TC #4: Library verifications
        //1. Open Chrome browser
     WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get(" http://library1.cydeo.com/login.html");
        //3. Enter username: “incorrect@email.com”

       WebElement emailbox = driver.findElement(By.className("form-control"));


        //emailbox.click();
        emailbox.sendKeys("incorrect@email.com"+ Keys.ENTER);
        //4. Enter password: “incorrect password”
        WebElement passwordbox=driver.findElement(By.id("inputPassword"));


        passwordbox.sendKeys("incorrect password");

        // click botton
        WebElement clickBotton=driver.findElement(By.className("btn btn-lg btn-primary btn-block"));
        clickBotton.click();


        //displayed


    }
}
