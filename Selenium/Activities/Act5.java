package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Act5 {
    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();

        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("page title" + driver.getTitle());

        WebElement textinput= driver.findElement(By.id("textInput"));
        System.out.println("The text input is enabled"+ textinput.isEnabled() );
        driver.findElement(By.id("textInputButton")).click();
        System.out.println("The text input is enabled"+ textinput.isEnabled() );
        textinput.sendKeys("Aishwaraya");
        System.out.println(textinput.getDomProperty("value"));

    


        



        
    }
    
}
