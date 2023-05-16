package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    String browsername = loadProp.getProperty("browser");

    public void openBrowser() {
        if (browsername.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else if (browsername.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Your browser name is wrong or not implemented " + browsername);}
            driver = new ChromeDriver();
            driver.get(loadProp.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
        public void closeBrowser () {
            driver.close();
        }
    }


