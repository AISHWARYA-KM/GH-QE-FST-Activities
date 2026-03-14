package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act3 {
    
    public static void main(String args[]){
        WebDriver driver= new FirefoxDriver();

        driver.get(" https://training-support.net/webelements/dynamic-controls");
        System.out.println("page title" + driver.getTitle());

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        System.out.println("Checkbox visible before removing: " + checkbox.isDisplayed());

        driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();

        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
    
        driver.quit();


    }
}
