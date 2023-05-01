package Day09;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class C03_WindowHandle extends BaseClass {
    @Test
    public void windowHandles(){
        // 1- browser ac
// 2- acilan sekmede https://www.amazon.com/ ac
// 3- yeni sekme olustur
// 4- acilan sekmede https://www.linkedin.com/ ac
// 5- yeni pencere olustur
// 6- acilan pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac
        driver.get("https://www.amazon.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();

        while (itr.hasNext()){
            String currentHandle=itr.next();
            driver.switchTo().window(currentHandle);
            //System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

            if (driver.getTitle().toLowerCase().contains("amazon")){
                break;
            }

        }
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("amazon sekmesini buldun");

    }
}
