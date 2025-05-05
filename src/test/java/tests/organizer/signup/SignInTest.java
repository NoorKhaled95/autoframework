package tests.organizer.signup;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.signup.SignUpSignInPOM.*;


public class SignInTest {

    @Test(priority = 1)
    public void inputEmailSuccessfully() {
        inputEmail();
    }
    @Test(priority = 2)
    public void inputPasswordSuccessfully() {
        inputPassword();
    }

    @Test(priority = 3)
    public void signInTitleIsDisplayed() {
        getPasswordField().click();
        Assert.assertTrue(getSignInTitle().isDisplayed());
    }

    @Test(priority = 4, groups = "haltWhenFail")
    public void signinSuccessfully() throws InterruptedException {

        getSignUpSignInButton().click();
        Thread.sleep(3000);
        Assert.assertEquals(HeaderPOM.getUserNameText(), Setup.planningTestData.getOrgFullName());
//        Assert.assertTrue(getCreateEventBtn().isDisplayed());
    }
}
