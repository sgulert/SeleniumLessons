package Day08;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.slf4j.MDC.get;

public class C01_Alerts extends BaseClass {
    @Test
    public void alerts(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //click for js alert butonuna tıkla
        List<WebElement> buttons= driver.findElements(By.tagName("button"));
        buttons.get(0).click();

        //Alertteki ok butonuna tıkla
        driver.switchTo().alert().accept();


        //Js confirm butonuna tıkla
        buttons.get(1).click();

        //alertteki cancel butonuna tıkla
        driver.switchTo().alert().dismiss();

        //Js prompt butonuna tıkla
        buttons.get(2).click();

        //alert'e isim gir ve ok  a tıkla
        driver.switchTo().alert().sendKeys("canım ben");
        driver.switchTo().alert().accept();

        driver.switchTo().alert().getText();


    }
}
