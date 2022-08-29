package com.cydeo.tests.day05;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC3_UtilitiyMehod {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Click to “Hockey” radio button
        clickAndVerifyRadioButton(driver,"sport","hockey");
        //WebElement HockeyButton=driver.findElement(By.xpath("//*[@id='hockey']"));
    /*    List<WebElement> sportList = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement each : sportList) {
            String eachId = each.getAttribute("id");
            if (eachId.equalsIgnoreCase("hockey")) {
                each.click();

                System.out.println("Hockey button is selected= " + each.isSelected());
                break;
            }

        }
*/



    }

    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {

        List<WebElement> List = driver.findElements(By.name(nameAttribute));

        for (WebElement each : List) {
            String eachId = each.getAttribute("id");
            if (eachId.equalsIgnoreCase(idValue)) {
                each.click();
                System.out.println(idValue + " button is selected= " + each.isSelected());
                break;
            }


        }

    }
}