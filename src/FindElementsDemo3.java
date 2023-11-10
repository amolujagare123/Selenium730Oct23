import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsDemo3 {

    @Test
    public void loginDemo()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

      //  WebElement element = driver.findElement(By.xpath("//input[contains(@class,'round')]"));

      //  List<WebElement> wblist = driver.findElements(By.xpath("//a"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement wb = driver.findElement(By.xpath("//a[not(contains(@href,'https:'))]"));

        System.out.println(wb.getText());


    }
}
