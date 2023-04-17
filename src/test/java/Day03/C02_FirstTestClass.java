package Day03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;


public class C02_FirstTestClass {
    @Before
    public void  beforeTestMethod(){
        System.out.println("browser açma işlemler yapıldı.");
    }
    @Test
    public void myLittleTinyTest1(){
        System.out.println("test1 executed");

    }
    @Test
    public void test02(){
        System.out.println("test 2 executed");
    }
    @After
    public void afterTestMethod(){
        System.out.println("browser kapama işlemleri yapıldı");
    }
    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("before class çalıştı");
    }
    @AfterClass
    public static void afterClassMethod(){
        System.out.println("after class çalıştı");
    }



}
