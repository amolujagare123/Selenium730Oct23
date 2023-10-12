import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // dealing with 1st list box
        WebElement jobLocation = driver.findElement(By.id("source_118"));
        Select selJobLocation = new Select(jobLocation);

        selJobLocation.selectByVisibleText("Bangalore");
        selJobLocation.selectByVisibleText("Mumbai");
        selJobLocation.selectByVisibleText("Noida");

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();


        // dealing with 2nd list box
        WebElement location2 = driver.findElement(By.id("fld_118"));
        Select selLocation2 = new Select(location2);
        selLocation2.selectByIndex(0);
        selLocation2.selectByIndex(2);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();

    }
}
