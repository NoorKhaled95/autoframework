package tests.crew.customizeBadge;

import base.Finder;
import base.Go;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomizeBadgePOM {
    public static boolean hideQRCode() {
        Go.switchBackToMainFrame();
        getQrCodeOption().click();
        switchToPrintPanelFrame();
        return !Go.elementIsVisible(By.xpath("//img[@class='qrcode-image']"));
    }

    public static void showQRCode() throws InterruptedException {
        Go.switchBackToMainFrame();
        Thread.sleep(1000);
        getQrCodeOption().click();
        switchToPrintPanelFrame();
    }

    public static boolean hidePersonaName() {
        Go.switchBackToMainFrame();
        Go.waitForElementToBeClickable(getPersonaCheckBox());
        Go.clickWithJavaScript(getPersonaCheckBox());
        switchToPrintPanelFrame();
        return !Go.elementIsVisible(By.xpath("//div[@class='persona']"));
    }

    public static void showPersonaName() {
        Go.switchBackToMainFrame();
        Go.waitForElementToBeClickable(getPersonaCheckBox());
        Go.clickWithJavaScript(getPersonaCheckBox());
        switchToPrintPanelFrame();
    }

    public static boolean hideFullName() {
        Go.switchBackToMainFrame();
        Go.waitForElementToBeClickable(getFullnameCheckBox());
        Go.clickWithJavaScript(getFullnameCheckBox());
        switchToPrintPanelFrame();
        return !(Go.elementIsVisible(By.xpath("//div[@class='mb-2 fullname']")));
    }

    public static void showFullName() {
        Go.switchBackToMainFrame();
        Go.waitForElementToBeClickable(getFullnameCheckBox());
        Go.clickWithJavaScript(getFullnameCheckBox());
        switchToPrintPanelFrame();
    }

    public static void saveTemplate() {
        Go.switchBackToMainFrame();
        getSaveButton().click();
        Go.waitIfToastVisible();
    }

    public static WebElement getPrintSampleButton() {
        return Finder.getByXpath("//button[text()='Print sample']", true);
    }

    public static WebElement getQrCodeInBadge() {
        return Finder.getByXpath("//img[@class='qrcode-image']", false);
//        return Finder.getByXpath("/html/body/div[2]/div/div[3]/img",false);
    }

    public static WebElement getPersonaInBadge() {
        return Finder.getByXpath("//div[@class='persona']", false);
    }

    public static WebElement getFullnameInBadge() {
        return Finder.getByXpath("//div[@class='mb-2 fullname']", false);
    }

    public static WebElement getPersonaOption() {
        return Finder.getByXpath("//span[text()='Persona']", true);
    }

    public static WebElement getPersonaCheckBox() {
        return Finder.getByXpath("(//input[@class='mat-checkbox-input cdk-visually-hidden'])[1]", true);
    }

    public static WebElement getQrCodeOption() {
        return Finder.getByXpath("//span[text()='QR Code']", false);
    }

    public static WebElement getQrCodeCheckBox() {
        return Finder.getByXpath("(//input[@class='mat-checkbox-input cdk-visually-hidden'])[2]", true);
    }

    public static WebElement getShowCodeOption() {
        return Finder.getByXpath("//span[text()='Show code']", false);
    }

    public static WebElement getShowCodeCheckBox() {
        return Finder.getByXpath("(//input[@class='mat-checkbox-input cdk-visually-hidden'])[3]", true);
    }

    public static WebElement getFullnameOption() {
        return Finder.getByXpath("//span[text()=' Full name']", false);
    }

    public static WebElement getFullnameCheckBox() {
        return Finder.getByXpath("(//input[@class='mat-checkbox-input cdk-visually-hidden'])[4]", true);
    }

    public static WebElement getJobTitleOption() {
        return Finder.getByXpath("//span[text()=' Job title']", false);
    }

    public static WebElement getJobTitleCheckBox() {
        return Finder.getByXpath("(//input[@class='mat-checkbox-input cdk-visually-hidden'])[5]", true);
    }

    public static WebElement getOrganizationOption() {
        return Finder.getByXpath("//span[text()=' Organization']", false);
    }

    public static WebElement getOrganizationCheckBox() {
        return Finder.getByXpath("(//input[@class='mat-checkbox-input cdk-visually-hidden'])[6]", true);
    }

    public static WebElement getCancelButton() {
        return Finder.getByXpath("//button[text()='Cancel']", true);
    }

    public static WebElement getSaveButton() {
        return Finder.getByXpath("//button[text()=' Save ']", true);
    }

    public static WebElement getSyncUpdatesButton() {
        return Finder.getByXpath("//span[text()='Sync updates']", true);
    }

    public static WebElement getCloseSearchButton() {
        String xpath = "//*[@class='mat-icon notranslate material-icons mat-icon-no-color']";
//        return Setup.driver.findElement(By.xpath(xpath));
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getLogo() {
        return Finder.getByXpath("(//img[@alt='micetribe crew logo'])[1]", true);
    }

    public static void switchToPrintPanelFrame() {
        String printPreviewXpath = "//iframe[@class='w-100']";
        Go.switchToFrameByXpath(printPreviewXpath);
    }

}
