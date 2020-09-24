package com.automationpractice.itbootcamp8.markoS.test;

import com.automationpractice.itbootcamp8.markoS.writeExcel.WriteExcelFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.awt.*;

public class Globals {
    public static WebDriver wd;
    public static String driver = "webdriver.chrome.driver";
    public static String PATH = "/home/marko/chromedriver/chromedriver_linux64/chromedriver";
    public static String url = "http://automationpractice.com/index.php";
    public static Actions action;
    public static Robot robot;

    @BeforeSuite
    public void init() throws AWTException {
        System.setProperty(driver, PATH);
        wd = new ChromeDriver();
        action = new Actions(Globals.wd);
        robot = new Robot();
        Globals.wd.get(Globals.url);
        Globals.wd.manage().window().maximize();
        WriteExcelFile write = new WriteExcelFile("testData.xlsx");
        write.generateData(30);
    }

    @AfterSuite
    public void close() {
        Globals.wd.close();
    }
}
