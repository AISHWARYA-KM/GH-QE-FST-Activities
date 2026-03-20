package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class Act6 {
     public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://alchemy.hguy.co/orangehrm/");
        WebElement input= driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
        input.sendKeys("orange");
        WebElement password= driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        WebElement directoryMenu=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[@id=\"menu_dashboard_index\"]")));
         if (directoryMenu.isDisplayed() && directoryMenu.isEnabled()) {
            System.out.println("Directory menu is visible and clickable");
            directoryMenu.click();
            WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/h1")));
            String actualText = heading.getText();

            if (actualText.equals("Search Directory")) {
                System.out.println("Heading verified: " + actualText);
            } else {
                System.out.println("Heading mismatch: " + actualText);
            }

        } else {
            System.out.println("Directory menu is NOT clickable");
        }


     }
    
}
