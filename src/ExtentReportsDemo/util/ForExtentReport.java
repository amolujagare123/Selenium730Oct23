package ExtentReportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReport {

    public static String getScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot & assign the
        // current driver to it type cast the driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs store it into file object
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. save this file object into a real image file
        FileUtils.copyFile(scrFile,new File("Reports\\screenshots\\"+fileName));

        return fileName;
    }

    public static ExtentReports initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        ExtentReports extent = new ExtentReports();
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
        return extent;

    }
}
