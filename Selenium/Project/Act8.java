package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Act8 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://alchemy.hguy.co/orangehrm/");
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_leave_applyLeave"))).click();
        Select leaveType = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        leaveType.selectByIndex(1);
        WebElement fromDate = driver.findElement(By.id("applyleave_txtFromDate"));
        fromDate.clear();
        fromDate.sendKeys("2026-03-25");
        WebElement toDate = driver.findElement(By.id("applyleave_txtToDate"));
        toDate.clear();
        toDate.sendKeys("2026-03-27");
        driver.findElement(By.id("applyBtn")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_leave_viewMyLeaveList"))).click();
        WebElement table = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("resultTable"))
        );

        if (table.isDisplayed()) {
            System.out.println("Leave applied and visible in My Leave page");
        }

    }
}