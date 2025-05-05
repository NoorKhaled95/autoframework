package tests.organizer.personaPage.fieldsOrder.formOrder;

import base.Finder;
import base.Setup;
import org.openqa.selenium.WebElement;

public class FieldsOrderPOM {

    public static WebElement getFieldLabelAboveEmail() {
        WebElement emailLabel = Finder.getByPartialText(Setup.planningTestData.getEmailFieldType(),"label",false);
        return Finder.getByBelowElement("label", emailLabel, false);
    }


    public static WebElement getFieldLabelAbovePhoneNumber() {
        WebElement phoneNumberLabel =Finder.getByPartialText(Setup.planningTestData.getPhoneNumberFieldType(),"label",false);
        return Finder.getByBelowElement("label", phoneNumberLabel, false);
    }


    public static WebElement getFieldLabelAboveJobTitle() {
        WebElement jobTitleLabel = Finder.getByPartialText(Setup.planningTestData.getJobTitleLabelText(),"label",false);
        return Finder.getByBelowElement("label", jobTitleLabel, false);
    }


    public static WebElement getFieldLabelAboveOrganization() {
        WebElement organizationLabel =Finder.getByPartialText(Setup.planningTestData.getOrganizationLabelText(),"label",false);
        return Finder.getByBelowElement("label", organizationLabel, false);
    }


    public static WebElement getFieldLabelAboveCountry() {
        WebElement countryLabel = Finder.getByPartialText(Setup.planningTestData.getCountryFieldType(),"label",false);
        return Finder.getByBelowElement("label", countryLabel, false);
    }


    public static WebElement getFieldLabelAboveGender() {
        WebElement genderLabel = Finder.getByPartialText(Setup.planningTestData.getGenderFieldType(),"label",false);
        return Finder.getByBelowElement("label", genderLabel, false);
    }


    public static WebElement getFieldLabelAboveAgeGroup() {
        WebElement ageGroupLabel = Finder.getByPartialText(Setup.planningTestData.getAgeGroupFieldType(),"label",false);
//        WebElement addOptionsButton =Finder.getByBelowElement("label", ageGroupLabel, false);
        return Finder.getByBelowElement("label", ageGroupLabel, false);
    }

    public static WebElement getFieldLabelAboveSingleSelect() {
        WebElement singleSelectLabel = Finder.getByPartialText(Setup.planningTestData.getSingleSelectFieldType(),"label",false);
//        WebElement addOptionsButton = Finder.getByBelowElement("label", singleSelectLabel, false);
        return Finder.getByBelowElement("label", singleSelectLabel, false);
    }

    public static WebElement getFieldLabelAbovePlainText() {
        WebElement plainTextLabel= Finder.getByPartialText(Setup.planningTestData.getPlainTextNewLabel(),"label",false);
        WebElement singleSelectOption = Finder.getByBelowElement("label", plainTextLabel, false);
        return Finder.getByBelowElement("label", singleSelectOption, false);
    }

    public static WebElement getFieldLabelAboveNumeric() {
        WebElement numericFieldType= Finder.getByPartialText(Setup.planningTestData.getNumericFieldType(),"label",false);
        return Finder.getByBelowElement("label", numericFieldType, false);
    }

    public static WebElement getFieldLabelAboveMultipleSelect() {
        WebElement multipleSelectFieldType = Finder.getByPartialText(Setup.planningTestData.getMultipleSelectPersonaText(),"label",false);
        return Finder.getByBelowElement("label", multipleSelectFieldType, false);
    }

}
