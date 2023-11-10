import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementsDemo {

    @Test
    public void loginDemo()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

      //  WebElement element = driver.findElement(By.xpath("//input[contains(@class,'round')]"));

        List<WebElement> wblist = driver.findElements(By.xpath("//input[contains(@class,'round')]"));
        System.out.println("size="+wblist.size());

        wblist.get(0).sendKeys("admin");
        wblist.get(1).sendKeys("admin");
        wblist.get(2).click();

    }
}
