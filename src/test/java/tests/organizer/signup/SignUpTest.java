package tests.organizer.signup;

import base.Setup;
import configs.testRail.APIClient;
import configs.testRail.APIException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static base.Setup.flowTestData;
import static tests.organizer.signup.SignUpSignInPOM.*;

import java.io.IOException;

public class SignUpTest {


    @BeforeClass
    public void preparation() {
        System.out.println("Preparation Started ..");
        String base_url = "https://api.staging.micetribe.com/v3/registrations/automation/";
        try {
            if (Setup.flow.startsWith("New")){
                System.out.println("delete?email=" + flowTestData.getWorkspaceEmail());
            new APIClient(base_url).sendDelete("delete?email=" + flowTestData.getWorkspaceEmail());}
        } catch (APIException | IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            Assert.assertTrue(true);
        }
    }

    @Test(priority = 1, groups = "haltWhenFail")
    public void inputNewValidEmailShowsConfirmPassword() {
        inputEmail();
        getPasswordField().click();
        Assert.assertTrue(getConfirmPasswordField().isDisplayed());
    }

    @Test(priority = 2)
    public void signupTextIsDisplayed() {
        Assert.assertTrue(getSignUpTitle().isDisplayed());
    }

    @Test(priority = 3)
    public void signupButtonTextIsCorrect() {
        Assert.assertEquals(getSignUpButtonText(), Setup.planningTestData.getSignUpButtonText());
    }

    @Test(priority = 4)
    public void inputMatchedPasswordsHideValidationMsg() {
        inputPassword();
        inputConfirmPassword();
        Assert.assertTrue(getPasswordNotMachErrorMsgIsHidden());
    }

    @Test(priority = 5, groups = "haltWhenFail")
    public void signUpSuccessfully_DirectsToCreateOrganization() {
        getSignUpSignInButton().click();
        alertAccept();
        Assert.assertTrue(CreateOrganizationPage.createOrganizationBtnIsDisplayed());
    }

}
