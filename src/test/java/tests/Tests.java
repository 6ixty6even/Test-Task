package tests;

import basses.TestInit;
import pageObject.HomePage;
import pageObject.SignInPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Tests extends TestInit {

    SignInPage signInPage = new SignInPage(driver);

    HomePage homePage = new HomePage(driver);

//    @Test
//    void cheekSignIn() {
//
//        signInPage.navigate();
//        signInPage.getEmailField().sendKeys("");
//        signInPage.getBtncontinue().click();
//        signInPage.getPsssword().sendKeys("");
//        signInPage.getLoginBtn().click();
//
//        Assert.assertTrue(signInPage.getHelloLudwig().isDisplayed());
//    }

    @Test
    public void cheekSingInBtn() {
        signInPage.planetaKino();

        Assert.assertTrue(signInPage.signInBtn().isDisplayed());
    }
//
//    @Test
//    void ChangeRegion() {
//        signInPage.goToAmazon();
//        homePage.getChangeRegionBtn().click();
//
//    }
}
