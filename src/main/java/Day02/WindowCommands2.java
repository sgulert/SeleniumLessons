package Day02;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCommands2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        //getPosition()
        Point currentPoint = driver.manage().window().getPosition();
        int xCoord = currentPoint.getX();
        int yCoord = currentPoint.getY();

        System.out.println("xCoord = " + xCoord);

        System.out.println("yCoord = " + yCoord);

        //getSize()
        driver.manage().window().getSize();
        driver.quit();
    }
}
