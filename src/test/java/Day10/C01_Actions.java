package Day10;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C01_Actions extends BaseClass {

    // https://www.google.com/ u ac
    // Arama kismina chatGPT yaz

    @Test
    public void test(){
        driver.get("https://www.google.com/");
        WebElement search= driver.findElement(By.name("q"));

        // Mouse hareketlerinde basili tutma islemi clickAndHold() methodu ile yapilir
        // Basili tutma islemi release() methodu ile sonlandirilir.

        // keyDown() klavyede bir tusa basili tutmayi saglar
        // keyUp() ise basili tutma islemini sonlandirir

        //search.sendKeys("chatgpt");

        actions.
                moveToElement(search).
                click().
                sendKeys(search,"chat").
                keyDown(Keys.SHIFT).
                sendKeys("gpt").
                keyUp(Keys.SHIFT).
                perform();

    }

}
