package Day03;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.junit.Test;

public class C04_AssertionMethods {
    @Test
    public void assertEqualsTest(){
        //2 parametre alınırsa parametreler karşılaştırılır ve eşitlerse test passed olur değilse Assertionerror fırlatır
        Assert.assertEquals(1,0);

    }
    @Test
    public void assertTrueTest(){
        //1 parametre alır ve parametrenin true olması durumunda passed, false olması durumunda failed olur
        Assert.assertTrue(true);
    }
    @Test
    public void assertFalseTest(){
    //1 parametre alır ve parametrenin true olması durumunda passed, false olması durumunda failed olur
        Assert.assertFalse(false);
    }
    @Test
    public void assertSameTest(){ //bunun bir de not same i var, aynı mantık
        //Obje kontrolü, değer ve adresler aynı olmalıdır.
        Assert.assertSame(new String ("Sumeyye"), new String ("Sumeyye"));
    }
    @Test
    public void assertArrayEquals(){
        int arr[]={1,2,3,4,5}; int arr2[]={5,4,3,2,1};
        Assert.assertArrayEquals(arr,arr2);
    }
    @Test
    public void assertWithMessage(){
        Assert.assertEquals("bu değerler eşit değil",1,5);
    }
}
