import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {

       // WebDriver driver1 = new ChromeDriver(); //up-casting

        WebDriver driver  = new FirefoxDriver();
      //  WebDriver driver  = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("http://facebook.com");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().refresh();


    }
}
