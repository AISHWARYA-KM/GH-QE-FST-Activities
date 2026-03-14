package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Act8 {

    public static void main(String args[]){
        WebDriver driver= new FirefoxDriver();
        Actions builder= new Actions(driver);

        driver.get(" https://training-support.net/webelements/keyboard-events");
        System.out.println("Page title :" +driver.getTitle());

        builder.sendKeys("thia is coming from selenium").sendKeys(Keys.RETURN).build().perform();

        String pagetext=driver.findElement(By.cssSelector("h1.mt-3")).getText();
        System.out.println(pagetext);

        driver.quit();




    }


    
}
