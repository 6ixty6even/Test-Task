package basses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage  {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver =  driver;
    }

    public WebElement elementByXpath(String locator) {
        return getClickableEl(locator);
    }

    public WebElement getClickableEl(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
}
