package Day11;

import Utilities.BaseClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Iterator;
import java.util.Set;

public class C01_Cookies extends BaseClass {

    public void printCookies(){
        Set<Cookie> cookies = driver.manage().getCookies();//get cookies

        Iterator<Cookie> iterator= cookies.iterator();
        while (iterator.hasNext()){
            Cookie currentCookie=iterator.next();
            String cookieName= currentCookie.getName();
            String cookieValue = currentCookie.getValue();
            System.out.println("Name = " + cookieName + ", Value= "+ cookieValue);//print
        }

    }
    @Test
    public void test01(){

        //Go to URL: https://kitchen.applitools.com/ingredients/cookie
        //Get Cookie.
        //Find the total number of cookies.
        //Print all the cookies.
        //Add Cookie.
        //Edit Cookie.
        //Delete Cookie.
        //Delete All Cookies.


        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        Set<Cookie> cookies = driver.manage().getCookies();//get cookies
        System.out.println("cookies.size() = " + cookies.size());//find th enumber of all cokies

        Iterator<Cookie> iterator= cookies.iterator();
        while (iterator.hasNext()){
            Cookie currentCookie=iterator.next();
            String cookieNames= currentCookie.getName();
            String cookieValue = currentCookie.getValue();
            System.out.println("Name = " + cookieNames + ", Value= "+ cookieValue);//print
        }
        Cookie cookie = new Cookie("dessert","baklava");
        driver.manage().addCookie(cookie);
        Assert.assertEquals(cookie.getValue(), driver.manage().getCookieNamed(cookie.getName()).getValue());

        Assert.assertEquals("cooki ekleme başarısız ",cookies.size()+1 ,driver.manage().getCookies().size());


        driver.manage().addCookie(new Cookie("dessert", "güllaç"));//edit cookie
        printCookies();

        driver.manage().deleteCookieNamed("protein");//delete cookie
        System.out.println("cookies.size() = " + cookies.size());

        driver.manage().deleteAllCookies();//delete all cookies




    }
}
