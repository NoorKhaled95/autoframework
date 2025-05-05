package tests.organizer.registration.selfRegistration;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static base.Setup.planningTestData;
import static base.Setup.registrantTestData;
import static tests.organizer.registration.selfRegistration.SelfRegistrationPOM.*;


public class SelfRegistrationTest {

    @Test(priority = 1)
    public void openPersonaShareListByName() {
        openPersonaShareList();
        Assert.assertTrue(getSelfRegistrationFormBtn().isDisplayed());
    }

    @Test(priority = 2)
    public void openWelcomePage() {
        getSelfRegistrationFormBtn().click();
        Go.switchToLastTab();
    }

    @Test(priority = 3)
    public void openRegistrationForm() {
        Go.clickUntilVisibilityOfBy(getAnyElement(), By.xpath("//button[text()='REGISTER NOW']"));
        getRegisterNowButton().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(getFullnameField().isDisplayed());
        softAssert.assertTrue(getEmailField().isDisplayed());
        softAssert.assertTrue(getPhoneField().isDisplayed());
        softAssert.assertTrue(getJobTitleField().isDisplayed());
        softAssert.assertTrue(getCountryField().isDisplayed());
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void fillFormSuccessfully() {
        // generate new name to differentiate between online registration info and onsite registration info
        Setup.registrantTestData.setFullName(Go.generateUniqueName());
        fillForm();
    }

    @Test(priority = 6)
    public void registeredSuccessfully() {
        getRegisterButton().click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Finder.getByPartialText("Registration successful", "*", false).isDisplayed());
        softAssert.assertTrue(Finder.getByPartialText("Please collect your badge", "*", false).isDisplayed());
        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void printPanelOpenAutomatically() throws IOException, InterruptedException {
        boolean printPanelIsOpened = Go.imagesAreSimilar(
                "selfRegistrationPrint.png",
                "selfRegistrationPrintTemplate.png",
                7000);
        Assert.assertTrue(printPanelIsOpened);
        Thread.sleep(5000);
    }
}
