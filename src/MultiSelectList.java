import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");


       WebElement multiList = driver.findElement(By.id("multiSel"));
       Select selMultiList = new Select(multiList);

       Thread.sleep(4000);

        selMultiList.selectByVisibleText("text 1");
        selMultiList.selectByIndex(2);
        selMultiList.selectByIndex(3);

        Thread.sleep(4000);

     /*   selMultiList.deselectByIndex(3);
        selMultiList.deselectByIndex(0);*/

        selMultiList.deselectAll();


    }
}
