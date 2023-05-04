package Day13;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_WebTables extends BaseClass {

        // Webtable konusunda dikkat etmemiz gereken bazi noktalar

        // 1- Xpath locator unda ilgili seviyede index kullanirsak tek bir elemente isaret ederiz
        // 2-Xpath locator unda ilgili seviyede index kullanmazsak o seviyedeki tum elementleri isaret ederiz

        // 3- Satir sayisini istiyorsak int satirSayisi = driver.findElements(tr_locator).size()
        // 4- Sutun sayisini almak istersek oncelikle bir satiri locate edip o satirin altindaki tum hucrelerin sayisini almaliyiz
        //  int sutunSayisi = driver.findElements(By.xpath("//table//tr[1]//td")).size()


    @Test
    public void test01(){
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        //table ımız sabit bir locatora sahip olduğu için kodumuzu kısaltmak adına öncelikle tüm tabloyu locate ediyoruz
        WebElement tableData= driver.findElement(By.xpath("//table[@class='dataTable']//tbody"));

        WebElement row1cell3 = tableData.findElement(By.xpath(".//tr[1]//td[3]"));

        String text = row1cell3.getText();
        System.out.println("text = " + text);

        // Tabloda gezinmek icin ic ice iki for dongusu yazmamiz gerekiyor ve bu donguler icin satir ve sutun sayilarini ihtiyacimiz var

        int satirSayisi = tableData.findElements(By.xpath(".//tr")).size();
        int sutunSayisi = tableData.findElements(By.xpath(".//tr[1]//td")).size();


        // Ic ice dongulerdeki i degeri her bir gezinilen satiri j ise her bir sutunu temsil eder
        // bu yuzden en icteki for dongusunde bir element locate ederken bu satir ve sutun degerleri yerine i ve j yi kullaniriz

        for (int i = 1; i < satirSayisi+1; i++) {
            System.out.print("- ");
            for (int j = 1; j < sutunSayisi+1; j++) {

                WebElement currentCell = tableData.findElement(By.xpath(".//tr[" + i + "]//td[" + j + "]")); // .//tr[ i ]
                String cellValue = currentCell.getText();

                System.out.print(cellValue + " - ");
            }

            System.out.println();
        }


        System.out.println(getTableCellValue(tableData, 6,1));


    }

    //Devamli olarak tablolarda element locate ederken by locator yazmak can sikici olabilir.
    // Bu durumdan kacinmak icin bir defaligina method olusturup element locate ederken bu methodu cagirabiliriz
    //Asagidaki method 3 parametre alip ilk parametre olan tablonun belirtilen satir ve sutunlarindaki hucrenin text degerini bizlere verir.
    public String getTableCellValue(WebElement table, int row, int col){

        By locator = By.xpath(".//tr[" + row + "]//td[" + col + "]");
        WebElement cell = table.findElement(locator);

        return cell.getText();


    }


}
