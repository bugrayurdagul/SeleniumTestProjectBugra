package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.ProductPage;
import org.junit.Before;
import org.junit.Test;

public class MainTest extends BaseTest {
    ProductPage productPage;
    LoginTest loginTest;

    CartTest cartTest;

    LoguoutTest loguoutTest;

    @Before
    public void forStart(){
       productPage = new ProductPage();
       loginTest = new LoginTest();
       cartTest = new CartTest();
       loguoutTest = new LoguoutTest();
    }

    //Bütün Testler

    @Test
    public void fullTest(){

        loginTest.loginTest();
        productPage.loginControl();
        productPage.searchItem();
        productPage.getDown();
        productPage.addToFavourites();
        productPage.backToMainPage();
        productPage.goToLevelCatalog();
        productPage.selectTRClassics();
        productPage.filterTRClassics();
        productPage.tumKitaplarHoverAndSelectHobi();
        productPage.randomItemPicker();
        productPage.goToFavourites();
        productPage.removeFromFavourites();
        cartTest.CartTest();
        loguoutTest.logoutTest();

    }

}
