package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserTest {
    @Test
    void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://demo.guru99.com/test/newtours/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String actualTitle=driver.getTitle();
        String expectedTitle="Welcome: Mercury Tours";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test is passed");
        }else{
            System.out.println("Test is failed");

        }
     driver.quit();

        /*WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url="http://demo.guru99.com/test/newtours/";
        String expectedOutput="Welcome: Mercury Tours";
        String actualOutput="";
        //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get(url);
        //driver.navigate().to("\"https://www.google.com/\"");
      //  driver.manage().timeouts().implicitlyWait(Timeout,5);

        actualOutput =driver.getTitle();

         if(actualOutput.equals(expectedOutput)){
             System.out.println("Test is Passed");
         } else{
             System.out.println("Test is failed");
         }
        String MainWindow=driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("hello");
        driver.findElement(By.xpath("//*[@name=\"q\"]")).click();
        String title= driver.getCurrentUrl();
        System.out.println(title);
        driver.close();
*/
    }
}
