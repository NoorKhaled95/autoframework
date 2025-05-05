package tests.organizer.personaPage.addFields;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.personaPage.PersonaPagePOM.*;

public class MultipleSelectFieldTest {
    @Test(priority = 1)
    public void openNewEmptyFieldRow() {
        getAddAFiledButton().click();
        Assert.assertTrue(getSelectFieldType().isDisplayed());
    }

    @Test(priority = 2)
    public void openFieldsTypesList() {
        getSelectFieldType().click();
        Assert.assertTrue(getMultipleSelectField().isDisplayed());
    }

    @Test(priority = 3)
    public void selectMultipleSelectField() {
        getMultipleSelectField().click();
        Assert.assertTrue(getMultipleSelectTitleField().isDisplayed());
    }

    @Test(priority = 4)
    public void availableOptionsTitleIsDisplayed() {
        Assert.assertTrue(getAvailableOptionsTitle().isDisplayed());
    }

    @Test(priority = 5)
    public void Option1FieldIsDisplayed() {
        Assert.assertTrue(getOption1Field().isDisplayed());
    }
}
