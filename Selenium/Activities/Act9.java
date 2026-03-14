package selenium;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Act9 {
     public static void main(String args[]){
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get(" https://training-support.net/webelements/dynamic-controls");
        System.out.println("Page title :" +driver.getTitle());

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        System.out.println("Checkbox is visible? " + checkbox.isDisplayed());

        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")).click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        System.out.println("checkbox is displayed:" + checkbox.isDisplayed());

        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
        System.out.println("checkbox is selected:" + checkbox.isSelected());

        driver.quit();



     }
    
}
