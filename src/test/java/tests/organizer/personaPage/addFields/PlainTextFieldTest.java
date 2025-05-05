package tests.organizer.personaPage.addFields;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.personaPage.PersonaPagePOM.*;

public class PlainTextFieldTest {
    @Test(priority = 1)
    public void openNewEmptyFieldRow() {
        getAddAFiledButton().click();
        Assert.assertTrue(getSelectFieldType().isDisplayed());
    }

    @Test(priority = 2)
    public void openFieldsTypesList() {
        getSelectFieldType().click();
        Assert.assertTrue(getPlainTextField().isDisplayed());
    }
    @Test(priority = 3)
    public void selectPlainTextField() {
        getPlainTextField().click();
        Assert.assertTrue(getPlainTextTypeField().isDisplayed());
    }

    @Test(priority = 4)
    public void inputOptionText() {
        inputOnPlainText();
    }
}
