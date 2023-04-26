package Day07;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C02_SeleniumWaits extends BaseClass {
    //selenum waits seleneium için kritik bir konsepttir.
    // senkronize bir şekilde elementleri bulmamızı ve elementnotfound gibi hataları almamızı engeller.

    //Selenium Waits 3 türdür;
    //1---> Implicit Wait  (Elemetlerin locate edilmesinde yardımcı olur)
    //                     (unable to locate element, element not found gibi hataların alınmasını önler. )
    //                     (Global bir wait türüdür)
    //                     (Element belirlenen süre boyunca locate edilmeye çalışılır.Bulunmadığı takdirde hata fırlatılır.Bulubursa bekleme sonlanır)
    //                     driver.manage().timesouts().implicitlywait()



    //2---> Explicit Wait   (ımplicit wait'in yetersiz olduğu durumlarda kullanılır.)
    //                      (çok daha fazla condition vardır)
    //                      (bu conditionlar seçilebilir veya custom olarak yazılabilir)
    //                      (çok fazla durumda bekleme konusunda yardımcı olur)
    //                      (local bir waittir, her bir element için ayrı ayrı çağırılır)
    //                      (Element belirlenen süre boyunca locate edilmeye çalışılır.Bulunmadığı takdirde hata fırlatılır.Bulubursa bekleme sonlanır)
    //                       WebDriverWait wait=new WebDriverWait(driver,duration)
    //                       wait.until(condition(element))


    //3---> Fluent Wait
    @Test
    public void explicitWait(){

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.);

    }

}
