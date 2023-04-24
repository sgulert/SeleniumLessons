package Day05;

import Utilities.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_XpathExercises extends BaseClass {
    @Test
    public void test01(){//positive case
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adresine git
        //username alanna Admin yaz
        //password alanına admin123 gir
        //login butonuna tıkla
        //sisteme giriş yapıldığına doğrulama

        //expected result= giriş yapılabilmeli
        //actual rresult= ?

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//*[@placeholder][@type]"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @Test
    public void test02() throws InterruptedException {//negative test case
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adresine git
        //username alanna Adminnn yaz
        //password alanına admin123 gir
        //login butonuna tıkla
        //sisteme giriş yapıldığına doğrulama

        //expected result= hata vermeli "Invalid credentials"
        //actual rresult= ?

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // name attribute u 'user' ile baslayan ve placeholder attribute u 'name' iceren input elementi
        WebElement username = driver.findElement(By.xpath("//input[starts-with(@name, 'user')][contains(@placeholder,'name')]"));
        username.sendKeys("Adminnn");


        WebElement password = driver.findElement(By.xpath("//input[contains(@type,'pass')]"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(.,'Login')]"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement errorMessage=driver.findElement(By.xpath("//p[.='Invalid credentials']"));
        Assert.assertTrue(errorMessage.isDisplayed());

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Assert.assertEquals(expectedUrl,actualUrl);

    }

}
