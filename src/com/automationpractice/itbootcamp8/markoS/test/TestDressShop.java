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
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Globals.wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        SummerDresses.hoverSummerDress_2(Globals.wd, Globals.action);
        SummerDresses.clickWhiteColor(Globals.wd);
        SummerDresses.clickAddToCart(Globals.wd);
        SummerDresses.clickCross(Globals.wd);

        Globals.wd.navigate().back();

        SummerDresses.hoverSummerDress_2(Globals.wd, Globals.action);
        SummerDresses.clickWhiteColor(Globals.wd);
        SummerDresses.clickAddToCart(Globals.wd);
        SummerDresses.clickCheckout(Globals.wd);

        sa.assertEquals(SummerDresses.getQuantityValue(Globals.wd), "2");
        sa.assertEquals(SummerDresses.getItemTitle(Globals.wd), "Printed Summer Dress");
        sa.assertEquals(SummerDresses.getColorSummaryText(Globals.wd), "Color : White, Size : S");
        Globals.wd.navigate().back();
    }
}
