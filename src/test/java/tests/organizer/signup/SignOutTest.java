package tests.organizer.signup;

import static tests.organizer.signup.HeaderPOM.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.signup.SignUpSignInPOM.*;
public class SignOutTest {
    @Test(priority = 1)
    public void signOutBtnIsDisplayed() {
        getUserName().click();
        Assert.assertTrue(getSignOutBtn().isDisplayed());
    }

    @Test(priority = 2, groups = "haltWhenFail")
    public void signInSignUpTitleIsDisplayed() {
        clickOnSignOutBtn();
        Assert.assertTrue(getSignUpSignInTitle().isDisplayed());
    }
}
