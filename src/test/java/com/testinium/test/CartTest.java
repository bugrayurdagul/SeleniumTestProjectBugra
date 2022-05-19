package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.CartPage;
import org.junit.Before;
import org.junit.Test;

public class CartTest extends BaseTest {
    CartPage cartPage;

    public CartTest() {
        cartPage = new CartPage();
    }

    @Test
    public void CartTest(){
        cartPage.goToCartPage();
        cartPage.increseQuantity();
        cartPage.refreshQuantity();
        cartPage.buyItems();
        cartPage.goToAddressAndAdd();
        cartPage.addCardAndControlBuying();
    }



}
