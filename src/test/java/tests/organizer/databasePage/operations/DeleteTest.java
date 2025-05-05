package tests.organizer.databasePage.operations;

import org.testng.Assert;
import org.testng.annotations.Test;
import static tests.organizer.databasePage.operations.OperationsPOM.*;
public class DeleteTest {
    @Test(priority = 1)
    public void deleteBtnIsDisplayed(){
        Assert.assertTrue(getDeleteBtn().isDisplayed());
    }
    @Test(priority = 2)
    public void deleteBtnPopupIsDisplayed()throws InterruptedException{
        Thread.sleep(5000);
        getDeleteBtn().click();
        Assert.assertTrue(getDeleteBtnPopup().isDisplayed());
    }

    @Test(priority = 3)
    public void numOfDeletedUsersFieldIsDisplayed(){
        Assert.assertTrue(getNumOfDeletedUsersField().isDisplayed());
    }

    @Test(priority = 4)
    public void verifyNoRegsIsDisplayed()throws InterruptedException{
        inputOnNumOfDeletedUsersField();
        Thread.sleep(5000);
        ClickOnDeleteBtnPopup();
        Thread.sleep(5000);
        Assert.assertTrue(getNoRegs().isDisplayed());
    }

}
