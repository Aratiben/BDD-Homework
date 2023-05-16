package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    public void clickOnRegisterButton(){
        clickonElement(By.className("ico-register"));
    }
    public void clickOnHTCOneM8AndroidPhone(){
        clickonElement(By.xpath("//*[text()='HTC One M8 Android L 5.0 Lollipop']"));

    }

}
