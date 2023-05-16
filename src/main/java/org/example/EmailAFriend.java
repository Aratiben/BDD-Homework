package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriend extends Utils {
    public void enterEmailDetails(){
        String B = "Only Registered user can refer a product to a friend";

         clickonElement(By.xpath("//*[text()='Email a friend']"));
        typeText(By.className("friend-email"),"abc@yahoo.com");
       //typeText(By.className("your-email"),"testEmail@gmail.com");
        clickonElement(By.name("send-email"));


    }
    }

