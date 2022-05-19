package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage() {
        methods = new Methods();
    }
    public void login(){

        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySecond(3);
        methods.sendKeys(By.id("login-email"),"bugra.yurdagul@outlook.com");
        methods.waitBySecond(2);
        methods.sendKeys(By.id("login-password"),"q1w2e3r4t5");
        methods.waitBySecond(2);
        logger.info("Login Yapıldı.");
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySecond(5);
        logger.info("Login İşlemi Kontrol Edildi: Başarılı");



    }
}
