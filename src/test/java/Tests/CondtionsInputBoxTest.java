package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CondtionsInputBoxTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        String url="http://www.facebook.com";
        driver.get(url);

        WebElement loginButton=driver.findElement(By.xpath("//*[@name=\"login\"]"));
        try{
            if(loginButton.isEnabled()){
                loginButton.click();
            }
        }
        catch (NoSuchElementException nse){
            System.out.println(nse.toString());
        }
    }
}
