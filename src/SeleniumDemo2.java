import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); //up-casting

       // WebDriver driver  = new FirefoxDriver();
      //  WebDriver driver  = new EdgeDriver();
      //  driver.manage().window().maximize();
        driver.get("http://gmail.com");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://facebook.com");
        Thread.sleep(4000);

      //  driver.close(); // closes the current window only
        driver.quit(); // close all windows opened by the driver

    }
}
