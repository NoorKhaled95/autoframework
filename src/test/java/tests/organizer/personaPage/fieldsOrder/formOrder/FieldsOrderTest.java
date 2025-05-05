package tests.organizer.personaPage.fieldsOrder.formOrder;

import org.testng.Assert;
import org.testng.annotations.Test;

import static base.Setup.planningTestData;
import static tests.organizer.personaPage.fieldsOrder.formOrder.FieldsOrderPOM.*;

public class FieldsOrderTest {

    @Test(priority = 1)
    public void fullNameIsAboveEmail() {
        Assert.assertTrue(getFieldLabelAboveEmail().getText().contains(planningTestData.getFullNameFieldType()));
    }

    @Test(priority = 2)
    public void emailIsAbovePhoneNumber() {
        Assert.assertTrue(getFieldLabelAbovePhoneNumber().getText().contains(planningTestData.getEmailFieldType()));

    }

    @Test(priority = 3)
    public void phoneNumberIsAboveJobTitle() {
        Assert.assertEquals(getFieldLabelAboveJobTitle().getText().trim(), planningTestData.getPhoneNumberFieldType());
    }

    @Test(priority = 4)
    public void jobTitleIsAboveOrganization() {
        Assert.assertEquals(getFieldLabelAboveOrganization().getText().trim(), planningTestData.getJobTitleLabelText());

    }

    @Test(priority = 5)
    public void organizationIsAboveCountry() {
        Assert.assertEquals(getFieldLabelAboveCountry().getText().trim(), planningTestData.getOrganizationLabelText());
    }

    @Test(priority = 6)
    public void countryIsAboveGender() {
        Assert.assertEquals(getFieldLabelAboveGender().getText().trim(), planningTestData.getCountryFieldType());
    }

    @Test(priority = 7)
    public void genderIsAboveAgeGroup() {
        Assert.assertEquals(getFieldLabelAboveAgeGroup().getText().trim(), planningTestData.getGenderFieldType());
    }

    @Test(priority = 8)
    public void ageGroupIsAboveSingleSelect() {
        Assert.assertEquals(getFieldLabelAboveSingleSelect().getText().trim(), planningTestData.getAgeGroupFieldType());
    }

    @Test(priority = 9)
    public void singleSelectIsAbovePlainText() {
        Assert.assertEquals(getFieldLabelAbovePlainText().getText().trim(), planningTestData.getSingleSelectFieldType());
    }

    @Test(priority = 10)
    public void plainTextIsAboveNumeric() {
        Assert.assertEquals(getFieldLabelAboveNumeric().getText().trim(), planningTestData.getPlainTextNewLabel());
    }

    @Test(priority = 11)
    public void numericIsAboveMultipleSelect() {
        Assert.assertEquals(getFieldLabelAboveMultipleSelect().getText().trim(), planningTestData.getNumericFieldType());
    }

}
