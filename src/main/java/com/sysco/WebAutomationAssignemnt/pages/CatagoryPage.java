package com.sysco.WebAutomationAssignemnt.pages;

import org.openqa.selenium.By;

public class CatagoryPage extends BasePage{

    private By exclusiveCatagory = By.xpath("//*[@id=\"nav-wrapper\"]/div/div[4]/div[1]/div[1]/ul/li/ul/li[1]/a");

    public void clickExclusive(){
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(exclusiveCatagory);
    }
}