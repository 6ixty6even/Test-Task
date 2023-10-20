package pageObject;

import basses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver){
        super(driver);
    }

    public void navigate() {
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    }
    public WebElement getEmailField() {
       return elementByXpath("//input[@type='email']");
    }
    public WebElement getBtncontinue() {
        return elementByXpath("//input[@id='continue']");

    }
    public WebElement getPsssword() {
        return elementByXpath("//input[@type='password']");
    }
    public WebElement getLoginBtn() {
        return elementByXpath("//span[@id='auth-signin-button']");
    }
    public WebElement getHelloLudwig() {
        return elementByXpath("//span[text()= 'Hello, Ludwig']");
    }
    public WebElement getErrorBtn() {
        return elementByXpath("//h4[text()='There was a problem']");
    }
}
