package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Act3 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/orangehrm/");
        WebElement input= driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
        input.sendKeys("orange");
        WebElement password= driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       boolean isDashboardVisible = wait.until(
                ExpectedConditions.urlContains("dashboard")
            );
            if (isDashboardVisible) {
                System.out.println("Login Successful - Homepage opened");
            } else {
                System.out.println("Login Failed");
            }
        

    }
    
}
