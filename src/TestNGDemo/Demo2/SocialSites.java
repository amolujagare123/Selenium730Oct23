package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {

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
    public void facebook()
    {
        driver.get("http://facebook.com");
    }

    @Test
    public void twitter()
    {
        driver.get("http://twitter.com");
    }
    @Test
    public void linkedIn()
    {
        driver.get("http://linkedin.com");
    }
    @Test
    public void instagram()
    {
        driver.get("http://instagram.com");
    }
}
