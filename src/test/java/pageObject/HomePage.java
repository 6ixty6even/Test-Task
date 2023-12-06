package pageObject;

import basses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    public WebElement getChangeRegionBtn(){
        return elementByXpath("//div[@class='nav-sprite nav-progressive-attribute']");
    }
}
