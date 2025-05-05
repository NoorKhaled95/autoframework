package tests.organizer.eventsTimeline;

import base.Finder;
import org.openqa.selenium.WebElement;

public class AddCrewPOM {
    public static WebElement getAddCrewButton() {
        return Finder.getByXpath("//button[@mattooltip='Add Crew']", true);
    }

    public static WebElement getEmailFieldLabel() {
        return Finder.getByExactText("Invite your onsite team", "div", false);
    }
    public static WebElement getEmailField() {
        return Finder.getByLeftElement("input",getEmailFieldLabel(),false);
    }

    public static WebElement getInvitedMembersLabel() {
        return Finder.getByExactText("Invited members", "div", false);
    }

    public static WebElement getBackButton() {
        return Finder.getByExactText(" Back ", "button", true);
    }

}
