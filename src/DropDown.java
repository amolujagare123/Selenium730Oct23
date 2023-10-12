import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");


        // 1. find the element
        WebElement drpTxt = driver.findElement(By.id("seltext"));

        // 2. create the object of select class
        Select selTxt =  new Select(drpTxt);

        // 3. select the option

        Thread.sleep(4000);
       // selTxt.selectByVisibleText("text 2");
       // selTxt.selectByIndex(3);
        selTxt.selectByValue("v13");



    }
}
