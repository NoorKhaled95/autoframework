package tests.crew.onsiteRegistration.groupForm;

import base.Finder;
import base.Go;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static base.Setup.crewTestData;
import static tests.crew.onsiteRegistration.groupForm.CrewGroupRegistrationPOM.*;

public class CrewGroupRegistrationTest {


    @Test(priority = 11)
    @Parameters({"numOfOrganizations","formsCount"})
    public void fillForms(String numOfOrganizations, String formsCount) {
        int baseId = 2; // id locator of fields
        int numOfOrg = Integer.parseInt(numOfOrganizations);
        int orgForms = Integer.parseInt(formsCount);

        for (int c = 0; c < numOfOrg; c++) {
            inputOrganization();
            for (int i = 0; i < orgForms; i++) {
                fillForm(baseId, c, i);
                // Increase the baseId by 4 (number of fields) for the next form
                baseId += 4;
            }
            baseId += 4;
            Finder.getByXpath("//span[text()='SUBMIT']", true).click();
            Assert.assertTrue(Finder.getById("toast-container", false).isDisplayed());
            Assert.assertEquals(Finder.getById("toast-container", false).getText(), "Success\n" + "Registration successful");
        }
    }

    private void inputOrganization() {
        getOrganizationField().sendKeys(crewTestData.getRandomOrganization());
        getOrganizationField().sendKeys(Keys.ENTER);
    }


    @Test(priority = 12)
    public void openSearch() {
        Go.waitIfToastVisible();
        getSearchIcon().click();
    }

    @Test(priority = 13)
    public void searchForCountry() {
        searchPerformanceTest("Egypt");
    }

    @Test(priority = 14)
    public void searchForJobTitle() {
        searchPerformanceTest("QA");
    }

    @Test(priority = 15)
    public void searchForEmail() {
        searchPerformanceTest("ibrahimّ");
    }

    @Test(priority = 16)
    public void searchForName() {
        searchPerformanceTest("Ahmed");
    }
}
