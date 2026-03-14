package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Act7 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();

        Actions builder= new Actions(driver);

        driver.get("https://training-support.net/webelements/mouse-events");
        System.out.println("page title: "+ driver.getTitle());

        WebElement cargolock =driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[1]")) ;
        WebElement cargotoml =driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[2]"));
        WebElement src =driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[3]"));
        WebElement target =driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[4]"));

        builder.click(cargolock).pause(1000).moveToElement(cargotoml).pause(1000).click(cargotoml).build().perform();
        String message=driver.findElement(By.id("result")).getText();
        System.out.println(message);

        builder.doubleClick(src).pause(3000).moveToElement(target).pause(2000).contextClick(target).build().perform();

        builder.click(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[2]/div/ul/li[1]/button"))).pause(2000).build().perform();
        message=driver.findElement(By.id("result")).getText();
        System.out.println(message);
    }
    
}
