package ExtentReportsDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo {

    @Test
    public void myTest3() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com/");


        // 1. create the object reference of TakesScreenshot & assign the
        // current driver to it type cast the driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs store it into file object
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. save this file object into a real image file
        FileUtils.copyFile(scrFile,new File("D:\\screenshots\\"+fileName));
    }

    }
