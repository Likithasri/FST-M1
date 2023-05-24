import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HRM_Activity2 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    String URL= driver.findElement(By.xpath("//div[@id='divLogo']//img")).getAttribute("src");
System.out.println("URL is "+URL);

    }
}