package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Act16 {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());

        driver.findElement(By.cssSelector("#simple")).click();

        Alert simpleAlert= driver.switchTo().alert();

        String alertText=simpleAlert.getText();
        System.out.println("text in the alert:" +alertText);

        simpleAlert.accept();

        System.out.println(driver.findElement(By.id("result")).getText());

    }
    
}
