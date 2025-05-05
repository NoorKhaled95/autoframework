package tests.crew.authentication;

import base.Go;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.crew.authentication.SignInPOM.*;


public class SignOutTest {
    @Test(priority = 1, groups = "haltWhenFail")
    public void logout() {
        Go.waitIfToastVisible();
        getUserName().click();
        getSignOutBtn().click();
        Assert.assertTrue(getLoginBtn().isDisplayed());

    }

}
