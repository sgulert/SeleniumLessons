package Day12;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C02_Excel {
    @Test
    public void test() throws IOException {

        String path = System.getProperty("user.dir")+"\\src\\test\\resources\\excelfile.xlsx";

        FileInputStream fis= new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fis);

        Map<String,String> data =new HashMap<>();
        Sheet sheet1= wb.getSheetAt(0);


        int lastRowIndex = sheet1.getLastRowNum();
        System.out.println("lastRowIndex = " + lastRowIndex);
        //getLastRowNum() methodu son kullanilan row un INDEX bilgisini bize verir.


        int lastRowNumber = sheet1.getPhysicalNumberOfRows();
        System.out.println("lastRowNumber = " + lastRowNumber);

        for (int i = 0; i <= lastRowIndex; i++) {

            // Ilk row key ikinci row value olarak map objesine ekleyecegiz

            String country = sheet1.getRow(i).getCell(0).toString();

            String area = sheet1.getRow(i).getCell(1).toString();

            data.put(country, area);

       }




        // Eger sutun ve satir sayisi bilinmiyorsa ic ice 2 for dongusune ihtiyacimiz vardir.
        // satir sayisi bilgisini sheet uzerinden, sutun sayisi bilgisini ise row uzerinden aliriz

        int satirSayisi = sheet1.getLastRowNum();
        int sutunSayisi = sheet1.getRow(0).getLastCellNum();
        System.out.println("sutunSayisi = " + sutunSayisi);

        String[][] arr = new String[satirSayisi+1][sutunSayisi+1];

        for (int i = 0; i <= satirSayisi; i++) {

            for (int j = 0; j < sutunSayisi; j++) {

                arr[i][j] = sheet1.getRow(i).getCell(j).toString();
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println(arr[4][0]);


    }




    }

