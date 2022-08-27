package com.cydeo.tests.day02_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_getText_getAttribute {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form ");
        //3- Verify header text is as expected:
          WebElement headerText=driver.findElement(By.tagName("h2"));
          String actualText=headerText.getText();
          String expectedTex="Registration form";

          if(actualText.equals(expectedTex)){
              System.out.println("passed");
          }else {
              System.out.println("failed");
          }


        //4- Locate “First name” input box
        WebElement firtname= driver.findElement(By.name("firstname"));
          String actualAttribute=firtname.getAttribute("name");
          String expectedAttribute="first name";

          if (actualAttribute.equals(expectedAttribute)){
              System.out.println("passed");
          }else {
              System.out.println("failed");
          }

          driver.close();
        //5- Verify placeholder attribute’s value is as expected:
        //  Expected: first name

    }
}
