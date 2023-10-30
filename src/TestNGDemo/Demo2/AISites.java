package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {

    WebDriver driver;
    @BeforeClass
    public void openBrowser()
    {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
    }
    @AfterClass
    public void closeBrowser()
    {
        driver.close();
    }

    @Test
    public void chatGTP()
    {
        driver.get("https://chat.openai.com/");
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
