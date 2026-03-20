package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;


public class Act5 {
     public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://alchemy.hguy.co/orangehrm/");
        WebElement input= driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
        input.sendKeys("orange");
        WebElement password= driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("menu_pim_viewMyDetails"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSave"))).click();
        
        WebElement firstname=driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]"));
        firstname.clear();
        firstname.sendKeys("Pintu");
        WebElement lastname=driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]"));
        lastname.clear();
        lastname.sendKeys("chintu");

        driver.findElement(By.xpath("//*[@id=\"personal_optGender_2\"]")).click();

        WebElement nationalityDropdown = driver.findElement(By.id("personal_cmbNation"));
        Select select = new Select(nationalityDropdown);
        select.selectByVisibleText("Indian");

        WebElement dob = driver.findElement(By.id("personal_DOB"));
        dob.clear();
        dob.sendKeys("1996-03-07");

        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();


        


     }

    
}
