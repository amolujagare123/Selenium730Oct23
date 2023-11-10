package TestNGDemo.real;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites extends initTests {



    @Test
    public void chatGTP()
    {
        driver.get("https://chat.openai.com/");
        Assert.assertEquals(true,false,"this test is failed");
    }

    @Test
    public void midjourney()
    {
        driver.get("https://midjourney.com/");
    }
    @Test
    public void synthesia()
    {
        driver.get("http://www.synthesia.io");
    }
}
