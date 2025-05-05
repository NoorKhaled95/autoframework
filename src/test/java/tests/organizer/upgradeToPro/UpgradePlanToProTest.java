package tests.organizer.upgradeToPro;

import base.Go;
import org.testng.Assert;
import org.testng.annotations.Test;
import static  tests.organizer.upgradeToPro.CheckOutPOM.*;
import static  tests.organizer.upgradeToPro.UpgradePlanToProPOM.*;

public class UpgradePlanToProTest {

    @Test(priority = 1)
    public void clicksOnOneYearBtn() {
        get1YearBtn().click();
        Assert.assertTrue(getSwitchToProBtn().isDisplayed());
    }

    @Test(priority = 2)
    public void clicksOnSwitchToProBtn() {
        getSwitchToProBtn().click();
        Go.switchToTabByIndex(2);
        Assert.assertTrue(getCardNumberField().isDisplayed());
    }

}
