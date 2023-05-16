package org.example;

import org.testng.Assert;
import org.openqa.selenium.By;


import static org.example.Utils.getTextFromElement;

public class RegisterResultPage extends Utils {
    public void userShouldSeeTheMessage(){
        String expectedMessage = "expectedresult";
        String message = getTextFromElement(By.xpath("//div[@class='result']"));
        //comparing message actual to expected
        Assert.assertEquals(message,expectedMessage,"Something Wrong");
    }
}
