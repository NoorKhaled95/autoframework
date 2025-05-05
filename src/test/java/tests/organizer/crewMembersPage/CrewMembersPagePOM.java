package tests.organizer.crewMembersPage;

import base.Finder;
import base.Go;
import org.openqa.selenium.WebElement;

public class CrewMembersPagePOM {

    public static WebElement getOpenCrewSystemBtn() {
        String xpath = "//button[contains(text(),'Open Crew System')]";
        return Finder.getByXpath(xpath, false);
    }

    public static WebElement getAssignOrganizerBtn(){
        String xpath = "//a[contains(text(),'Assign')]";
        return Finder.getByXpath(xpath, true);
    }

    public static WebElement getAssignedBtn(){
        String xpath = "//div[contains(text(),'Assign')]";
        return Finder.getByXpath(xpath, true);
    }

    public static void openCrewSystem() {
        Go.openUrl("https://crew.staging.micetribe.com/home/events");
    }
}
