package com.gtc.core.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

public class ExcelUtil {
    private final static Pattern EXCEL_2003 = Pattern.compile("^.*\\.xls$");
    private final static Pattern EXCEL_2007 = Pattern.compile("^.*\\.xlsx$");

    public static Workbook getExcel(InputStream inputStream, String fileName) throws IOException {
        Workbook workbook = null;
        if (EXCEL_2003.matcher(fileName).matches()) {
            workbook = new HSSFWorkbook(inputStream);
        } else if (EXCEL_2007.matcher(fileName).matches()) {
            workbook = new XSSFWorkbook(inputStream);
        }
        return workbook;
    }

    public static Workbook getExcel2003(InputStream inputStream) throws IOException {
        return new HSSFWorkbook(inputStream);
    }

    public static Workbook getExcel2007(InputStream inputStream) throws IOException {
        return new XSSFWorkbook(inputStream);
    }

}
