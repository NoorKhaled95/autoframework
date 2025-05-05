package tests.organizer.personaPage.addFields;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.personaPage.PersonaPagePOM.*;

public class NumericFieldTest {

    @Test(priority = 1)
    public void openNewEmptyFieldRow() {
        getAddAFiledButton().click();
        Assert.assertTrue(getSelectFieldType().isDisplayed());
    }

    @Test(priority = 2)
    public void openFieldsTypesList() {
        getSelectFieldType().click();
        Assert.assertTrue(getNumericField().isDisplayed());
    }

    @Test(priority = 3)
    public void selectNumericField() {
        getNumericField().click();
        Assert.assertTrue(getNumericTitleField().isDisplayed());
    }

}
