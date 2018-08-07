package com.sysco.WebAutomationAssignemnt.functions;


import com.sysco.WebAutomationAssignemnt.pages.AccountPage;
import com.syscolab.qe.core.common.LoggerUtil;

public class Account extends BaseFunctions {

    public static AccountPage ogmAcountPage = new AccountPage();

    public static void removeItem(){
        LoggerUtil.logINFO("Clicking Cart");
        ogmAcountPage.clickCart();

//        LoggerUtil.logINFO("Clicking Remove");
        ogmAcountPage.clickRemove();
    }

    public static void gotoProduct(){
        ogmAcountPage.clickProduct();
    }

    public static void gotoBottleShop(){
        ogmAcountPage.clickBottleShop();
    }

    public static void gotoExclusiveProducts(){
        ogmAcountPage.clickExclusiveProducts();
    }

}