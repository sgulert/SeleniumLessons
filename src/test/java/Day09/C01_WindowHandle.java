package Day09;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C01_WindowHandle extends BaseClass {
    @Test
    public void windowHandleTest(){
        //driver.getWindowHandle(); --------> mwvcut pencere ya da sekmenin window handledeğerini verir
        //driver.getWindowHandles();-------->tüm pencere ya da tablerin wimdow handle değerlerini set olarak bize döndürür.
        //driver.switchTo().window();-------> windowhandle değeri id olan window veya tabe geçiş yapmamızı sağlar
        //driver.switchTo().newWindow(TAB);------->Yeni sekme oluşturur
        //driver.switchTo().newWindow(WINDOW);---->yeni pencere oluşturur.

        // 1- browser ac
// 2- acilan sekmede https://www.amazon.com/ ac
// 3- yeni sekme olustur
// 4- acilan sekmede https://www.linkedin.com/ ac
// 5- yeni pencere olustur
// 6- acilan pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac

        driver.get("https://www.amazon.com/");
        System.out.println("amazon sekmasinin window handle değeri=" + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com/");
        System.out.println("linkedin window handle değeri = " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.quit();


    }
}
