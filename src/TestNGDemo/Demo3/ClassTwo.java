package TestNGDemo.Demo3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {

    @BeforeTest
    public void beforeTestTAG()
    {
        System.out.println("beforeTestTAG");
    }
    @AfterTest
    public void afterTestTAG()
    {
        System.out.println("afterTestTAG");
    }

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }
    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }
    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
