package tests.crew.authentication;

import base.Go;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.crew.crewMembersPage.EventsPagePOM;

import static base.Setup.crewTestData;
import static tests.crew.authentication.SignInPOM.*;

public class SignInTest {
     

    @Test(priority = 1)
    public void emailFieldIsDisplayed() {
        Assert.assertTrue(getEmailField().isDisplayed());
    }

    @Test(priority = 2)
    public void passwordFieldIsDisplayed() {
        Assert.assertTrue(getPasswordField().isDisplayed());
    }

    @Test(priority = 3)
    public void loginBtnIsDisplayed() {
        Assert.assertTrue(getLoginBtn().isDisplayed());
    }

    @Test(priority = 4)
    public void inputEmail() {
        getEmailField().sendKeys(crewTestData.getEmail());
    }

    @Test(priority = 5)
    public void inputPassword() {
        getPasswordField().sendKeys(crewTestData.getPassword());
    }

    @Test(priority = 6,groups = "haltWhenFail")
    public void clickOnLoginButton() {
        Go.clickUntilInvisibility(getLoginBtn());
//        getLoginBtn().click();
        Assert.assertTrue(EventsPagePOM.eventsTextIsDisplayed());
    }

}
