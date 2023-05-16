package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.sql.Timestamp;

public class Utils extends BasePage{

        //protected static WebDriver driver;
      public static void clickonElement(By by){driver.findElement(by).click();}
        public static void typeText(By by, String text) {
            driver.findElement(by).sendKeys(text);
        }

        public static String getTextFromElement(By by) {
            return driver.findElement(by).getText();
        }

        public static long timeStamp() {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            return timestamp.getTime();
        }
        public static void selectelementByIndex(By by, int index) {
            Select select = new Select(driver.findElement(by));
            select.selectByIndex(index);
        }


        public static void selectelementByText(By by, String text) {
            Select select = new Select(driver.findElement(by));
            select.selectByVisibleText(text);
        }
    public static void selectelementsByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }


    }
