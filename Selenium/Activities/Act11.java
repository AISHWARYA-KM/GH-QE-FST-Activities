package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Act11 {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");

         System.out.println("Page title: " + driver.getTitle());

         List<WebElement> cols =driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/thead/tr/th"));
         System.out.println("Number of columns: " + cols.size());

         List<WebElement> rows=driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr"));
         System.out.println("Number of rows: " + rows.size());

         List<WebElement> thirdrow= driver.findElements(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[3]/td"));
         for(WebElement cell: thirdrow){
            System.out.println(cell.getText());
         }

         WebElement cellvalue=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]"));
         System.out.println("Second row and second col value :" + cellvalue.getText());



    }

}
