package Day06;

import Utilities.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C04_RadioButton extends BaseClass {
    @Test
    public void radioButton(){
        driver.get("https://tr-tr.facebook.com/");
        driver.findElement(By.xpath("//a[@data-testid]")).click();

        WebElement femaleRadio= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement maleRadio= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement customRadio= driver.findElement(By.xpath("(//input[@type='radio'])[3]"));

        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());

        femaleRadio.click();

        Assert.assertTrue(femaleRadio.isSelected());
        Assert.assertTrue(!maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());

        maleRadio.click();

        Assert.assertTrue(!femaleRadio.isSelected());
        Assert.assertTrue(maleRadio.isSelected());
        Assert.assertTrue(!customRadio.isSelected());







    }

}
