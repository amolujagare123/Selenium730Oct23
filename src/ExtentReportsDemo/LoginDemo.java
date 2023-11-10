package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static ExtentReportsDemo.util.ForExtentReport.getScreenshot;

public class LoginDemo {
    ExtentReports extent;
    @BeforeClass
    public void initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Developers name","Hari");
        extent.setSystemInfo("Testers name","Shivani");
        extent.setSystemInfo("Project Category","in house product");
        extent.setSystemInfo("Dead line","31 Dec 2023");
        extent.setSystemInfo("Environment","Local");
        extent.setSystemInfo("OS","Windows 11");
        extent.setSystemInfo("Browser","Chrome");

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }
    @Test
    public void myTest1() throws IOException {

        ExtentTest test = extent.createTest("valid login");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened");

        driver.get("https://stock.scriptinglogic.org/");
        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();

        test.info("login button is cliked");

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

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("this test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }
    }

    @Test
    public void myTest2() throws IOException {

        ExtentTest test = extent.createTest("invalid login");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened");

        driver.get("https://stock.scriptinglogic.org/");
        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();

        test.info("login button is cliked");

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("this test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }
    }
    @Test
    public void myTest3() throws IOException {

        ExtentTest test = extent.createTest("blank login");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened");

        driver.get("https://stock.scriptinglogic.org/");
        test.info("url is opened");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("dsdsd");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
        txtPassword.sendKeys("dsdsd");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@value='LOG IN']"));
        btnLogin.click();

        test.info("login button is cliked");

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

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("this test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));

        }
    }


}
