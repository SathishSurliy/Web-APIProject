package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class BrokenLinksTest {
    @Test
    void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/newtours/");
        String underConsTitle = "Under Construction: Mercury Tours";

                List<WebElement> linkElements =driver.findElements(By.tagName("a"));
                int noOfLinks=linkElements.size();
                System.out.println(noOfLinks);
                String[] LinkTexts= new String[noOfLinks];

                // extract each link
                int i=0;
                for(WebElement e:linkElements){
                    LinkTexts[i]=e.getText();
                    i++;
                }

                // test each link is broken or not
                    for(String t:LinkTexts){
                        driver.findElement(By.linkText(t)).click();
                        if(driver.getTitle().equals(underConsTitle)){
                            System.out.println(t+"  "+"is Under constrcution");
                        }
                        else{
                            System.out.println(t+" "+ "is working fine");
                        }
                        driver.navigate().back();

                    }
                    driver.close();







    }


}
