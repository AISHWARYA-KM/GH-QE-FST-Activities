package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Act15 {
    public static void main(String[] args) {
        WebDriver driver =new FirefoxDriver();

        driver.get("https://training-support.net/webelements/selects");
        System.out.println("Page title: " + driver.getTitle());

        WebElement selectelement= driver.findElement(By.cssSelector("select.h-80"));

        Select mulselect= new Select(selectelement);

        mulselect.selectByVisibleText("HTML");

        for (int i=0; i<=5 ;i++){
            mulselect.selectByIndex(i);

        }
        mulselect.selectByValue("nodejs");
        List<WebElement> selectedoptions =mulselect.getAllSelectedOptions();
        System.out.println("selected options are");
        for(WebElement option: selectedoptions){
            System.out.println(option.getText());

        }
    }
    
}
