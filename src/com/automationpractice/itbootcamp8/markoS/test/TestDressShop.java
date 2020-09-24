package com.automationpractice.itbootcamp8.markoS.test;

import com.automationpractice.itbootcamp8.markoS.pages.SummerDresses;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

public class TestDressShop {
    static JavascriptExecutor js;

    @Test
    public void testDressShop() {
        SoftAssert sa = new SoftAssert();
        js = (JavascriptExecutor) Globals.wd;
        js.executeScript("arguments[0].scrollIntoView();", SummerDresses.getSummerDress_2(Globals.wd));
        Globals.wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        SummerDresses.hoverSummerDress_2(Globals.wd, Globals.action);
        SummerDresses.clickWhiteColor(Globals.wd);
        SummerDresses.clickDropdownSize(Globals.wd);
        SummerDresses.clickMediumSize(Globals.wd);
        SummerDresses.clickBoxShop(Globals.wd);
        SummerDresses.clickAddToCart(Globals.wd);
        SummerDresses.clickCross(Globals.wd);

        Globals.wd.navigate().back();
        Globals.wd.navigate().back();
        js.executeScript("arguments[0].scrollIntoView();", SummerDresses.getSummerDress_2(Globals.wd)); // Scroll to element until visible
        SummerDresses.hoverSummerDress_2(Globals.wd, Globals.action);
        SummerDresses.clickWhiteColor(Globals.wd);
        SummerDresses.clickDropdownSize(Globals.wd);
        SummerDresses.clickMediumSize(Globals.wd);
        SummerDresses.clickBoxShop(Globals.wd);
        SummerDresses.clickAddToCart(Globals.wd);
        SummerDresses.clickCheckout(Globals.wd);


        sa.assertEquals(SummerDresses.getQuantityValue(Globals.wd), "2");
        sa.assertEquals(SummerDresses.getItemTitle(Globals.wd), "Printed Summer Dress");
        sa.assertEquals(SummerDresses.getColorSummaryText(Globals.wd), "Color : White, Size : M");
        Globals.wd.navigate().back();
        Globals.wd.navigate().back();
    }
}
