package tests.organizer.eventFormat.formatSection;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.eventFormat.formatSection.EventFormatSectionPOM.*;

public class EventFormatSectionUITest {
     
    @Test(priority = 1)
    public void inPersonBtnIsDisplayed() {
        Assert.assertTrue(getInPersonBtn().isDisplayed());
    }

    @Test(priority = 1)

    public void virtualBtnIsDisplayed() {
        Assert.assertTrue(getVirtualBtn().isDisplayed());
    }

    @Test(priority = 1)

    public void hybridBtnIsDisplayed() {
        Assert.assertTrue(getHybridBtn().isDisplayed());
    }
}
