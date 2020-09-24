package com.automationpractice.itbootcamp8.markoS.test;

import com.automationpractice.itbootcamp8.markoS.pages.ContactLinks;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestContactLinks {
    @Test
    public void testContactLinks(){
        SoftAssert sa = new SoftAssert();

        ContactLinks.clickContactUs(Globals.wd);
        ContactLinks.clickFacebook(Globals.wd);
        ArrayList<String> tabs = new ArrayList<>(Globals.wd.getWindowHandles());
        Globals.wd.switchTo().window(tabs.get(1)); // Change focus to new tab
        Globals.wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        assertFacebookLink(sa);

        Globals.wd.switchTo().window(tabs.get(0));   // Change focus back to old tab
        ContactLinks.clickTwitter(Globals.wd);
        tabs = new ArrayList<>(Globals.wd.getWindowHandles());     // Add the window to the list
        Globals.wd.switchTo().window(tabs.get(2));
        Globals.wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        assertTwitterLink(sa);

        Globals.wd.switchTo().window(tabs.get(0));
        ContactLinks.clickYouTube(Globals.wd);
        tabs = new ArrayList<>(Globals.wd.getWindowHandles());
        Globals.wd.switchTo().window(tabs.get(3));
        Globals.wd.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        assertYouTubeLink(sa);
        Globals.wd.switchTo().window(tabs.get(0));

        sa.assertAll();
    }

    private void assertFacebookLink(SoftAssert sa) {
        sa.assertEquals(Globals.wd.getCurrentUrl(), "https://www.facebook.com/groups/525066904174158/");
    }

    private void assertTwitterLink(SoftAssert sa) {
        sa.assertEquals(Globals.wd.getCurrentUrl(), "https://twitter.com/seleniumfrmwrk");
    }

    private void assertYouTubeLink(SoftAssert sa) {
        sa.assertEquals(Globals.wd.getCurrentUrl(), "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA");
    }
}
