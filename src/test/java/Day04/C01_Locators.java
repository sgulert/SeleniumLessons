package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Locators {
    //LOCATERS

    //Seleniumda 8 adet locater stratejisi vardır.

    //ID
        //web elementinin id attribute'udur.
        //id="value" şeklindeyse biz elementi value ile buluruz

    //NAME
        //web elementinin name attribute'udur.
        //name="value" şeklindeyse biz elementi value ile buluruz

    //CLASS
        //web elementinin class attribute'udur.
        //class="value" şeklindeyse biz elementi value ile buluruz

    //TAG
        //html elementinin tagleri ile locate etme stratejisidir.

    //LINK TEXT

    //PARTIAL LINK TEXT

    //CSS SELECTOR

    //XPATH

    @Test
    public void id() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchFields= driver.findElement(By.id("twotabsearchtextbox"));

    }

    public void name(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        driver.findElement(By.name("field-keywords"));

    }
    @Test
    public void className(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();driver.get("https://www.amazon.com/");

        WebElement searchField = driver.findElement(By.className("nav-input"));

    }
    public void tagName(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchField = driver.findElement(By.tagName("input"));

    }
    @Test
    public void linkText(){

        // LinkText locator u sadece <a> elementlerinde kullanilir.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement link= driver.findElement(By.linkText("Shop deals in Electronics"));
        link.click();

    }
    @Test
    public void linkTextdeneme() {

        // LinkText locator u sadece <a> elementlerinde kullanilir.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement link1 = driver.findElement(By.linkText("Today's Deals"));
        link1.click();
    }
    @Test
    public void partialLinkText(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement link = driver.findElement(By.partialLinkText("Shop great"));
        link.click();

    }
    @Test
    public void xpaath(){
        //  /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input// absolute xpath hiç kullanılmaz, bakım maliyeti yüksektir.
        // relative xpath-> syntax: //tagName[@attribute='value']            //aslında tüm locatorları xpath formatında yazabiliriz

        //örnek --> id= twotabsearchtextbox
        //xpath locator---> //input[@id='twotabsearchtextbox']

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchField= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchField.sendKeys("xpath başarılı");

    }






}
