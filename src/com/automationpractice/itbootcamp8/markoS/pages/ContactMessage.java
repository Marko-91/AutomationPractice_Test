package com.automationpractice.itbootcamp8.markoS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactMessage {
    private static String subjectHeadingXpath = "//select[@id='id_contact']";
    private static String dropdownElementXpath = "//option[contains(text(),'Webmaster')]";
    private static String emailXpath = "//input[@id='email']";
    private static String orderReferenceXpath = "//input[@id='id_order']";
    private static String attachFileXpath = "//input[@id='fileUpload']";
    private static String messageBodyXpath = "//textarea[@id='message']";
    private static String sendBtnXpath = "//span[contains(text(),'Send')]";
    private static String backBtnXpath = "//div[@class='columns-container']//div[@class='row']//span[1]";

    private static WebElement getSubjectHeading(WebDriver wd) {return wd.findElement(By.xpath(subjectHeadingXpath));}
    private static WebElement getDropdownElement(WebDriver wd) {return wd.findElement(By.xpath(dropdownElementXpath));}
    private static WebElement getEmail(WebDriver wd) {return wd.findElement(By.xpath(emailXpath));}
    private static WebElement getOrderReference(WebDriver wd) {return wd.findElement(By.xpath(orderReferenceXpath));}
    private static WebElement getAttachFile(WebDriver wd) {return wd.findElement(By.xpath(attachFileXpath));}
    private static WebElement getMessageBody(WebDriver wd) {return wd.findElement(By.xpath(messageBodyXpath));}
    private static WebElement getSendBtn(WebDriver wd) {return wd.findElement(By.xpath(sendBtnXpath));}
    private static WebElement getBackBtn(WebDriver wd) {return wd.findElement(By.xpath(backBtnXpath));}

    public static void clickCustomerService(WebDriver wd) {
        getSubjectHeading(wd).click();
    }

    public static void clickDropdownElement(WebDriver wd) {
        getDropdownElement(wd).click();
    }

    public static void setEmail(WebDriver wd, String s) {
        getEmail(wd).click();
        getEmail(wd).sendKeys(s);
    }

    public static void setOrderReference(WebDriver wd, String s) {
        getOrderReference(wd).click();
        getOrderReference(wd).sendKeys(s);
    }

    public static void setFile(WebDriver wd, String s) {
        getAttachFile(wd).sendKeys(s);
    }

    public static void setMessageBody(WebDriver wd, String s) {
        getMessageBody(wd).sendKeys(s);
    }

    public static void clickSendBtn(WebDriver wd) {
        getSendBtn(wd).click();
    }

    public static void clickBackBtn(WebDriver wd) {
        getBackBtn(wd).click();
    }
}
