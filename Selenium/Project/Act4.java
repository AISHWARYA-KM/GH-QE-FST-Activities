package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Act4 {

     public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/orangehrm/");
        WebElement input= driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
        input.sendKeys("orange");
        WebElement password= driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();

        WebElement firstname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstname.sendKeys("Pintu");
        WebElement lastname=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lastname.sendKeys("chintu");
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
        WebElement searchname=driver.findElement(By.xpath("//*[@id=\"empsearch_employee_name_empName\"]"));
        searchname.sendKeys("Pintuchintu");
        driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();







     }

    
}
