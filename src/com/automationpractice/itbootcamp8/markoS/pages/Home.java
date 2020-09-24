package com.automationpractice.itbootcamp8.markoS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home {
    private static String womanDropdownXpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
    private static String summerDressesXpath = "//li[@class='sfHover']//ul//li//a[contains(text(),'Summer Dresses')]";
    private static String dressesDropdownXpath = "//body[@id='category']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
    private static String summerDressesDressesXpath = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";

    private static WebElement getWomanDropdown(WebDriver wd) {
        return wd.findElement(By.xpath(womanDropdownXpath));
    }

    private static WebElement getWomanDresses(WebDriver wd) {
        return wd.findElement(By.xpath(summerDressesXpath));
    }

    private static WebElement getDressesDropdown(WebDriver wd) {
        return wd.findElement(By.xpath(dressesDropdownXpath));
    }

    private static WebElement getWomanSummerDress(WebDriver wd) {
        return wd.findElement(By.xpath(summerDressesDressesXpath));
    }

    public static void hoverWomanDropdown(WebDriver wd, Actions action) {
        action.moveToElement(getWomanDropdown(wd)).build().perform();
    }

    public static void clickSummerDresses(WebDriver wd) {
        getWomanDresses(wd).click();
    }

    public static void hoverDressesDropdown(WebDriver wd, Actions action) {
        action.moveToElement(getDressesDropdown(wd)).build().perform();
    }

    public static void clickSummerDress(WebDriver wd) {
        getWomanSummerDress(wd).click();
    }

}
