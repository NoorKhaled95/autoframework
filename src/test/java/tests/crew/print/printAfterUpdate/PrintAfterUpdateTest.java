package tests.crew.print.printAfterUpdate;

import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static tests.crew.onsiteRegistration.groupForm.CrewGroupRegistrationPOM.getSearchIcon;
import static tests.crew.onsiteRegistration.singleForm.CrewRegistrationPOM.*;

public class PrintAfterUpdateTest {

    @Test(priority = 1)
    public void searchScreenIsOpened() {
        Go.waitIfToastVisible();
        getSearchIcon().click();
        Assert.assertTrue(getSearchFirstResult().isDisplayed());
    }

    @Test(priority = 2)
    public void searchByName() throws InterruptedException {
        getSearchField().sendKeys(Setup.registrantTestData.getFullName());
        Thread.sleep(3000);
        Assert.assertTrue(getSearchFirstResult().isDisplayed());
    }

    @Test(priority = 3)
    public void jobTitleIsUpdated() throws InterruptedException {
        getJobTitleFieldAfterSearch().clear();
        getJobTitleFieldAfterSearch().sendKeys(Setup.planningTestData.getUpdatedJobTitle());
        getUpdateButton().click();
        Go.waitForElementToBeVisibleBy(By.xpath("(//div[@class='search-result ng-star-inserted'])[1]//mat-label[text()='Job title']"));
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void printPanelAfterUpdateIsDisplayed() throws IOException, InterruptedException {
        getPrintButton().click();
        boolean printPanelIsOpen = Go.imagesAreSimilar(
                "printAfterUpdate.png",
                "printAfterUpdateTemplate.png",
                18000);
        Assert.assertTrue(printPanelIsOpen);
    }


}
