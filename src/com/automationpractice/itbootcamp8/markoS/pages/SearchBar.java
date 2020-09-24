package com.automationpractice.itbootcamp8.markoS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchBar {
    public static String searchBarXpath = "//input[@id='search_query_top']";
    public static String gridXpath = "product-container";

    private static WebElement getSearchBar(WebDriver wd) {
        return wd.findElement(By.xpath(searchBarXpath));
    }

    private static List<WebElement> getGrid(WebDriver wd) {
        return wd.findElements(By.className(gridXpath));
    }

    public static List<WebElement> getColorPickers(WebDriver wd) {
        return wd.findElements(By.xpath(".//ul[@class='color_to_pick_list clearfix']"));
    }

    public static void clickSearchBar(WebDriver wd) {
        getSearchBar(wd).click();
    }

    public static void setSearchBar(WebDriver wd, String s) {
        getSearchBar(wd).sendKeys(s);
    }

    public static int getGridSize(WebDriver wd) {
        return getGrid(wd).size();
    }

    public static boolean isCssAttributePresent(WebElement element, String attribute) {
        boolean result = false;
        try {
            String value = element.getCssValue(attribute);
            if (value.contains("rgb(241, 196, 15)")) {
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
