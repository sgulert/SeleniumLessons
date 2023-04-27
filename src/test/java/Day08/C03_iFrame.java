package Day08;

import Utilities.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_iFrame extends BaseClass {
    //Go to URL: https://the-internet.herokuapp.com/iframe
    //Verify the Bolded text contains “Editor”
    //Locate the text box
    //Delete the text in the text box
    //Type “Hi everyone”
    //Verify the text Elemental Selenium text is displayed on the page.
    @Test
    public void iframeTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement h3= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(h3.getText().contains("Editor"));

        driver.switchTo().frame(0);

        WebElement texbox= driver.findElement(By.tagName("p"));
        texbox.clear();
        Thread.sleep(1000);
        texbox.sendKeys("hi everyone");

        driver.switchTo().parentFrame();
        WebElement elementialSelenium= driver.findElement(By.partialLinkText("Elemental"));
        Assert.assertTrue(elementialSelenium.isDisplayed());

        



    }
}
