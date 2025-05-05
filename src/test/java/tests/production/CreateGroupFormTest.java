package tests.production;

import org.testng.annotations.Test;

import static tests.production.CreateGroupFormPOM.*;

public class CreateGroupFormTest {

    @Test(priority = 1)
    public void fillFormSuccessfully() throws InterruptedException {
        fillWorkSpace();
        fillEventSlug();
        selectMainFormSlug();
        selectSubFormSlug();
        fillTitlesMain();
        fillAdditional();
        fillAddLabel();
        fillMaximumEntries();
        fillMinimumEntries();
    }

//    @Test(priority = 2, groups = "haltWhenFail")
//    public void createGroupFormSuccessfully() throws InterruptedException {
//        getCreateFormButton().click();
//        Thread.sleep(2000);
//        Assert.assertTrue(Finder.getByPartialText("Group form created successfully", "*", false).isDisplayed());
//    }

}
