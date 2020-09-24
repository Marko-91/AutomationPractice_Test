package com.automationpractice.itbootcamp8.markoS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactLinks {
    private static String contactUsXpath = "//div[@id='contact-link']//a[contains(text(),'Contact us')]";
    private static String facebookXpath = "//li[@class='facebook']";
    private static String twitterXpath = "//li[@class='twitter']";
    private static String youTubeXpath = "//li[@class='youtube']";

    private static WebElement getContactUs(WebDriver wd) {
        return wd.findElement(By.xpath(contactUsXpath));
    }

    private static WebElement getFacebook(WebDriver wd) {
        return wd.findElement(By.xpath(facebookXpath));
    }

    private static WebElement getTwitter(WebDriver wd) {
        return wd.findElement(By.xpath(twitterXpath));
    }

    private static WebElement getYouTube(WebDriver wd) {
        return wd.findElement(By.xpath(youTubeXpath));
    }

    public static void clickContactUs(WebDriver wd) {
        getContactUs(wd).click();
    }
    public static void clickFacebook(WebDriver wd) {
        getFacebook(wd).click();
    }
    public static void clickTwitter(WebDriver wd) {
        getTwitter(wd).click();
    }
    public static void clickYouTube(WebDriver wd) {
        getYouTube(wd).click();
    }
}
