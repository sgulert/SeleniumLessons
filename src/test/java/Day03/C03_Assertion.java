package Day03;

import org.junit.Assert;
import org.junit.Test;

public class C03_Assertion {
    public int divide(int a,int b){
        return a/b;
    }
    // divide diye bir fonksiyon var 2 parametre alir ilk parametreyi ikinciye boler. Bu method u bizim icin test eder misin?

    // Senaryo 1: Birbirine tam bolunen iki sayi methoda saglanirsa cikti bolumleri olmalidir. ORN divide(10,2) == 5
    // Senaryo 2: Birbirine tam bolunemeyen iki sayi methoda saglanirsa cikti virgullu sayi olmali? ORN: 5,2 == 2.5
    // Senaryo 3: Ikinci sayi sifir saglandiginda method -1 donmeli ORN: 9,0 == -1
    @Test
    public void positiveTest1(){
        int expected = 5;
        int actual = divide(10,2);
        //Assert.assertEquals()
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void positiveTest2(){
        double expected = 2.5;
        int actual = divide(5,2);
        Assert.assertTrue(expected==actual);

    }
    @Test
    public void positiveTest3(){
        int expected = -1;
        int actual = divide(9,0);
        Assert.assertFalse(expected==actual);

    }
}

