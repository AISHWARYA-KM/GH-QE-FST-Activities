package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act2 {
    
    public static void main(String arge[]){

        WebDriver driver= new FirefoxDriver();

        driver.get("https://training-support.net/webelements/target-practice");

        System.out.println("page title" + driver.getTitle());

        String Thheader=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h3[1]")).getText();
        System.out.println(Thheader);

        String fifheadercolor=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h5")).getCssValue("color");
        System.out.println("5 the header color" + fifheadercolor );

        String purplebutton=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[5]")).getDomAttribute("class");
        System.out.println(purplebutton);

        String greybutton =driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[6]")).getText();
        System.out.println(greybutton);

    }
}
