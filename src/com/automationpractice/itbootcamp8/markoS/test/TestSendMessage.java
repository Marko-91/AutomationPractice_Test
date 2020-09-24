package com.automationpractice.itbootcamp8.markoS.test;

import com.automationpractice.itbootcamp8.markoS.pages.*;
import com.automationpractice.itbootcamp8.markoS.readExcel.ReadExcelFile;
import org.testng.annotations.*;

public class TestSendMessage {

    @Test(dataProvider = "testData")
    public static void testSendMessage(String email, String id, String message) {
        ContactLinks.clickContactUs(Globals.wd);
        ContactMessage.clickCustomerService(Globals.wd);
        ContactMessage.clickDropdownElement(Globals.wd);
        ContactMessage.setEmail(Globals.wd, email);
        ContactMessage.setOrderReference(Globals.wd, id);
        ContactMessage.setMessageBody(Globals.wd, message);
        ContactMessage.setFile(Globals.wd, "/home/marko/Pictures/Wallpapers/20200708_133558.jpg");
        ContactMessage.clickSendBtn(Globals.wd);
        ContactMessage.clickBackBtn(Globals.wd);
    }

    @DataProvider(name = "testData")
    public Object[][] testDataFeed() {
        ReadExcelFile config = new ReadExcelFile("testData.xlsx");
        int rows = config.getRowCount(0);
        Object[][] credentials = new Object[rows][3];

        for (int i = 0; i < rows; i++) {
            credentials[i][0] = config.getData(0, i, 0);
            credentials[i][1] = config.getData(0, i, 1);
            credentials[i][2] = config.getData(0, i, 2);
        }

        return credentials;
    }


}
