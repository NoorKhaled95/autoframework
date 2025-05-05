package tests.crew.print.groupForm;

import base.Go;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static tests.crew.onsiteRegistration.singleForm.CrewRegistrationPOM.getPrintAllButton;

public class PrintAllTest {
    @Test(priority = 1)
    public void printAllButtonIsDisplayed() {
        Assert.assertTrue(getPrintAllButton().isDisplayed());
    }

    @Test(priority = 2)
    public void printPanelIsDisplayed() throws IOException, InterruptedException {
        getPrintAllButton().click();
        Thread.sleep(5000);
        boolean printPanelIsDisplayed = Go.imagesAreSimilar(
                "groupFormPrintAll.png",
                "groupFormPrintAllTemplate.png",
                5000);
        Assert.assertTrue(printPanelIsDisplayed);

    }
}
