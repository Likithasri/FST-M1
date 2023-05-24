import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

public class HRM_Activity8 {

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
        driver.findElement(By.xpath("//a/span[contains(text(),'Apply Leave')]")).click();

        Select leavetype = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        leavetype.selectByIndex(1);
        driver.findElement(By.id("applyleave_txtComment")).sendKeys("Planned Vacation");
        driver.findElement(By.id("applyleave_txtFromDate")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();

        driver.findElement(By.id("applyBtn")).click();
        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
        driver.findElement(By.id("calFromDate")).click();
        Select fromMonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        fromMonth.selectByVisibleText("Aug");
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
        driver.findElement(By.id("calToDate")).click();
        Select toMonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        toMonth.selectByVisibleText("Aug");
        Select toYear = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        toYear.selectByVisibleText("2022");
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
        driver.findElement(By.name("btnSearch")).click();
        String status = driver.findElement(By.linkText("Pending Approval(1.00)")).getText();
        Assert.assertEquals(status, "Pending Approval(1.00)");


    }
}