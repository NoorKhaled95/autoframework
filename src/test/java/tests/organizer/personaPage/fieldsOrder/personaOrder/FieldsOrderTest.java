package tests.organizer.personaPage.fieldsOrder.personaOrder;

import base.Go;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Setup.planningTestData;

import static tests.organizer.personaPage.PersonaPagePOM.getPersonaTitle;
import static tests.organizer.personaPage.PersonaPagePOM.getNewPersonaTittleText;

public class FieldsOrderTest {

    @Test(priority = 1)
    public void MediaPersonaIsDisplayed() {
        getPersonaTitle().click();
        Assert.assertEquals(getNewPersonaTittleText(), Setup.flowTestData.getMainPersonaName());
        Go.waitIfToastVisible();
    }

    @Test(priority = 2)
    public void fullNameIsAboveEmail() {
        Assert.assertEquals(FieldsOrderPOM.getElementAboveEmail().getText().trim(), planningTestData.getFullNameFieldType());
    }

    @Test(priority = 3)
    public void emailIsAbovePhoneNumber() {
        Assert.assertEquals(FieldsOrderPOM.getElementAbovePhoneNumber().getText().trim(), planningTestData.getEmailFieldType());

    }

    @Test(priority = 4)
    public void phoneNumberIsAboveJobTitle() {
        Assert.assertEquals(FieldsOrderPOM.getElementAboveJobTitle().getText().trim(), planningTestData.getPhoneNumberFieldType());
    }

    @Test(priority = 5)
    public void jobTitleIsAboveOrganization() {
        Assert.assertEquals(FieldsOrderPOM.getElementAboveOrganization().getText().trim(), planningTestData.getJobTitleLabelText());

    }

    @Test(priority = 6)
    public void organizationIsAboveCountry() {
        Assert.assertEquals(FieldsOrderPOM.getElementAboveCountry().getText().trim(), planningTestData.getOrganizationLabelText());
    }

    @Test(priority = 7)
    public void countryIsAboveGender() {
        Assert.assertEquals(FieldsOrderPOM.getElementAboveGender().getText().trim(), planningTestData.getCountryFieldType());
    }

    @Test(priority = 8)
    public void genderIsAboveAgeGroup() {
        Assert.assertEquals(FieldsOrderPOM.getElementAboveAgeGroup().getText().trim(), planningTestData.getGenderFieldType());
    }

    @Test(priority = 9)
    public void ageGroupIsAboveSingleSelect() {
        Assert.assertEquals(FieldsOrderPOM.getElementAboveSingleSelect().getText().trim(), planningTestData.getAgeGroupFieldType());
    }

    @Test(priority = 10)
    public void singleSelectIsAbovePlainText() {
        Assert.assertEquals(FieldsOrderPOM.getElementAbovePlainText().getText().trim(), planningTestData.getSingleSelectFieldType());
    }

    @Test(priority = 11)
    public void plainTextIsAboveNumeric() {
        Assert.assertEquals(FieldsOrderPOM.getElementAboveNumeric().getText().trim(), planningTestData.getPlainTextFieldType());
    }

    @Test(priority = 12)
    public void numericIsAboveMultipleSelect() {
        Assert.assertEquals(FieldsOrderPOM.getElementAboveMultipleSelect().getText().trim(), planningTestData.getNumericFieldType());
    }

}
