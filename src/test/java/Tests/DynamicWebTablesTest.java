package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class DynamicWebTablesTest {
@Test
    void webTables(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    //WebDriver driver = new HtmlUnitDriver();

        driver.manage().window().maximize();
        String url="https://demo.guru99.com/test/web-table-element.php";
        driver.get(url);
        /*List<WebElement> noOfCoulmns = driver.findElements(By.xpath("//*[text()='Company']//following-sibling::th"));
    System.out.println("No of Columns"+noOfCoulmns.size());

        List<WebElement> noofRows=driver.findElements(By.xpath("//*[text()='Company']//following-sibling::th//ancestor::table//descendant::tr"));
    System.out.println("No of Rows"+noofRows.size());*/

    WebElement getCellValue=driver.findElement(By.xpath("//*[text()='Company']//following-sibling::th//ancestor::table//descendant::tr//parent::tbody//child::tr[2]//child::td[3]"));
    System.out.println("Quess values:"+getCellValue.getText());
    }
}
