package Day07;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class C01_DropDown extends BaseClass {
    //dropdownlar özel etkileşimler gerektirdiğinden selenium bize dropdownlar için ayrı bir class oluşturmuştur.
    //select class

    //dropdownlar ile çalışırken yapılacak işlem
    //1- <select> elementini kontrol et
    // 2- select objesi oluştur -> Select select =new Select(element);
    //3- select obj kullanarak özel methodlardan yararlan
    @Test
    public void dropdown() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        //1. adım
        WebElement oldselectMenu= driver.findElement(By.id("oldSelectMenu"));
        //2. adım
        Select select = new Select(oldselectMenu);


        //select elementinde seçim yapmamızı sağlayan 3 method
        // 1- selectByIndex() -> option elementinin indexi
        // 2- selectByValue() -> option elemeninin value attribute u
        // 3- selectByVisibleText() -> option elementinin gorunur yazisi (contenti)

        select.selectByIndex(4); // 5. siradaki 'Purple' secilir
        Thread.sleep(2000);
        select.selectByValue("red"); // value attribute u 'red' olan 'Red' secilir
        Thread.sleep(2000);
        select.selectByVisibleText("Magenta"); //Contenti 'Magenta' olan 'Magenta' secilir

        //Select elementinde secim kaldirmamizi saglayan methodlar,sadece multi select ile kullanılabilen methodlardır

        // 1- deselectByIndex() -> option elementinin indexi
        // 2- deselectByValue() -> option elemeninin value attribute u
        // 3- deselectByVisibleText() -> option elementinin gorunur yazisi (contenti)
        // 4- deselectAll() -> Butun secimleri kaldirir.

        //select elementlerinde info amacıyla kullanılan methodlar
        //select.getAllSelectedOptions();
        //select.getFirstSelectedOption();
        //select.getOptions();
        //select.isMultiple();

    }

    @Test
    public void getOptionUsafe(){
        driver.get("https://demoqa.com/select-menu");
        WebElement oldselectMenu= driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldselectMenu);

        //getOptions methodu sayesinde optionlar List<WebElement> olarak elimize geçmiş olur
        //bu listeyi lambdanın map methodunu kullanarak bu elementlerin value veya textlerini alabilriz.

        List<WebElement> options= select.getOptions();
        List<String> optionContent= options.stream().map(t->t.getAttribute("value")).collect(Collectors.toList());




    }

}
