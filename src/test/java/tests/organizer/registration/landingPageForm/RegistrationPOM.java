package tests.organizer.registration.landingPageForm;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tests.production.CreateGroupFormPOM;

import static base.Setup.planningTestData;
import static base.Setup.registrantTestData;

public class RegistrationPOM {

    public static WebElement getLanguageSelection() {
        String xpath = "/html/body/main/section/div/div[1]/div/form/div[1]/select";
        return Finder.getByXpath(xpath, true);
    }

    public static void clicksOnLanguageSelection() {
        Go.javascriptExecutor("arguments[0].click();", getLanguageSelection());

    }

    public static WebElement getSelectArabicLangFromLanguageSelection() {
        String xpath = "//div[@class=\"language-selection\"]//option[contains(text(), 'عربي')]";
        return Finder.getByXpath(xpath, true);
    }


    public static void clicksOnArabicLangSelection() {
        getSelectArabicLangFromLanguageSelection().click();
    }

    public static WebElement getSelectEnglishLangFromLanguageSelection() {
        String xpath = "//div[@class=\"language-selection\"]//option[contains(text(), 'English')]";
        return Finder.getByXpath(xpath, true);
    }

    public static void clicksOnEnglishLangSelection() {
        getSelectEnglishLangFromLanguageSelection().click();
    }

    public static WebElement getFullNameInArabic() {
        String xpath = "//div//label[contains(text(), 'الاسم بالكامل')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getPasscodeField() {
        String xpath = "/html/body/main/section/div/section/form/input";
        return Finder.getByXpath(xpath, true);
    }

    public static String getPasscodeText() {
        return getPasscodeField().getAttribute("value");
    }

    public static void inputPasscode() {
        getPasscodeField().sendKeys(Setup.flowTestData.getPersonaPassCode());
    }

    public static WebElement getConfirmBtn() {
        String xpath = "//button[contains(text(), \"Confirm\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static void clickConfirmBtn() {
        Go.clickUntilVisibilityOfBy(getConfirmBtn(), By.xpath("//input[@title=\"fullname\"]"));
    }

    public static WebElement getFullNameField() {
        String xpath = "//input[@title=\"fullname\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static String getFullNameFieldText() {
        return getFullNameField().getAttribute("value");
    }

    public static void inputFullName() {
        getFullNameField().clear();
        getFullNameField().sendKeys(registrantTestData.getFullName());
    }

    public static boolean hasGreenNotifier(WebElement element) {
        String title = element.getAttribute("title");
        String notifierXPath = "//div[@class='control-input']//input[@title='" + title + "']/preceding-sibling::div[contains(@class, 'notifier')]";
        return Finder.getByXpath(notifierXPath, false).getAttribute("class").equalsIgnoreCase("notifier green");
    }

