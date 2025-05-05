package tests.organizer.signup;

import base.Finder;
import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import static base.Setup.driver;
import static base.Setup.flowTestData;


public class SignUpSignInPOM {
    public static WebElement getSignUpSignInTitle() {
        String xpath = "//*[text() = \"" + Setup.planningTestData.getSignInSignUpText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static String getSignUpSignInTitleText() {
        return getSignUpSignInTitle().getText();
    }

    public static WebElement getSignUpTitle() {
        String xpath = "//*[text() = \"" + Setup.planningTestData.getSignUpText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static String getSignUpButtonText() {
        return getSignUpTitle().getText();
    }


    public static WebElement getSignInTitle() {
        String xpath = "//*[text() = \"" + Setup.planningTestData.getSignInText() + "\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getEmailField() {
        String xpath = "//*[@formcontrolname=\"email\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputEmail() {
        getEmailField().sendKeys(flowTestData.getWorkspaceEmail());
    }

    public static WebElement getPasswordField() {
        String xpath = "//*[@formcontrolname=\"password\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputPassword() {
        getPasswordField().sendKeys(Setup.planningTestData.getPassword());
    }

    public static WebElement getPasswordNotMachErrorMsg() {
        String xpath = "//mat-error[@id=\"mat-error-8\"]";
        return Finder.getByXpath(xpath, true);
    }
    public static boolean getPasswordNotMachErrorMsgIsHidden() {
        try{
            driver.findElement(By.xpath("//mat-error[@id=\"mat-error-8\"]")).isDisplayed();
            return false;
        } catch (NoSuchElementException e){
            return true;
        }
    }

    public static WebElement getSignUpSignInButton() {
        String xpath = "//*[@id=\"loginSignup\"]/button";
        return Finder.getByXpath(xpath, true);
    }

    public static String getSignUpSignInButtonText() {
        return getSignUpSignInButton().getText();
    }

    public static WebElement getConfirmPasswordField() {
        String xpath = "//*[@formcontrolname=\"password_confirmation\"]";
        return Finder.getByXpath(xpath, true);
    }

    public static void inputConfirmPassword() {
        getConfirmPasswordField().sendKeys(Setup.planningTestData.getPassword());
    }

    public static WebElement getSignInWihGoogleButton() {
        String xpath = " //button[@type=\"button\"]//span[contains(text(),'Continue with Google')]";
        return Finder.getByXpath(xpath, false);
    }

    public static void alertAccept() {
        Go.alertAccept();
    }
}
