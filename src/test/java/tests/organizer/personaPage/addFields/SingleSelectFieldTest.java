package tests.organizer.personaPage.addFields;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.personaPage.PersonaPagePOM.*;

public class SingleSelectFieldTest {

    @Test(priority = 1)
    public void openNewEmptyFieldRow() {
        getAddAFiledButton().click();
        Assert.assertTrue(getSelectFieldType().isDisplayed());
    }

    @Test(priority = 2)
    public void openFieldsTypesList() {
        getSelectFieldType().click();
        Assert.assertTrue(getSingleSelectField().isDisplayed());
    }

    @Test(priority = 3)
    public void selectSingleSelectField() {
        getSingleSelectField().click();
        Assert.assertTrue(getSingleSelectTitleField().isDisplayed());
    }

    @Test(priority = 4)
    public void inputOption1Text() {
        inputSingleSelectOption1();
    }

    @Test(priority = 5)
    public void newOptionIsAdded() throws InterruptedException {
        getAddAnOptionButton().click();
        Assert.assertTrue(getSecondSingleSelectOption().isDisplayed());
        Thread.sleep(2000);
    }

    @Test(priority = 6)
    public void inputOption2Text() {
        inputSingleSelectOption2();
    }


}
