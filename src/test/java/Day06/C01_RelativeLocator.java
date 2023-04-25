package Day06;

import Utilities.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class C01_RelativeLocator extends BaseClass {
    @Test
    public void relativeLocator(){
//        Go to http://www.bestbuy.com
//        Verify that the page title contains "Best" Also
//        , using Relative Locator.
//        LogoTest  Verify if the BestBuy logo is displayed.
//        usaLinkTest  Verify if the link is displayed.

        driver.get("http://www.bestbuy.com");
        String pageTitle=driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Best"));

       By USLocator= RelativeLocator.with(By.tagName("a")).toRightOf(By.xpath("(//a[@class='canada-link'])[1]"));
       WebElement logo= driver.findElement(USLocator);
       Assert.assertTrue(logo.isDisplayed());







    }

}
