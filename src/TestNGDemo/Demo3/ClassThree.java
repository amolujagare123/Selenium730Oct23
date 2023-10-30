package TestNGDemo.Demo3;

import org.testng.annotations.*;

public class ClassThree {


    @BeforeSuite
    public void beforeTestSUITE()
    {
        System.out.println("beforeTestSUITE");
    }
    @AfterSuite
    public void afterTestSUITE()
    {
        System.out.println("afterTestSUITE");
    }

    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }
    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }
    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
