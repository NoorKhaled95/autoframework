package tests.organizer.upgradeToPro;

import static tests.organizer.signup.HeaderPOM.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.upgradeToPro.BillingPOM.*;
import static tests.organizer.upgradeToPro.UpgradePlanToProPOM.*;

public class BillingTest {
    @Test(priority = 1)
    public void billingBtnIsDisplayed() {
        Assert.assertTrue(getBillingBtn().isDisplayed());
    }

    @Test(priority = 1)
    public void basicPlanTittleIsDisplayed() {
        Assert.assertTrue(getBasicPlanTitle().isDisplayed());
    }

    @Test(priority = 1)
    public void freeTittleIsDisplayed() {
        Assert.assertTrue(getFreeTitle().isDisplayed());
    }

    @Test(priority = 1)
    public void upgradeToPlanBtnIsDisplayed() {
        Assert.assertTrue(getWorkspaceCheckOutTitle().isDisplayed());
    }

    @Test(priority = 2)
    public void clicksOnUpgradeToProBtn() {
        getUpgradeToProBtn().click();
        Assert.assertTrue(get1YearBtn().isDisplayed());
    }



}
