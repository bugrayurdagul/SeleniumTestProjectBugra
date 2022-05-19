package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.CartPage;
import com.testinium.page.LogoutPage;
import org.junit.Test;

public class LoguoutTest extends BaseTest {

    LogoutPage logoutPage;

    public LoguoutTest() {
        logoutPage = new LogoutPage();
    }

    @Test
    public void logoutTest(){
        logoutPage.hoverAndLogout();
    }
}
