package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.Base.BaseSettingsTest;

//        Перейти на сайт https://geekbrains.ru/career
//        Нажать на кнопку Форум
//        Проверить что страница Форум открылась
//        Повторить для
//        Вебинары
//        Блог
//        Тесты
//        Карьера

 public class Navigation_test extends BaseSettingsTest {

     @AfterEach
     void tearDown() {
         WebElement header = driver.findElementByCssSelector("[class*=\"gb-header__content\"]");
         WebElement footer = driver.findElementByCssSelector("[class=\"site-footer__content\"]");

         wait15second.until(ExpectedConditions.visibilityOf(
                 header));
         wait15second.until(ExpectedConditions.visibilityOf(
                 footer));
     }

     @Test
     public void topics() {
         driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
         Assertions.assertEquals(
                 "Форум",
                 driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
         );
     }

     @Test
     public void events() {
         driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
         Assertions.assertEquals(
                 "Вебинары",
                 driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
         );
     }

     @Test
     public void posts() {
         driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();

         driver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
         driver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

         Assertions.assertEquals(
                 "Блог",
                 driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
         );
     }

     @Test
     public void tests() {
         driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();

         Assertions.assertEquals(
                 "Тесты",
                 driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
         );
     }

     @Test
     public void career() {
         driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
         Assertions.assertEquals(
                 "Карьера",
                 driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
         );
     }

     @Test
     public void courses() {
         driver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
         Assertions.assertEquals(
                 "Курсы",
                 driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
         );
     }
 }