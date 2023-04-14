package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControlCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        //browser control commands
        String pageTitle= driver.getTitle();

        System.out.println("pageTitle = " + pageTitle);

        String pageUrl=driver.getCurrentUrl();
        System.out.println("pagrUrl = " + pageUrl);

        driver.getPageSource();//geçerli sayfanın kaynak html kodunu getirir.

        driver.close();//geçerli sekmeyi kapatır,tek sekme ise browserı da kapatır.

        driver.quit();//tüm sekmeleri ve browserı kapatır.




    }
}
