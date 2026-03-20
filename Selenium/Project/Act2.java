package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act2 {
        public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/orangehrm/");

        WebElement imgsrc= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
        System.out.println("The url of the image is"+ imgsrc.getDomAttribute("src"));
        driver.close();


        }
    
}
