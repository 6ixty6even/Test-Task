package basses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

   public WebDriver driver;

    @BeforeMethod
    public void CallChrome() {
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }

    public void goToAmazon() {
        driver.get("https://www.amazon.com/");
    }

    public void sleep(int s) {
        try {
            Thread.sleep(s * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
