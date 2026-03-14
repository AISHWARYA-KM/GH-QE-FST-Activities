package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Act12 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://training-support.net/webelements/tables");
        System.out.println("title of the page is :" + driver.getTitle());

        List<WebElement> cols=driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/thead/tr/th"));
        System.out.println("The no of columns are :" + cols.size());

        List<WebElement> rows=driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr"));
        System.out.println("the no of rows:" + rows.size());

        WebElement fifth= driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]"));
        System.out.println("the fifth row book name is :" + fifth.getText());

        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/thead/tr/th[5]")).click();

        fifth=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[5]/td[2]"));
        System.out.println("the fifth row book name is :" + fifth.getText());

        driver.quit();


    }

    
}
