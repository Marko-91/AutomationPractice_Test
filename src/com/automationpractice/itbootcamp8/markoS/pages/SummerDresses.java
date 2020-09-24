package com.automationpractice.itbootcamp8.markoS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SummerDresses {
    private static String summerDress_2Xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]";
    private static String whiteColorXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[3]/ul[1]/li[1]/a[1]";
    private static String addToCartBtnXpath = "//span[contains(text(),'Add to cart')]";
    private static String crossXpath = "//span[@class='cross']";
    private static String proceedXpath = "//span[contains(text(),'Proceed to checkout')]";
    private static String quantityXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/input[1]";
    private static String itemNameXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/p[1]/a[1]";
    private static String colorWhiteSummaryXpath = "//td[@class='cart_description']//a[contains(text(),'Color : White, Size : M')]";
    private static String dropDownSizeXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/div[1]/fieldset[1]/div[1]/div[1]/select[1]";
    private static String mediumSizeXpath = "//option[contains(text(),'M')]";
    private static String boxShopXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]";

    public static WebElement getSummerDress_2(WebDriver wd) {
        return wd.findElement(By.xpath(summerDress_2Xpath));
    }
    private static WebElement getCross(WebDriver wd) {
        return wd.findElement(By.xpath(crossXpath));
    }
    private static WebElement getCheckout(WebDriver wd) {
        return wd.findElement(By.xpath(proceedXpath));
    }
    public static WebElement getQuantity(WebDriver wd) {
        return wd.findElement(By.xpath(quantityXpath));
    }
    public static WebElement getWhiteColor(WebDriver wd) {
        return wd.findElement(By.xpath(whiteColorXpath));
    }
    public static WebElement getDropdownSize(WebDriver wd) {return wd.findElement(By.xpath(dropDownSizeXpath));}
    public static WebElement getMediumSize(WebDriver wd) {return wd.findElement(By.xpath(mediumSizeXpath));}
    public static WebElement getAddToCartBtn(WebDriver wd) {return wd.findElement(By.xpath(addToCartBtnXpath));}
    public static WebElement getItemName(WebDriver wd) {return wd.findElement(By.xpath(itemNameXpath));}
    public static WebElement getWhiteColorSummary(WebDriver wd) {return wd.findElement(By.xpath(colorWhiteSummaryXpath));}
    public static WebElement getBoxShop(WebDriver wd) {return wd.findElement(By.xpath(boxShopXpath));}

    public static void hoverSummerDress_2(WebDriver wd, Actions action) {
        action.moveToElement(getSummerDress_2(wd)).build().perform();
    }
    public static void clickWhiteColor(WebDriver wd) {
        getWhiteColor(wd).click();
    }
    public static void clickAddToCart(WebDriver wd) {
        getAddToCartBtn(wd).click();
    }
    public static void clickCross(WebDriver wd) {
        getCross(wd).click();
    }
    public static void clickDropdownSize(WebDriver wd) {getDropdownSize(wd).click();}
    public static void clickMediumSize(WebDriver wd) {getMediumSize(wd).click();}
    public static void clickBoxShop(WebDriver wd) {getBoxShop(wd).click();}
    public static void clickCheckout(WebDriver wd) {
        getCheckout(wd).click();
    }
    public static String getQuantityValue(WebDriver wd) {
        return getQuantity(wd).getAttribute("value");
    }
    public static String getItemTitle(WebDriver wd) {
        return getItemName(wd).getText();
    }
    public static String getColorSummaryText(WebDriver wd) {
        return getWhiteColorSummary(wd).getText();
    }
}
