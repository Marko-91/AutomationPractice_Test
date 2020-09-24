package com.automationpractice.itbootcamp8.markoS.readExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    private XSSFWorkbook wb;
    private XSSFSheet sheet;

    public ReadExcelFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            wb = new XSSFWorkbook(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getData(int sheetNum, int row, int col) {
        sheet = wb.getSheetAt(sheetNum);
        String data = sheet.getRow(row).getCell(col).getStringCellValue();
        return data;
    }

    public int getRowCount(int sheetIndex) {
        return wb.getSheetAt(sheetIndex).getLastRowNum();
    }
}

