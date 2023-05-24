import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HRM_Activity5 {
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
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("//input[@value='Edit']")).click();
        driver.findElement(By.xpath("//input[@title='First Name']")).clear();
        driver.findElement(By.xpath("//input[@title='First Name']")).sendKeys("Likitha");
        driver.findElement(By.xpath("//input[@title='Last Name']")).clear();
        driver.findElement(By.xpath("//input[@title='Last Name']")).sendKeys("Sri");

        driver.findElement(By.xpath("//li/input[@id='personal_optGender_2']")).click();
        Select Nationaility=new Select(driver.findElement(By.xpath("//label[contains(text(),'Nationality')]/following-sibling::select")));
        Nationaility.selectByVisibleText("Greek");
        driver.findElement(By.id("btnSave")).click();
     Thread.sleep(1000);




    }
}