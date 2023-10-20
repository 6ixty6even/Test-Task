package tests;

import basses.TestInit;
import pageObject.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Tests extends TestInit {
    SignInPage signInPage = new SignInPage(driver);

    @Test
    void cheekSignIn() {

        signInPage.navigate();
        signInPage.getEmailField().sendKeys("drenotar@gmail.com");
        signInPage.getBtncontinue().click();
        signInPage.getPsssword().sendKeys("149DFGUM3750k");
        signInPage.getLoginBtn().click();

        Assert.assertTrue(signInPage.getHelloLudwig().isDisplayed());
    }

    @Test
    void cheekSingInWitWrongEmail(){
        signInPage.navigate();
        signInPage.getEmailField().sendKeys("wrongjkvgdkjg");
        signInPage.getBtncontinue().click();

        Assert.assertTrue(signInPage.getErrorBtn().isDisplayed());
    }
}
