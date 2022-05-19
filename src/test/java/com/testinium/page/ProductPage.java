package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void loginControl(){
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".menu.top.login")));
        methods.waitBySecond(2);
        logger.info("Login bilgisi konrol edildi");

    }
    public void searchItem(){
        methods.sendKeys(By.xpath("//input[@id = 'search-input']"),"Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySecond(3);
        logger.info("Oyuncak kelimesi ile ürün araması yapıldı.");

    }
    public void getDown(){
        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])[7]"));
        methods.waitBySecond(4);
        logger.info("Sayfa yedinci ürüne kaydırıldı.");
    }


    public void addToFavourites(){

        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[6]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[6]"));
        methods.waitBySecond(1);
        methods.scrollWithAction(By.xpath("(//a/i[@class='fa fa-heart'])[7]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[7]"));
        methods.waitBySecond(1);
        methods.scrollWithAction(By.xpath("(//a/i[@class='fa fa-heart'])[8]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[8]"));
        methods.waitBySecond(2);
        methods.scrollWithAction(By.xpath("(//a/i[@class='fa fa-heart'])[9]"));
        methods.click(By.xpath("(//a/i[@class='fa fa-heart'])[9]"));
        methods.waitBySecond(2);
        logger.info("Dört ürün favorilere eklendi.");

    }

    public void backToMainPage(){

        methods.click(By.cssSelector(".logo-icon"));
        methods.waitBySecond(2);
        logger.info("Ana sayfaya dönüldü.");
    }

    public void goToLevelCatalog(){
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySecond(2);
        logger.info("Puan Katalogu sayfasına girildi.");
    }

    public void selectTRClassics(){
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySecond(2);
        logger.info("Türk Klasikleri sayfalarına girildi");
    }

    public void filterTRClassics(){
        methods.selectByText(By.cssSelector(".sort>select"),"Yüksek Oylama");
        methods.waitBySecond(5);
        logger.info("Yüksek Oylama Filtresi çalıştı.");
    }

    public void tumKitaplarHoverAndSelectHobi(){
        methods.mouseHover(By.xpath("(//*[contains(text(),'Tüm Kitaplar')])[3]"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//a[contains(text(), 'Hobi')]"));
        methods.waitBySecond(3);
        logger.info("Hobi sayfasına girildi.");
    }

    public void randomItemPicker(){
        methods.randomPicker(By.cssSelector(".pr-img-link"));
        methods.waitBySecond(3);
        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.waitBySecond(3);
        logger.info("Rastgele bir ürün sepete eklendi");
    }

    public void goToFavourites(){
        methods.mouseHover(By.cssSelector(".menu.top.my-list"));
        methods.waitBySecond(3);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySecond(3);
        logger.info("Favoriler sayfasına gidildi.");
    }

    public void removeFromFavourites(){
        methods.click(By.cssSelector(".display-item.sprite.sprite-icon-list-selected"));
        methods.waitBySecond(3);
        methods.click(By.xpath("(//*[@class='fa fa-heart-o'])[3]"));
        methods.waitBySecond(3);
        logger.info("Favorilerden 3. favori silindi.");
    }

}
