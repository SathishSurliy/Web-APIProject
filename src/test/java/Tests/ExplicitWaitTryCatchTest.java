package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

class ExplicitWaitTryCatchTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url="http://www.facebook.com";
        driver.get(url);

        WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(20));
        try{
            explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"login\"]")));
            WebElement loginButton=driver.findElement(By.xpath("//*[@name=\"login\"]"));
            loginButton.click();
        } catch (TimeoutException te){
            System.out.println(te.toString());
        }

    }
}
