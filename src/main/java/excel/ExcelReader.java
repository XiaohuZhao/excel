package excel;


import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;

public class ExcelReader {
    private static final Logger LOGGER = Logger.getLogger(ExcelReader.class);
    public Workbook createWorkBook(InputStream inputStream,String excelFileName) throws IOException {
        if (excelFileName.endsWith("xls")){
            return new HSSFWorkbook(inputStream);
        }else{
            return new XSSFWorkbook(inputStream);
        }
    }
}
