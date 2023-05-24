import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HRM_Activity4 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://alchemy.hguy.co/orangehrm");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //input[@id='txtUsername']")));
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");

        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");

        driver.findElement(By.xpath("//div[@id='divLoginButton']//input")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //img[@alt='OrangeHRM']")));
        driver.findElement(By.xpath(" //a//b[contains(text(),'PIM')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
        driver.findElement(By.xpath(" //input[@name='firstName']")).sendKeys("Liktha");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Sri");
        String ID = driver.findElement(By.xpath(" //input[@id='employeeId']")).getAttribute("value");
        driver.findElement(By.xpath("//input[@value='Save']")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Employee List')] ")).click();
        driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys(ID);
        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
        System.out.println(driver.findElement(By.xpath(" (//tbody//tr//td//a)[1]")).getText().equals(ID));

    }







    }
