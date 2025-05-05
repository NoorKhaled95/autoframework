package tests.crew.authentication;

import base.Finder;
import org.openqa.selenium.WebElement;

public class SignInPOM {
    public static WebElement getEmailField() {
        String xpath = "//input[@id='email']";
        return Finder.getByXpath(xpath, false);
    }


    public static boolean emailFieldIsDisplayed() {
        return getEmailField().isDisplayed();
    }


    public static WebElement getPasswordField() {
        String xpath = "//input[@placeholder=\"Password\"]";
        return Finder.getByXpath(xpath, false);
    }


    public static WebElement getLoginBtn() {
        String xpath = "//button[@type=\"submit\"]";
        return Finder.getByXpath(xpath, true);
    }


    public static WebElement getUserName() {
        String xpath = "//*[@class=\"user-name\"]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getSignOutBtn() {
        String xpath = "//div[text()= 'Sign out']";
        return Finder.getByXpath(xpath, false);
    }


}
