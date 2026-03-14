package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act17 {
     public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());

        driver.findElement(By.cssSelector("#confirmation")).click();

        Alert confirmAlert= driver.switchTo().alert();

        String alerttext= confirmAlert.getText();
        System.out.println("text in alert:" + alerttext);

        confirmAlert.dismiss();

        System.out.println(driver.findElement(By.id("result")).getText());
        

     }
    
}
