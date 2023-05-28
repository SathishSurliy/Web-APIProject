package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenImageTest {
    @Test
    void test(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/broken_images");
        for (WebElement image : driver.findElements(By.cssSelector("img")))
        {
            isImageBroken(image);
            //imageExists(image);
        }

    }
    public void isImageBroken(WebElement image)
    {
        if (image.getAttribute("naturalWidth").equals("0"))
        {
            System.out.println(image.getAttribute("outerHTML") + " is broken.");
        }
    }

    public boolean imageExists(WebElement image)
    {
        return !image.getAttribute("naturalWidth").equals("0");
    }


}
