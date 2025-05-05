package tests.organizer.signup;

import base.Setup;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.signup.SignUpSignInPOM.*;



public class LoginPageUITest {

    @Test(priority = 1)
    public void signUpSignInTitleIsDisplayed() {
        Setup.testCaseId = "173";
        Assert.assertTrue(getSignUpSignInTitle().isDisplayed());
    }

    @Test(priority = 2)
    public void signUpSignInTitleIsCorrect() {
        Setup.testCaseId = "174";
        Assert.assertEquals(getSignUpSignInTitleText(), Setup.planningTestData.getSignInSignUpText());
    }

    @Test(priority = 3)
    public void emailFieldIsDisplayed() {
        Setup.testCaseId = "175";
        Assert.assertTrue(getEmailField().isDisplayed());
    }

    @Test(priority = 3)
    public void passwordFieldIsDisplayed() {
        Setup.testCaseId = "176";
        Assert.assertTrue(getPasswordField().isDisplayed());
    }

    @Test(priority = 3)
    public void signUpSignInButtonIsDisplayed() {
        Setup.testCaseId = "177";
        Assert.assertTrue(getSignUpSignInButton().isDisplayed());
    }

    @Test(priority = 3)
    public void signUpSignInButtonTextIsCorrect() {
        Setup.testCaseId = "178";
        Assert.assertEquals(getSignUpSignInButtonText(), Setup.planningTestData.getSignUpSignInButtonText());
    }

    @Test(priority = 3)
    public void signInWithGoogleIsDisplayed() {
        Setup.testCaseId = "179";
        Assert.assertTrue(getSignInWihGoogleButton().isDisplayed());
    }

}
