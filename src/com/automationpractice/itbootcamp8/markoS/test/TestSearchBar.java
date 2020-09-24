package com.automationpractice.itbootcamp8.markoS.test;

import com.automationpractice.itbootcamp8.markoS.pages.SearchBar;
import com.automationpractice.itbootcamp8.markoS.pages.SummerDresses;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

public class TestSearchBar {
    static JavascriptExecutor js;

    @Test
    public void testSearchBar() {
        boolean isContained = false;
        SoftAssert sa = new SoftAssert();
        js = (JavascriptExecutor) Globals.wd;
        Globals.wd.navigate().back();
        SearchBar.clickSearchBar(Globals.wd);
        SearchBar.setSearchBar(Globals.wd, "yellow");
        Globals.wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Assert.assertEquals(SearchBar.getGridSize(Globals.wd), 3);
        js.executeScript("arguments[0].scrollIntoView();", SummerDresses.getSummerDress_2(Globals.wd)); // Scroll to element until visible

        for (WebElement colorPicker: SearchBar.getColorPickers(Globals.wd)) {
            for (WebElement colorSquare: colorPicker.findElements(By.xpath(".//li/a"))) {
                if (SearchBar.isCssAttributePresent(colorSquare, "background")) {
                    isContained = true;
                    break;
                }
            }
            sa.assertTrue(isContained, "Checking is RGB (241, 196, 15) present in element"); // Check after each grid element
            isContained = false; // Reset boolean value so that it can find in next color picker </ul>
        }

        sa.assertAll();
    }
}
