package tests.production;

import base.Finder;
import org.testng.annotations.Test;

public class AcceptCookiesTest {
    @Test
    public void acceptCookies(){
        Finder.getById("hs-eu-confirmation-button", true).click();
    }
}
