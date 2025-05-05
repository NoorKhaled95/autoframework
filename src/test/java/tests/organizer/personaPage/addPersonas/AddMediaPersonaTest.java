package tests.organizer.personaPage.addPersonas;

import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.organizer.personaPage.addFields.*;

import static tests.organizer.personaPage.PersonaPagePOM.*;
import static tests.organizer.personaPage.SharedPersonaTests.backToEventsPage;
import static tests.organizer.personaPage.SharedPersonaTests.sharePopupIsOpened;


public class AddMediaPersonaTest {

//    @Test(priority = 1)
//    public void newPersonaTittleFieldIsDisplayed() {
//        getAddPersonaBtn().click();
//        personaTittleFieldIsDisplayed();
//    }


    @Test(priority = 2)
    public void inputPersonaTitle() {
        inputMediaPersonaTittle();
        Assert.assertEquals(getPersonaTittleText(), Setup.planningTestData.getMediaPersonaTitle());
    }

    @Test(priority = 3)
    public void genderFieldIsAdded() {
        GenderFieldTest genderFieldTest = new GenderFieldTest();
        genderFieldTest.openNewEmptyFieldRow();
        genderFieldTest.openFieldsTypesList();
        genderFieldTest.selectGenderField();
        genderFieldTest.availableOptionsTitleIsDisplayed();
        genderFieldTest.maleOptionIsDisplayed();
        genderFieldTest.femaleOptionIsDisplayed();
        genderFieldTest.addOptionBtnIsDisplayed();
    }

    @Test(priority = 4)
    public void ageGroupFieldIsAdded() {
        AgeGroupTest addAgeGroupTest = new AgeGroupTest();
        addAgeGroupTest.AddNewEmptyFieldRow();
        addAgeGroupTest.openFieldsTypesList();
        addAgeGroupTest.selectAgeGroupField();
        addAgeGroupTest.availableOptionsTitleIsDisplayed();
        addAgeGroupTest.option24isDisplayed();
        addAgeGroupTest.option24isEditable();
    }

    @Test(priority = 5)
    public void singleSelectFieldIsAdded() throws InterruptedException {
        SingleSelectFieldTest addSingleSelectFieldTest = new SingleSelectFieldTest();
        addSingleSelectFieldTest.openNewEmptyFieldRow();
        addSingleSelectFieldTest.openFieldsTypesList();
        addSingleSelectFieldTest.selectSingleSelectField();
        addSingleSelectFieldTest.inputOption1Text();
        addSingleSelectFieldTest.newOptionIsAdded();
        addSingleSelectFieldTest.inputOption2Text();
    }

    @Test(priority = 6)
    public void plainTextFieldIsAdded() {
        PlainTextFieldTest addPlainTextFieldTest = new PlainTextFieldTest();
        addPlainTextFieldTest.openNewEmptyFieldRow();
        addPlainTextFieldTest.openFieldsTypesList();
        addPlainTextFieldTest.selectPlainTextField();
        addPlainTextFieldTest.inputOptionText();
    }

    @Test(priority = 7)
    public void numericFieldIsAdded() {
        NumericFieldTest addNumericFieldTest = new NumericFieldTest();
        addNumericFieldTest.openNewEmptyFieldRow();
        addNumericFieldTest.openFieldsTypesList();
        addNumericFieldTest.selectNumericField();
    }

    @Test(priority = 8)
    public void multipleSelectFieldIsAdded() {
        MultipleSelectFieldTest addMultipleSelectFieldTest = new MultipleSelectFieldTest();
        addMultipleSelectFieldTest.openNewEmptyFieldRow();
        addMultipleSelectFieldTest.openFieldsTypesList();
        addMultipleSelectFieldTest.selectMultipleSelectField();
        addMultipleSelectFieldTest.availableOptionsTitleIsDisplayed();
        addMultipleSelectFieldTest.Option1FieldIsDisplayed();
    }

    @Test(priority = 9)
    public void changeColorIconIsDisplayed() {
        Assert.assertTrue(getChangeColorIcon().isDisplayed());
    }

    @Test(priority = 10)
    public void VerifySelectColorIsDisplayed() {
        getChangeColorIcon().click();
        Assert.assertTrue(getSelectColor().isDisplayed());
    }

    @Test(priority = 11)
    public void clicksOnRedColor() {
        getSelectColor().click();
        Assert.assertTrue(getSaveColorBtn().isDisplayed());
    }

    @Test(priority = 12)
    public void clicksOnSave() {
        getSaveColorBtn().click();
        Assert.assertTrue(getQRAfterChange().isDisplayed());
        setQRSrc();
    }

    @Test(priority = 13)
    public void personalizeIconIsDisplayed() {
        Assert.assertTrue(getPersonalizeIcon().isDisplayed());
    }

    @Test(priority = 14, enabled = false)
    public void VerifyFirstNamePersonalize() {
        getPersonalizeIcon().click();
        Assert.assertTrue(getFirstNamePersonalize().isDisplayed());
    }

    @Test(priority = 15, enabled = false)
    public void clickOnFirstNamePersonalize() {
        getFirstNamePersonalize().click();
        Assert.assertTrue(getCopiedMsg().isDisplayed());
        Go.waitForElementToBeInVisibleBy(getCopiedMsg());
    }

    @Test(priority = 16)
    public void finishAndShareBtnIsDisplayed() {
        Assert.assertTrue(getFinishAndShareBtn().isDisplayed());
    }

    @Test(priority = 17)
    public void openSharePopup() throws InterruptedException {
        sharePopupIsOpened();
    }

    @Test(priority = 18)
    public void openEventsPage() {
        backToEventsPage();
    }
}
