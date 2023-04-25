package Day06;

import Utilities.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_CheckBoxes extends BaseClass {
    @Test
    public void checkboxes() {

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

        checkBox1.click();
        checkBox2.click();

        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());




    }
}
