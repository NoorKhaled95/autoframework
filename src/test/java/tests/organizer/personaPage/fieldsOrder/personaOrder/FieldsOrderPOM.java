package tests.organizer.personaPage.fieldsOrder.personaOrder;

import base.Finder;
import base.Setup;
import org.openqa.selenium.WebElement;

public class FieldsOrderPOM {

    public static WebElement getElementAboveEmail() {
        WebElement emailElement = Finder.getByPartialText(Setup.planningTestData.getEmailFieldType(),"button",false);
        return Finder.getByBelowElement("button", emailElement, false);
    }


    public static WebElement getElementAbovePhoneNumber() {
        WebElement phoneNumberFieldType =Finder.getByPartialText(Setup.planningTestData.getPhoneNumberFieldType(),"button",false);
        return Finder.getByBelowElement("button", phoneNumberFieldType, false);
    }


    public static WebElement getElementAboveJobTitle() {
        WebElement jobTitleFieldType = Finder.getByPartialText(Setup.planningTestData.getJobTitleLabelText(),"button",false);
        return Finder.getByBelowElement("button", jobTitleFieldType, false);
    }


    public static WebElement getElementAboveOrganization() {
        WebElement organizationFieldType =Finder.getByPartialText(Setup.planningTestData.getOrganizationLabelText(),"button",false);
        return Finder.getByBelowElement("button", organizationFieldType, false);
    }


    public static WebElement getElementAboveCountry() {
        WebElement countryFieldType = Finder.getByPartialText(Setup.planningTestData.getCountryFieldType(),"button",false);
        return Finder.getByBelowElement("button", countryFieldType, false);
    }


    public static WebElement getElementAboveGender() {
        WebElement genderFieldType = Finder.getByPartialText(Setup.planningTestData.getGenderFieldType(),"button",false);
        return Finder.getByBelowElement("button", genderFieldType, false);
    }


    public static WebElement getElementAboveAgeGroup() {
        WebElement ageGroupFieldType = Finder.getByPartialText(Setup.planningTestData.getAgeGroupFieldType(),"button",false);
        WebElement addOptionsButton =Finder.getByBelowElement("button", ageGroupFieldType, false);
        return Finder.getByBelowElement("button", addOptionsButton, false);
    }

    public static WebElement getElementAboveSingleSelect() {
        WebElement singleSelectFieldType = Finder.getByPartialText(Setup.planningTestData.getSingleSelectFieldType(),"button",false);
        WebElement addOptionsButton = Finder.getByBelowElement("button", singleSelectFieldType, false);
        return Finder.getByBelowElement("button", addOptionsButton, false);
    }

    public static WebElement getElementAbovePlainText() {
        WebElement plainTextType= Finder.getByPartialText(Setup.planningTestData.getPlainTextFieldType(),"button",false);
        WebElement addOptionsButton = Finder.getByBelowElement("button", plainTextType, false);
        return Finder.getByBelowElement("button", addOptionsButton, false);
    }

    public static WebElement getElementAboveNumeric() {
        WebElement numericFieldType= Finder.getByPartialText(Setup.planningTestData.getNumericFieldType(),"button",false);
        return Finder.getByBelowElement("button", numericFieldType, false);
    }

    public static WebElement getElementAboveMultipleSelect() {
        WebElement multipleSelectFieldType = Finder.getByPartialText(Setup.planningTestData.getMultipleSelectPersonaText(),"button",false);
        return Finder.getByBelowElement("button", multipleSelectFieldType, false);
    }

}
