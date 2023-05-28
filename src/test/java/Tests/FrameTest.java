package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FrameTest {
    @Test
    void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
      String url=  "https://demo.guru99.com/test/guru99home/";
        //        String expectedOutput="Welcome: Mercury Tours";
        //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS) ;
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        driver.get(url);
        //driver.navigate().to("\"https://www.google.com/\"");
      //  driver.manage().timeouts().implicitlyWait(Timeout,5);

        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("//*[@src=\"Jmeter720.png\"]")).click();
        driver.switchTo().parentFrame();
        driver.close();
        // if no  id/name are there for frame, then need to go through index with
        // int size = driver.findElements(By.tagName("iframe")).size();
        /*for(int i=0; i<=size; i++){
            driver.switchTo().frame(i);
            int total=driver.findElements(By.xpath("html/body/a/img")).size();
            System.out.println(total);
            driver.switchTo().defaultContent();}
*/
    }
}
