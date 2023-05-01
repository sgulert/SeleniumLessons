package Day09;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C06_Actions extends BaseClass {

    //Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Put Rome to Italy
    // Put Washington to United States


    @Test
    public void test(){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement rome = driver.findElement(By.id("box6"));
        WebElement washington = driver.findElement(By.id("box3"));

        WebElement italy = driver.findElement(By.id("box106"));
        WebElement us = driver.findElement(By.id("box103"));

        Actions actions = new Actions(driver);

        // Yontem 1
        actions.dragAndDrop(rome,italy).perform();

        // Yontem 2
        // elemente git - tikla ve basili tut - diger elemente git - ve basili tutmayi birak

        actions.moveToElement(washington).clickAndHold().moveToElement(us).release().perform();






    }



}