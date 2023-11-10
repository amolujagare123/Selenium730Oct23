package AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Login {

    @Test
    public void myTest1() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();

        /*String expected = "https://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/

       /* String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

        String expected = "Dashboard";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }
       System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");
    }


    @Test
    public void myTest2() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();

        /*String expected = "https://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*/

       /* String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[contains(@class,'error')]")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");
    }


    @Test
    public void myTest3() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();



        ArrayList<String> expected = new ArrayList<>();
        expected.add("PLEASE ENTER A USERNAME");
        expected.add("PLEASE PROVIDE A PASSWORD");


        ArrayList<String> actual = new ArrayList<>();
        try {
           /* String actual1 = driver.findElements(By.xpath("//label[@class='error']")).getText();
            String actual2 = driver.findElement(By.xpath("//label[@for='login-password'][@class='error']")).getText();
            actual.add(actual1);
            actual.add(actual2);
*/

            List<WebElement> errorList = driver.findElements(By.xpath("//label[@class='error']"));

            actual.add(errorList.get(0).getText());
            actual.add(errorList.get(1).getText());

        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"This is not a dashboard");
    }
}
