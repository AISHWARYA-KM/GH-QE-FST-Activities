package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act4 {

    public static void main(String aregs[]){

        WebDriver driver= new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("Title of page" + driver.getTitle());

        WebElement checkbox=driver.findElement(By.id("checkbox"));
        checkbox.click();
        System.out.println("checkbox is select: " + checkbox.isSelected());
        checkbox.click();
        System.out.println("checkbox is select: " + checkbox.isSelected());
        driver.quit();



    }

    


    
}
