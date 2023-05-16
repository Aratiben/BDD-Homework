package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils  {
    LoadProp loadProp=new LoadProp();
    public void fillInDetails(){
        typeText(By.id("FirstName"),loadProp.getProperty("firstname"));
        //type your last name
       typeText(By.id("LastName"),loadProp.getProperty("lastname"));
        //type email address
        typeText(By.name("Email"),  loadProp.getProperty("email")+timeStamp()+loadProp.getProperty("domain"));
        //type password
        typeText(By.id("Password"),loadProp.getProperty("password"));
        //confirm password
       typeText(By.id("ConfirmPassword"),loadProp.getProperty("confirmpassword"));
        //click on register button
       clickonElement(By.id("register-button"));
    }
    public void fillInDetailstoregister(){
        typeText(By.id("FirstName"),loadProp.getProperty("firstname"));
        //type your last name
        typeText(By.id("LastName"),loadProp.getProperty("lastname"));
        //type email address
        typeText(By.name("Email"),  loadProp.getProperty("email1"));
        //type password
        typeText(By.id("Password"),loadProp.getProperty("password"));
        //confirm password
        typeText(By.id("ConfirmPassword"),loadProp.getProperty("confirmpassword"));
        //click on register button
        clickonElement(By.id("register-button"));
    }
}
