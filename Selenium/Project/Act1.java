package Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Act1 {

    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/orangehrm/");
        String actualtitle= driver.getTitle();
        String expectedtitle="OrangeHRM";

        if(actualtitle.equals(expectedtitle)){
            System.out.println("Title matched:"+ actualtitle);
            driver.quit();


        }else{
            System.out.println("Title did not matched");
            
        }



    }
    
}
