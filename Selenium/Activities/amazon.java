package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class amazon {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.amazon.in/");
        WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
        search.click();
        search.sendKeys("iphone 17 pro");

        

    }
    
}