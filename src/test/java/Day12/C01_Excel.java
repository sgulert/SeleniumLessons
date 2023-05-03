package Day12;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Excel {

    //hücre okuma

    @Test
    public void test01() throws IOException {
        //okunacak excel dosyamızın path'i
        String path = System.getProperty("user.dir")+"\\src\\test\\resources\\excelData.xlsx";

        //path kullanılarak oluşturulan file input objesi
        FileInputStream fis= new FileInputStream(path);


        //excell hiyerarşisi ---> workbook - worksheet - row - celldata

        //file input stream ile oluşturulan workbook objesi
        Workbook wb = WorkbookFactory.create(fis);

        //okuma işlemlerine başlayabiliriz
        Sheet sheet = wb. getSheetAt(0);
        Row row = sheet.getRow(2);
        Cell cell=row.getCell(3);

        String cellvalue= cell.toString();
        System.out.println("cellvalue = " + cellvalue);

        wb.close();


    }
}