    public static WebElement getFullNameInputErrorMsg() {
        String xpath = "//div[1]/div/div/caption";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getEmailInputErrorMsg() {
        String xpath = "//div[2]/div/div/caption";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getEmailField() {
        String xpath = "//input[@title=\"email\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputEmail() {
        getEmailField().sendKeys(Setup.registrantTestData.getEmail());
    }

    public static String getEmailFieldText() {
        return getEmailField().getAttribute("value");
    }

    public static WebElement getEmailRequiredRedStar() {
        String xpath = "//label[contains(text(),\"E-mail\")]//span[contains(text(), \" *\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getPhoneField() {
        String xpath = "//input[@title=\"phone\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputPhoneNumber() {
        getPhoneField().clear();

        if (getPhoneFieldText().contains("97")) {
            getPhoneField().sendKeys(Setup.registrantTestData.getShortPhoneNumber());
        } else {
            getPhoneField().sendKeys(Setup.registrantTestData.getFullPhoneNumber());
        }
    }

    public static String getPhoneFieldText() {
        return getPhoneField().getAttribute("value");
    }

    public static WebElement getJobTitleField() {
        String xpath = "//input[@title=\"job_title\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputJobTitle() {
        getJobTitleField().sendKeys(Setup.registrantTestData.getJobTitle());
    }

    public static String getJobTitleFieldText() {
        return getJobTitleField().getAttribute("value");
    }

    public static WebElement getOrganizationField() {
        String xpath = "//input[@title=\"organization\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static void inputOrganization() {
        getOrganizationField().sendKeys(Setup.registrantTestData.getOrganization());
    }

    public static boolean orgFieldIsHidden() {
        return !Finder.elementIsVisible(By.xpath("//input[@title='organization']"));
//        return Go.elementIsVisible(By.xpath("//input[@title=\"organization\"]"));
    }

    public static WebElement getRegisterButton() {
        String xpath = "//span[contains(text(),'Register')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getCompleteRequiredFieldsButton() {
        String xpath = "//button[contains(text(),'Please complete the required fields')]";
        return Finder.getByXpath(xpath, true);
    }


    public static void clickRegister() {
        Go.javascriptExecutor("arguments[0].click();", getRegisterButton());
    }

    public static WebElement getOrganizedByTitle() {
        String xpath = "//*[text()= \" organized by \"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getEventOrganizationTitle() {
        String xpath = "//*[@class= \"org-info\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static String getOrgTitleText() {
        return getEventOrganizationTitle().getText();
    }

    public static WebElement getCountryField() {
        String xpath = "//input[@title=\"country\"]";
        return Finder.getByXpath(xpath, true);
    }


    public static void inputCountry() {
        getCountryField().clear();
        getCountryField().sendKeys(Setup.registrantTestData.getCountry());
    }

    public static String getCountryFieldText() {
        return getCountryField().getAttribute("value");
    }


    public static WebElement getPersonaTitle(String personaName) {
        String xpath = String.format("//h2[contains(text(), \"%s\")]", personaName);
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getDiscountField() {
        return Finder.getById("promocode", false);
    }

    public static String getCheckoutAmount() {
        return getCheckoutButton().getText();
    }

    public static void applyDiscount() {
        // Input the discount value into the discount field
        getDiscountField().sendKeys(String.valueOf(Setup.planningTestData.getDiscountAmount()));

        // Click the apply button and wait until the discount is visible
        Go.clickUntilVisibilityOfBy(getApplyButton(), By.xpath("//span[contains(text(),\"" + Setup.planningTestData.getDiscountAmount() + ".00\")]"));

        // Scroll down to the checkout button
        Go.scrollDownToElement(getCheckoutButton());

        // Assert that the checkout amount contains the applied discount
    }


    public static WebElement getCheckoutButton() {

        String name = "Register/ Update";
        return Finder.getByName(name, true);
    }

    public static WebElement getApplyButton() {
        String xpath = "/html/body/main/section/div/div[1]/div/form/div[1]/form/div/div/button";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getMaleLabel() {
        String xpath = "//label[contains(text(),'Male')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getGenderLabel() {
        String xpath = "//label[contains(text(),'Gender')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getFemaleOptionLabel() {
        String xpath = "//label[contains(text(), \"Female\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getGenderNotifier() {
        String xpath = "//div/div[1]/div/form/div[1]/div[5]/div/div/div[1]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSingleSelectOption1OptionLabel() {
        String xpath = "//label[contains(text(), \"Single select option1\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getRegFormEmailText() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getRegFormEmailText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getFullNameFieldByBelowElement() {
        return Finder.getByBelowElement("label", getRegFormEmailText(), false);
    }

    public static WebElement getFemaleLabel() {
        String xpath = "//label[contains(text(),'Female')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getRegFormPhoneNumberText() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getRegFormPhoneNumberText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getEmailFieldOrder() {
        return Finder.getByBelowElement("label", getRegFormPhoneNumberText(), false);
    }

    public static WebElement getRegFormJobTittleText() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getJobTitleLabelText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getPhoneNumberFieldOrder() {
        return Finder.getByBelowElement("label", getRegFormJobTittleText(), false);
    }

    public static WebElement getRegFormOrganizationText() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getOrganizationLabelText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getJobTitleFieldOrder() {
        return Finder.getByBelowElement("label", getRegFormOrganizationText(), false);
    }

    public static WebElement getRegFormCountryText() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getRegFormCountryText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getOrganizationFieldOrder() {
        return Finder.getByBelowElement("label", getRegFormCountryText(), false);
    }

    public static WebElement getRegFormGenderText() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getRegFormGenderText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getCountryFieldOrder() {
        return Finder.getByBelowElement("label", getRegFormGenderText(), false);
    }

    public static WebElement getRegFormAgeText() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getRegFormAgeGroupText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getGenderFieldOrder() {
        return Finder.getByBelowElement("label", getRegFormAgeText(), false);
    }

    public static WebElement getRegFormSingleSelectText() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getRegFormSingleSelectText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getAgeFieldOrder() {
        return Finder.getByBelowElement("label", getRegFormSingleSelectText(), false);
    }

    public static WebElement getPlainText() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getPlainTextNewLabel() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSingleSelectOrder() {
        return Finder.getByBelowElement("label", getPlainText(), false);
    }

    public static WebElement getNumeric() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getRegFormNumericText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getPlainTextOrder() {
        return Finder.getByBelowElement("label", getNumeric(), false);
    }

    public static WebElement getMultipleSelect() {
        String xpath = "//label[text() = \"" + Setup.planningTestData.getRegFormMultipleSelectText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getNumericOrder() {
        return Finder.getByBelowElement("label", getMultipleSelect(), false);
    }


    public static WebElement getAgeGroupOptionLabel() {
        String xpath = "//label[contains(text(), \"46-65\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getAgeGroupNotifier() {
        String xpath = "//div[1]/div[6]/div/div/div[1]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getEventTitle() {
        return Finder.getByPartialText(CreateGroupFormPOM.getCreateGroupFormTestData().getMainPersonaName(), "*", false);
    }

    public static WebElement getPlainTextInputBox() {
        String xpath = "//input[@title=\"input\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputOnPlainTextBox() {
        getPlainTextInputBox().sendKeys(Setup.planningTestData.getPlainTextInputText());
    }

}
