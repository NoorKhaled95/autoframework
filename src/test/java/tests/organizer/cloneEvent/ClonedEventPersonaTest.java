package tests.organizer.cloneEvent;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.organizer.personaPage.PersonaPagePOM.*;

public class ClonedEventPersonaTest {

    @Test(priority = 1)
    public void verifyPersonaMaxRegClonedCorrectly() {
        Assert.assertEquals(getMaxRegFieldText(), Setup.planningTestData.getMediaMaxReg());
    }

    @Test(priority = 2)
    public void verifyPersonaZubZoneClonedCorrectly() {
        Assert.assertEquals(getMediaSubZoneElementText(), Setup.planningTestData.getInPersonSubZoneName());
    }

    @Test(priority = 3)
    public void VerifySenderNameClonedCorrectly() {
        Assert.assertEquals(getSenderFieldText(), Setup.flowTestData.getEventName());
    }

    @Test(priority = 4)
    public void verifyReplyToClonedCorrectly() {
        Assert.assertEquals(getReplyToFieldText(), Setup.planningTestData.getReplyToEmail());
    }

    @Test(priority = 5)
    public void verifyEmailSubjectClonedCorrectly() {
        Assert.assertEquals(getEmailSubjectFieldText(), Setup.planningTestData.getEmailSubject());
    }

    @Test(priority = 6)
    public void verifyQRColorClonedCorrectly() {
        Assert.assertEquals(getQRSrcText(), Setup.planningTestData.getQRSrc());
    }
}