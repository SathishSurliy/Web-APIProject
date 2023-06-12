package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionTest {

    @Test
    void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url="http://www.facebook.com";
        driver.get(url);
        WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        Actions builder =new Actions(driver);
        Actions seriesAction = builder.moveToElement(loginButton).click()
                                .keyDown(loginButton, Keys.SHIFT)
                                .sendKeys(loginButton,"Hello")
                                .keyUp(loginButton,Keys.SHIFT)
                                .doubleClick(loginButton)
                                .contextClick()
                                .click();
                                 seriesAction.perform();

    }
}
