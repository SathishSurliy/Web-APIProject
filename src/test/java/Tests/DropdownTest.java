package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DropdownTest {
    @Test
    void dropdownTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.manage().window().maximize();
        String url="https://www.orangehrm.com/contact-sales/";
        driver.get(url);
       /* WebElement noOfEmployee =driver.findElement(By.xpath("//*[@name=\"NoOfEmployees\"]"));
        Select select= new Select(noOfEmployee);
        select.selectByValue("11-15");

        WebElement country =driver.findElement(By.xpath("//*[@name=\"Country\"]"));
        Select select1= new Select(country);
        select1.selectByIndex(0);*/

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Approcah 2
        WebElement noOfEmployee =driver.findElement(By.xpath("//*[@name=\"NoOfEmployees\"]"));
        dropDownMultipleOptions(noOfEmployee, "16-20");
        WebElement country =driver.findElement(By.xpath("//*[@name=\"Country\"]"));
        dropDownMultipleOptions(country, "India");
    }
   static void dropDownMultipleOptions(WebElement we, String value){
       Select dropdown= new Select(we);
       List<WebElement> allOptions=dropdown.getOptions();
       for(WebElement ee: allOptions){
           if(ee.getText().equals(value)){
               ee.click();
           }
       }





   }

}
