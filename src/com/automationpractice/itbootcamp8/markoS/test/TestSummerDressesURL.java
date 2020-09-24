package com.automationpractice.itbootcamp8.markoS.test;

import com.automationpractice.itbootcamp8.markoS.pages.Home;
import com.automationpractice.itbootcamp8.markoS.writeExcel.WriteExcelFile;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestSummerDressesURL {

    @Test
    public void testSummerDressesURL() {
        SoftAssert sa = new SoftAssert();

        Home.hoverWomanDropdown(Globals.wd, Globals.action);
        Globals.wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);     // For slower users
        Home.clickSummerDresses(Globals.wd);
        String urlExpected = "http://automationpractice.com/index.php?id_category=11&controller=category";
        String urlActual_1 = Globals.wd.getCurrentUrl();
        sa.assertEquals(Globals.wd.getCurrentUrl(), urlExpected);

        // wd.navigate().back();

        Home.hoverDressesDropdown(Globals.wd, Globals.action);
        Home.clickSummerDress(Globals.wd);
        urlExpected = "http://automationpractice.com/index.php?id_category=11&controller=category";
        String urlActual_2 = Globals.wd.getCurrentUrl();
        sa.assertEquals(Globals.wd.getCurrentUrl(), urlExpected);
        sa.assertTrue(urlActual_1.equals(urlActual_2));

        sa.assertAll();
    }
}
