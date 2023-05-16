package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
    LoadProp loadProp=new LoadProp();
    public void userLogin() {
        clickonElement(By.className("ico-login"));
        //type your email addres
        typeText(By.id("Email"),loadProp.getProperty("email1"));
        //type your password
        typeText(By.id("Password"), loadProp.getProperty("password"));

        //click on login
        clickonElement(By.xpath("//button[@class='button-1 login-button']"));
    }
}
