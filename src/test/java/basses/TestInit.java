package basses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestInit {

    public WebDriver driver;

    @BeforeMethod
    public void CallChrome() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }

    public WebElement explicitWaitToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public WebElement elementByXpath(String locator) {
        return driver.findElement(By.xpath(locator));
    }

    public WebDriver getDriver() {
        return driver;
    }
}
