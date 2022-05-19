package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class LogoutPage {

    Methods methods;
    Logger logger = LogManager.getLogger(LogoutPage.class);
    public LogoutPage() {
        methods = new Methods();
    }

    public void hoverAndLogout(){
        methods.waitBySecond(3);
        methods.mouseHover(By.cssSelector(".menu.top.login"));
        methods.click(By.xpath("//*[contains(text(),'Çıkış')]"));
        logger.info("Başarıyla çıkış yapıldı.");
        methods.waitBySecond(5);
    }

}
