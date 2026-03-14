package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class helloselenium {
  public static void main(String[] args) {
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    
    // Open the browser
    driver.get("https://training-support.net");

    System.out.println("the title of the page is"+driver.getTitle());
    driver.findElement(By.linkText ("About Us")).click();
    System.out.println("title of new page is" + driver.getTitle());

    //driver.quit();
  }
}