package tests.organizer.personaPage;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static base.Setup.*;

public class PersonaPagePOM {


    public static WebElement getSideBarPersonaIcon() {
        String xpath = "//div//i[@class=\"flaticon-pass\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getGenericPersonaTitle() {
        String xpath = "//div//div//strong[contains(text(),'Generic')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getPersonaGenericTittleField() {
        return Finder.getByRightElement("input", getMaxRegField(), true);
    }

    public static void inputGenericPersonaTittle() {
        getPersonaGenericTittleField().clear();
        getPersonaGenericTittleField().sendKeys(planningTestData.getGenericPersonaTittle());
    }

    public static String getGenericPersonaTittleText() {
        return getPersonaGenericTittleField().getAttribute("value");
    }

    public static WebElement getVisitorPersonaTitle() {
        String xpath = "//strong[contains(text(),'Visitor')]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getPersonaTitle() {
        String xpath = "//button[contains(text(),'" + flowTestData.getMainPersonaName() + "')]";
        System.out.println(xpath);
        //button[contains(text(),'Media')]
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getPersonaVisitorTittleField() {
        return Finder.getByAboveElement("input", getMaxRegField(), true);
    }

    public static WebElement getPersonaTittleField() {
        return Finder.getByRightElement("input", getMaxRegField(), true);
    }

    public static void inputPersonaTittleField() {
        getPersonaTittleField().sendKeys(flowTestData.getMainPersonaName());
    }

    public static String getPersonaTittleText() {
        return getPersonaTittleField().getAttribute("value");
    }

    public static WebElement getNewPersonaTittleField() {
        return Finder.getByRightElement("input", getMaxRegField(), true);
    }

    public static WebElement getPersonaElement() {
        String xpath = "//strong[contains(@class, 'persona-title') and text()=' "+ flowTestData.getMainPersonaName()+" ']";
        return Finder.getByXpath(xpath, true);
    }

    public static void clickPersonaElement() {
//        getPersonaElement().click();
        Go.clickWithJavaScript(getPersonaElement());
        System.out.println("Persona name: " + Setup.flowTestData.getMainPersonaName());
        System.out.println("Locator used: " + getPersonaElement().toString());
    }

    public static void inputMediaPersonaTittle() {
        getNewPersonaTittleField().clear();
        getNewPersonaTittleField().sendKeys(flowTestData.getMainPersonaName());
    }


    public static void inputStudentPersonaTittle() {
        getNewPersonaTittleField().clear();
        getNewPersonaTittleField().sendKeys(flowTestData.getMainPersonaName());
    }
    public static String getNewPersonaTittleText() {
        return getNewPersonaTittleField().getAttribute("value");
    }

    public static WebElement getClonePersonaIcon() {
        String xpath = "//a[contains(@class, 'icon-container') and @href='#']//nb-icon[contains(@ng-reflect-config, 'copy')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getClonedPersona() {
        return Finder.getByPartialText(flowTestData.getMainPersonaName(), "strong", false);
    }

    public static WebElement getMaxRegField() {
        String xpath = "//*[@placeholder=\"Maximum registrations e.g. 300\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static void inputMaxRegistrationValue() {
        getMaxRegField().sendKeys(planningTestData.getMaxReg());
    }

    public static String getMaxRegFieldText() {
        return getMaxRegField().getAttribute("value");
    }


    public static WebElement getProtectRegByPasscodeText() {
        String xpath = "//span[contains(text(),'Protect registration form by a passcode')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getPasscodeToggle() {
        return Finder.getByRightElement("span", getProtectRegByPasscodeText(), false);
    }

    public static WebElement getPasscodeField() {
        String xpath = "//input[@placeholder='Set a passcode']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getPasscodeFieldText() {
        return getPasscodeField().getAttribute("value");
    }

    public static void inputPasscodeField() {
        getPasscodeField().sendKeys(Setup.flowTestData.getPersonaPassCode());
    }

    public static WebElement getRegistrationFormTitle() {
        String xpath = "//nb-card-header[contains(text(),'Registration form')]";
        return Finder.getByXpath(xpath, false);
    }


    ////////////////////////////////////////////////
    public static WebElement getAddRegistrationFormLanguageIcon() {
        String xpath = "/html/body/ngx-app/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-micetribe-wizard/div/div/ngx-personas-edit/form/nb-accordion/nb-accordion-item/nb-accordion-item-body/div/div/ngx-persona-form/div/ngx-personas-form-elements/div/div/div/nb-card/nb-card-body/div/div[1]/div/ngx-form-languages/ngx-micetribe-tags/div/div";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSelectArabicLanguageCheckBox() {
        String xpath = "//span[contains(text(),\"عربي\")]";
        return Finder.getByXpath(xpath, true);
    }
    public static boolean getArabicLangIsChecked() {
        //todo use is selected webdriver function
        return (getRequiredOnlineCheckbox().getAttribute("class").equals("custom-checkbox checked"));
    }

    public static WebElement getDoneBtnToAddNewLang() {
        String xpath = "//button[contains(text(),\"Done\")]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getSelectedLang() {
        String xpath = "//ngx-micetribe-tag//div//span[contains(text(),\"عربي\")]";
        return Finder.getByXpath(xpath, true);
    }

///////////////


    public static WebElement getPersonaEmailFieldLabelTitle() {
        String xpath = "//div//input[contains(@ng-reflect-model,\"E-mail\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getEmailSettingsIcon() {
        return Finder.getByLeftElement("mat-icon", getPersonaEmailFieldLabelTitle(), true);
    }

    public static WebElement getRequiredOnline() {
        String xpath = "//span[contains(text(),\" Required Online \")]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getRequiredOnlineCheckbox() {
        String xpath = "//nb-checkbox//label//span[contains(@class, 'custom-checkbox checked')]";
        return Finder.getByXpath(xpath, false);
    }

    public static boolean getEmailRequiredOnlineIsChecked() {
        return (getRequiredOnlineCheckbox().getAttribute("class").equals("custom-checkbox checked"));
    }

    public static WebElement getOrganizationFieldLabel() {
        String xpath = "//div//input[contains(@ng-reflect-model,\"Organization\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getOrgSettingsIcon() {
        return Finder.getByLeftElement("mat-icon", getOrganizationFieldLabel(), true);
    }

    public static void clickOnOrgSettingIcon() {
        Go.scrollDownToElement(getOrgSettingsIcon());
        getOrgSettingsIcon().click();
    }


    public static WebElement getOrganizationHideOnline() {
        String xpath = "//span[contains(text(),\" Hide Online \")]";
        return Finder.getByXpath(xpath, true);
    }
    public static boolean getOrgHidedOnlineIsChecked() {
        //todo user webdriver function isSelected
        return (getRequiredOnlineCheckbox().getAttribute("class").equals("custom-checkbox checked"));
    }

    public static WebElement getUniqueField() {
        String xpath = "//span[contains(text(),\" Unique \")]";
        return Finder.getByXpath(xpath, true);
    }

    public static boolean getEmailUniqueIsChecked() {
        //todo user webdriver function isSelected
        return (getRequiredOnlineCheckbox().getAttribute("class").equals("custom-checkbox checked"));
    }


    public static WebElement getAddAFiledButton() {
        String xpath = "//button[contains(text(),'Add a field')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getMsgAndInfoTitle() {
        String xpath = "//h6[contains(text(),'Messages & Info')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getPreApproveToggle() {
        //todo update the locator
        String xpath = "/html/body/ngx-app/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-micetribe-wizard/div/div/ngx-personas-edit/form/nb-accordion/nb-accordion-item/nb-accordion-item-body/div/div/ngx-persona-form/div/div[3]/div[4]/div/div/nb-toggle/label/div/span";
//        String xpath = "(//DIV[@_ngcontent-dcb-c235=''])[2]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getTicketPriceTitle() {
        String xpath = "//h6[contains(text(),'Ticket Price')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getPersonaPaysToggle() {
        //todo update the locator
        String xpath = "/html/body/ngx-app/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-micetribe-wizard/div/div/ngx-personas-edit/form/nb-accordion/nb-accordion-item/nb-accordion-item-body/div/div/ngx-persona-form/div/div[4]/div[2]/div[1]/nb-toggle/label/div";
//        String xpath = "(//LABEL[@_ngcontent-dcb-c235=''])[3]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getAddAPersonaArea() {
        String xpath = "//div[contains(@class,'add-persona')]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getFinishAndShareBtn() {
        String xpath = "//button[contains(text(),'Finish & Share')]";
        return Finder.getByXpath(xpath, true);
    }

    public static void clickFinishAndShareBtn() throws InterruptedException {
        Go.waitIfToastVisible();
        Thread.sleep(2000);
        String xpath = "//button[contains(text(),'Close')]";
        Go.clickUntilVisibilityOfBy(getFinishAndShareBtn(), By.xpath(xpath));
    }


    public static WebElement getLandingPageShareIcon(String personaName) {
        String registrationForm = "Registration Landing Page";
        String xpath = String.format("//*[text()=' %s ']/following-sibling::div//a[@ng-reflect-content='%s']", personaName, registrationForm);
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getRawRegIcon() {
        String xpath = "//a[contains(@ng-reflect-content,'Raw registration form')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getCloseBtn() {
        String xpath = "//button[contains(text(),'Close')]";
        return Finder.getByXpath(xpath, false);
    }

    public static void clicksOnCloseBtn() {
        Go.clickUntilVisibilityOfBy(getCloseBtn(), By.xpath("//div[contains(text(), \" EVENTS TIMELINE \")]"));
    }

    public static WebElement getZoneAccessTitle() {
        String xpath = "//*[text() = \"" + planningTestData.getZoneAccess() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getMediaSubZoneElement() {
        String xpath = "//div[contains(@class, 'tag-item') and text()='" + planningTestData.getInPersonSubZoneName() + "']";
        return Finder.getByXpath(xpath, true);
    }

    public static String getMediaSubZoneElementText() {
        return getMediaSubZoneElement().getText();
    }

    public static WebElement getSenderNameLabel() {
        String xpath = "//DIV[contains(text(),\"Sender name\")]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getSenderNameField() {
        String xpath = "//input[@placeholder=\"Sender name\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static String getSenderFieldText() {
        return getSenderNameField().getAttribute("value");
    }

    public static WebElement getReplyToLabel() {
        String xpath = "//DIV[contains(text(),\"Reply to\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getReplyToField() {
        String id = "email_reply";
        return Finder.getById(id, false);
    }

    public static String getReplyToFieldText() {
        return getReplyToField().getAttribute("value");
    }

    public static WebElement getEmailSubjectField() {
        String id = "email_subject";
        return Finder.getById(id, false);
    }

    public static String getEmailSubjectFieldText() {
        return getEmailSubjectField().getAttribute("value");
    }

    public static WebElement getSelectFieldType() {
        String xpath = "//button[contains(text(),'Select field type')]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getGenderField() {
        String xpath = "//nb-option[contains((text()),'Gender')]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getSelectAddAgeGroupField() {
        String xpath = "//nb-option[contains((text()),'Age group')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getPlainTextField() {
        String xpath = "//nb-option[contains((text()),'Plain text')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getSingleSelectField() {
        String xpath = "//nb-option[contains((text()),'Single select')]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getOption1() {
        String xpath = "//input[@ng-reflect-model=\"option1\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputSingleSelectOption1() {
        getOption1().clear();
        getOption1().sendKeys(planningTestData.getSingeSelectOption1Text());
    }

    public static WebElement getAddAnOptionButton() {
        String xpath = "//*[@id=\"cdk-drop-list-5\"]/div/div/button";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getSecondSingleSelectOption() {
        String xpath = "(//input[@placeholder='Option'])[8]";
        return Finder.getByXpath(xpath, false);
    }
    public static void inputSingleSelectOption2() {
        getSecondSingleSelectOption().click();
        getSecondSingleSelectOption().sendKeys(planningTestData.getSingeSelectOption2Text());
    }

    public static WebElement getMultipleSelectField() {
        String xpath = "//nb-option[contains((text()),'Multiple select')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getNumericField() {
        String xpath = "//nb-option[contains((text()),'Numeric')]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getGenderTitleField() {
        String xpath = "//input[@ng-reflect-model=\"Gender\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getAgeGroupTitleField() {
        String xpath = "//input[@ng-reflect-model=\"Age group\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getPlainTextTypeField() {
        return Finder.getByPartialText("Plain text","button", false);
    }

    public static void inputOnPlainText() {
        getPlainTextOptionField().clear();
        getPlainTextOptionField().sendKeys(planningTestData.getPlainTextNewLabel());
    }
    public static WebElement getPlainTextOptionField(){
        return Finder.getByXpath("//input[@ng-reflect-model='Plain text']", false);
//        return Finder.getByXpath("//input[@ng-reflect-model='Plain text 1']",false);
    }
    public static WebElement getSingleSelectTitleField() {
        String xpath = "//input[@ng-reflect-model=\"Single select\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getMultipleSelectTitleField() {
        String xpath = "//input[@ng-reflect-model=\"Multiple select\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getNumericTitleField() {
        String xpath = "//input[@ng-reflect-model=\"Numeric\"]";
        return Finder.getByXpath(xpath, true);
    }
    public static WebElement getAvailableOptionsTitle() {
        String xpath = "//strong[contains(text(),'Available options')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getMaleOptionField() {
        String xpath = "//input[@ng-reflect-model=\"Male\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getFemaleOptionField() {
        String xpath = "//input[@ng-reflect-model=\"Female\"]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement get24Field() {
        String xpath = "//input[@ng-reflect-model=\"<24\"]";
//        String xpath = "(//*[@class=\"input-full-width size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-valid nb-transition\"])[3]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getUpdated24Field() {
        String xpath = "//input[@ng-reflect-model=\"test\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getOption1Field() {
        String xpath = "//input[@ng-reflect-model=\"option1\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getUpdatedOption1TextField() {
        String xpath = "//input[@ng-reflect-model=\"Single select option1\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getAddAnOptionBtn() {
        String xpath = "//*[contains(text(),'Add an option')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getChangeQRCodeColorText() {
        String xpath = "//p[contains(text(),'Change QRCode color')]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getChangeColorIcon() {
        return Finder.getByRightElement("button", getChangeQRCodeColorText(), true);
    }

    public static WebElement getSelectColor() {
        String xpath = "//span[text()=' Red ']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSaveColorBtn() {
        String xpath = "//button[text()='SAVE']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getPersonalizeIcon() {
        String xpath = "//mat-icon[text()='contact_mail']";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getFirstNamePersonalize() {
        String xpath = "//span[contains(text(), \"First name - {{firstname}}\")]";
        return Finder.getByXpath(xpath, false);
    }
    public static WebElement getCopiedMsg() {
        String xpath = "//span[contains(@class, \"title subtitle\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getMsgBox() {
        String xpath = "//editor[contains(@ng-reflect-model, \"<p>Thank you for registering.<\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static void pastePersonalize() {
        Go.paste(getMsgBox());
    }

    public static WebElement getQRAfterChange() {
        String xpath = "//div[contains(@class, \"bar-group\")]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getQRImgSrc() {
        String xpath = "//div[contains(@class, \"bar-group\")]//img[@src]";
        return Finder.getByXpath(xpath, false);
    }


    public static String getQRSrcText() {
        return getQRImgSrc().getText();
    }

    public static void setQRSrc() {
        System.out.println(getQRSrcText());
        planningTestData.setQRSrc(getQRSrcText());
    }
}
