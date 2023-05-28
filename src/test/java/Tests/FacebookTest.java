package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FacebookTest {
    @Test
    void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url="http://www.facebook.com";
        String expectedOutput="Welcome: Mercury Tours";
        String tagName="";
        //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS) ;
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get(url);
        //driver.navigate().to("\"https://www.google.com/\"");
      //  driver.manage().timeouts().implicitlyWait(Timeout,5);


        tagName=driver.findElement(By.xpath("//*[@id=\"email\"]")).getTagName();
        System.out.println(tagName);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hello");

        //Explicit wait
        explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"login\"]")));
        driver.findElement(By.xpath("//*[@name=\"login\"]")).click();


        String title= driver.getCurrentUrl();
        //String title1= driver.getTitle();
        System.out.println(title);
        driver.navigate().refresh();
        driver.navigate().forward();
        String title1= driver.getTitle();
        System.out.println(title1);
        driver.navigate().back();


        driver.close();

    }
}
