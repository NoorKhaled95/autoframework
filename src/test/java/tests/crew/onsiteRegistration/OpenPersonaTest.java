package tests.crew.onsiteRegistration;

import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static tests.crew.onsiteRegistration.groupForm.CrewGroupRegistrationPOM.*;

public class OpenPersonaTest {

    @Test(priority = 1)
    public void clickAddPersona() throws InterruptedException {
        Go.waitIfToastVisible();
        Thread.sleep(2000);
        Go.clickUntilVisibilityOfBy(getAddPersona(), By.xpath("//div[text()=' " + Setup.flowTestData.getMainPersonaName() + " ']"));
    }

    @Test(priority = 3)
    public void selectPersona() {
        System.out.println(Setup.flowTestData.getMainPersonaName());
        getPersonaBox(Setup.flowTestData.getMainPersonaName()).click();
    }

    @Test(priority = 4)
    public void selectPersonaTab() {
        getPersonaTab(Setup.flowTestData.getMainPersonaName()).click();
    }
}
