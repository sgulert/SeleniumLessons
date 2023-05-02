package Day10;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static org.bouncycastle.crypto.tls.ContentType.alert;

public class C02_JS_Executor extends BaseClass {
    @Test
    public void jsExecutor(){
        driver.get("https://www.amazon.com/");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("alert(\"merhaba dünya\");");
    }

    @Test
    public void scrollWithUs() throws InterruptedException {
        // Bunlar JS methodlari

        // scrollBy()
        // scrollTo()
        // scrollIntoView()

        driver.get("https://www.amazon.com/");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,700);");
        //sayfada 700 piksel aşağıya scroll yaptık

        Thread.sleep(3000);

        jse.executeScript("window.scrollTo(0,0)");
        //sayfanın başına gittik
        Thread.sleep(1000);

        jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        //sayfanın sonuna gittik

        jse.executeScript("window.scrollTo(0,document.body.scrollHeight/2);");
        //düz mantıkta sayfanın tam ortasına gittik

        jse.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//img[@alt='Beauty picks']")));

        //jse.executeScript("arguments[0].click() scrollIntoView()",driver.findElement(By.xpath("//img[@alt='Beauty picks']")));









    }
}
