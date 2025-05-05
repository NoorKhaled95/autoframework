package tests.organizer.personaPage.addFields;

import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.personaPage.PersonaPagePOM.*;

public class GenderFieldTest {

    @Test(priority = 1)
    public void openNewEmptyFieldRow() {
        getAddAFiledButton().click();
        Assert.assertTrue(getSelectFieldType().isDisplayed());
    }

    @Test(priority = 2)
    public void openFieldsTypesList() {
        getSelectFieldType().click();
        Assert.assertTrue(getGenderField().isDisplayed());
    }

    @Test(priority = 3)
    public void selectGenderField() {
        getGenderField().click();
        Assert.assertTrue(getGenderTitleField().isDisplayed());
    }

    @Test(priority = 4)
    public void availableOptionsTitleIsDisplayed() {
        Assert.assertTrue(getAvailableOptionsTitle().isDisplayed());
    }

    @Test(priority = 5)
    public void maleOptionIsDisplayed() {
        Assert.assertTrue(getMaleOptionField().isDisplayed());
    }

    @Test(priority = 6)
    public void femaleOptionIsDisplayed() {
        Assert.assertTrue(getFemaleOptionField().isDisplayed());
    }

    @Test(priority = 7)
    public void addOptionBtnIsDisplayed() {
        Assert.assertTrue(getAddAnOptionBtn().isDisplayed());
    }

}
