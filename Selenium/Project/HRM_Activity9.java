import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HRM_Activity9 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //input[@id='txtUsername']")));
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");

        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");

        driver.findElement(By.xpath("//div[@id='divLoginButton']//input")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //img[@alt='OrangeHRM']")));
        Thread.sleep(1000);
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
Thread.sleep(1000  );
        JavascriptExecutor JS = (JavascriptExecutor) driver;

          WebElement EC = driver.findElement(By.xpath("//a[contains(text(),'Emergency Contacts')]"));
          JS.executeScript("arguments[0].scrollIntoView();", EC);


        driver.findElement(By.xpath("//a[contains(text(),'Emergency Contacts')]")).click();

        List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr"));
        int row = rows.size();

        List<WebElement> coulumns = driver.findElements(By.xpath("//tbody//tr[1]//td"));
        int column = coulumns.size();

        System.out.println(row);
        System.out.println(column);
        for (int i = 1; i <= row; i++) {

            for (int j = 2; j <= column; j++) {

                System.out.print((driver.findElement(By.xpath(" //tbody//tr[" + i + "]//td["+j+"]"))).getText()+ " ");
            }
            System.out.println("");
        }

    }}