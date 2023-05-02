package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.get("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb");

        driver.navigate().back();
        //Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();

        driver.quit();





    }
}
