package selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Act14 {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        System.out.println("page title is :" + driver.getTitle());
        WebElement dropdown= driver.findElement(By.cssSelector("select.h-10"));
        Select singleselect = new Select(dropdown);

        singleselect.selectByVisibleText("Two");

        System.out.println("second option" + singleselect.getFirstSelectedOption().getText());

        singleselect.selectByIndex(3);
        System.out.println("third option" + singleselect.getFirstSelectedOption().getText());

        singleselect.selectByValue("four");
        System.out.println("fourth option" + singleselect.getFirstSelectedOption().getText());

        List<WebElement> alloptions= singleselect.getOptions();
        System.out.println("option in the dropdown");
        for(WebElement option: alloptions){
            System.out.println(option.getText());

        }





    }
    
}
