package tests.crew.onsiteRegistration.singleForm;

import base.Finder;
import org.openqa.selenium.WebElement;


public class CrewRegistrationPOM {
    public static WebElement getFullNameField() {
        return Finder.getById("mat-input-1", false);
    }

    public static WebElement getEmailField() {
        return Finder.getById("mat-input-2", false);
    }

    public static WebElement getPhoneNumberField() {
        return Finder.getById("mat-input-3", false);
    }

    public static WebElement getJobTitleField() {
        return Finder.getById("mat-input-4", false);
    }

    public static WebElement getOrganizationField() {
        return Finder.getById("mat-input-5", false);
    }

    public static WebElement getCountryField() {
        return Finder.getById("mat-input-6", false);
    }

    public static WebElement getCashButton() {
        return Finder.getByExactText("Cash","span", true);
//        return Finder.getByXpath("//img[@alt='cash']", false);
    }


    public static WebElement getNoteField() {
        return Finder.getByXpath("//textarea[@placeholder='Add note']", false);
    }

    public static WebElement getSubmitButton() {
        return Finder.getByPartialText("SUBMIT", "span", true);
    }

    public static WebElement getAutoPrintingButton() {
        return Finder.getByXpath("//mat-icon[text()='print_disabled']", true);
    }

    public static WebElement getToastMessage() {
        return Finder.getById("toast-container", false);
    }
    public static WebElement getCrewMarketplaceToastMessage() {
        return Finder.getByXpath("//div[@aria-label='Success']",false);
    }

    public static WebElement getEditForm() {
        return Finder.getByXpath("/html/body/app-root/cf-home-page/div/div[2]/cf-registration/div/div/mice-form-edit/mat-card", false);
    }

    public static WebElement getQrCode() {
//        String xpath="(//div[@class='qr-code d-flex flex-row-reverse justify-content-between col-12'])[2]";
        String xpath = " /html/body/app-root/cf-home-page/div/div[2]/cf-registration/div/div/mice-form-edit/mat-card/div/div[1]/div[1]/div/span/strong";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSearchIcon() {
        return Finder.getByXpath("/html/body/app-root/cf-home-page/sub-header/div/div/div[3]/img[2]", true);
    }

    public static WebElement getSearchField() {
        return Finder.getByXpath("//input[@placeholder='Search Registrations']", false);
    }

    public static WebElement getSearchFirstResult() {
        return Finder.getByXpath("(//div[@class='search-result ng-star-inserted'])[1]", false);
    }

    public static WebElement getUpdateButton() {
        return Finder.getByXpath("//span[text()='UPDATE'][1]", true);
    }

    public static WebElement getPrintButton() {
        return Finder.getByXpath("//span[contains(text(),'PRINT')]", true);
    }

    public static WebElement getJobTitleLabel() {
        return Finder.getByXpath("(//div[@class='search-result ng-star-inserted'])[1]//mat-label[text()='Job title']", false);
    }

    public static WebElement getJobTitleFieldAfterSearch() {
        return Finder.getByXpath("/html/body/app-root/cf-home-page/div/div[2]/cf-search-overlay/div/div[2]/div[2]/div[1]/cf-group-edit/div/mat-card/div[3]/div/div[1]/form/div[4]/mice-input-container/div/div/cf-job-title/mat-form-field/div/div[1]/div[3]/input", false);
    }

    public static WebElement getCloseSearchButton() {
        return Finder.getByXpath("//div[@class='close-overlay']", true);
    }

    public static WebElement getQrCodeElement() {
        return Finder.getByXpath("/html/body/app-root/cf-home-page/div/div[2]/cf-registration/div/div/mice-form-edit/mat-card/div/div[1]/div[1]/div/span/strong", false);
    }

    public static WebElement getPrintAllButton() {
        return Finder.getByPartialText("PRINT ALL", "span", true);
    }


}
