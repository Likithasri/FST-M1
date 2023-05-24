import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HRM_Activity6 {

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
        System.out.println(driver.findElement(By.id("menu_directory_viewDirectory")).isEnabled());

        Thread.sleep(2000);
        if (driver.findElement(By.id("menu_directory_viewDirectory")).isEnabled()) {
            driver.findElement(By.id("menu_directory_viewDirectory")).click();
        }
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //h1[contains(text(),'Search Directory')]")));
System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Search Directory')]")).isDisplayed());

    }    }
