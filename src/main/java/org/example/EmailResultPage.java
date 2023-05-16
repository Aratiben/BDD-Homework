package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailResultPage extends Utils{

    public void userSeeTheMessage(){
    String Answer = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']/ul/li"));
    // System.out.println(Answer);
        Assert.assertEquals(Answer,"Your Mail has been sent  ");
}}
