package com.automationpractice.itbootcamp8.markoS.writeExcel;

import de.svenjacobs.loremipsum.LoremIpsum;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.UUID;

public class WriteExcelFile {
    private FileOutputStream fos;
    private XSSFWorkbook wb;
    private XSSFSheet sheet;

    public WriteExcelFile(String fileName) {
        try {
            fos = new FileOutputStream(fileName);
            wb = new XSSFWorkbook();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void generateData(int rows) {
        wb.createSheet();
        sheet = wb.getSheetAt(0);
        LoremIpsum lorem = new LoremIpsum();
        for (int i = 0; i < rows; i++) {
            Row row = sheet.createRow(i);
            row.createCell(0);
            row.createCell(1);
            row.createCell(2);
            String lore = lorem.getWords(1, i);
            lore = lore.replace(",", "");
            sheet.getRow(i).getCell(0).setCellValue(lore + "@test.com");     // E-mail
            sheet.getRow(i).getCell(1).setCellValue(UUID.randomUUID().toString());  // Order Reference
            sheet.getRow(i).getCell(2).setCellValue(lorem.getWords(30, i));    // Message
        }

        try {
            wb.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
