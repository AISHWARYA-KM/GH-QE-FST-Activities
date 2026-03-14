package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Act18 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title: " + driver.getTitle());

        driver.findElement(By.cssSelector("#prompt")).click();

        Alert promptAlert= driver.switchTo().alert();

        String alerttext= promptAlert.getText();
        System.out.println("text in alert:" + alerttext);

        promptAlert.sendKeys("Anu");
        Thread.sleep(5000);

        promptAlert.accept();   
        System.out.println(driver.findElement(By.id("result")).getText());



    }
}
