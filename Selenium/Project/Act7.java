package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

public class Act7 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://alchemy.hguy.co/orangehrm/");
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        driver.findElement(By.id("btnLogin")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewMyDetails"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Qualifications"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("addWorkExperience"))).click();
        driver.findElement(By.id("experience_employer")).sendKeys("IBM Company");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("QA Engineer");
        driver.findElement(By.id("experience_from_date")).click();

        WebElement calendar = driver.findElement(By.className("ui-datepicker"));
        Select month = new Select(calendar.findElement(By.className("ui-datepicker-month")));
        month.selectByVisibleText("Jan");
        Select year = new Select(calendar.findElement(By.className("ui-datepicker-year")));
        year.selectByVisibleText("2026");
        calendar.findElement(By.xpath("//a[text()='1']")).click();
        driver.findElement(By.id("experience_to_date")).click();

        WebElement calendar2 = driver.findElement(By.className("ui-datepicker"));

        Select month2 = new Select(calendar2.findElement(By.className("ui-datepicker-month")));
        month2.selectByVisibleText("Jan");

        Select year2 = new Select(calendar2.findElement(By.className("ui-datepicker-year")));
        year2.selectByVisibleText("2028");

        calendar2.findElement(By.xpath("//a[text()='1']")).click();

        driver.findElement(By.id("experience_comments")).sendKeys("Worked on automation testing");
        driver.findElement(By.id("btnWorkExpSave")).click();

    }
}