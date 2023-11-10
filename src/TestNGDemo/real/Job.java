package TestNGDemo.real;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Job extends initTests{


    @Test
    public void naukri()
    {
        driver.get("http://naukri.com");
        Assert.assertEquals(driver.getTitle(),
                "naukri123","this is not a naukri page");
    }

    @Test
    public void foundit()
    {
        driver.get("http://foundit.com");
    }
    @Test
    public void shine()
    {
        driver.get("http://shine.com");
    }

}
