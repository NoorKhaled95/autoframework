package tests.organizer.personaPage.addFields;

import base.Go;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static tests.organizer.personaPage.PersonaPagePOM.*;

public class AgeGroupTest {
    /* Add Age Group Field */
    @Test(priority = 1)
    public void AddNewEmptyFieldRow() {
        getAddAFiledButton().click();
        Assert.assertTrue(getSelectFieldType().isDisplayed());
    }

    @Test(priority = 2)
    public void openFieldsTypesList() {
        getSelectFieldType().click();
        Assert.assertTrue(getSelectAddAgeGroupField().isDisplayed());
    }

    @Test(priority = 3)
    public void selectAgeGroupField() {
        getSelectAddAgeGroupField().click();
        Assert.assertTrue(getAgeGroupTitleField().isDisplayed());
    }

    @Test(priority = 4)
    public void availableOptionsTitleIsDisplayed() {
        Assert.assertTrue(getAddAnOptionBtn().isDisplayed());
    }

    @Test(priority = 5)
    public void option24isDisplayed() {
        Assert.assertTrue(get24Field().isDisplayed());
    }
    @Test(priority = 6)
    public void option24isEditable() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(get24Field().isDisplayed());
        Go.clearText(get24Field());
        get24Field().sendKeys("test");
        softAssert.assertTrue(getUpdated24Field().isDisplayed());
        Go.clearText(getUpdated24Field());
        getUpdated24Field().sendKeys("<24");
        softAssert.assertTrue(get24Field().isDisplayed());
        softAssert.assertAll();
    }
}
