package JunitDemo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitLoginDemo2 {
    static WebDriver driver;

    @BeforeClass // method below this annotation will run before first test method of the class
    public static void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass  // method below this annotation will run after last test method of the class
    public static void closeBrowser()
    {
        driver.close();
    }
    @Test
    public void myTest1() {

        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
       // btnLogin.click();
    }

    @Test
    public void myTest2() {

        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("rerer");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("rerr");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
     //   btnLogin.click();
    }

    @Test
    public void myTest3() {

        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
     //   btnLogin.click();
    }
}
