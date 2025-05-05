package tests.crew.onsiteRegistration;

import base.Go;
import base.Setup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static tests.crew.onsiteRegistration.groupForm.CrewGroupRegistrationPOM.*;

public class OpenEventTest {
    @Test(priority = 1)

    public void selectEvent() {
        Go.waitIfToastVisible();
        getEvent(Setup.flowTestData.getEventName()).click();
    }
}
