package tests.organizer;

import base.Go;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenLinkTest {
    @Test
    @Parameters({"url"})
    public void openUrl(String url) throws InterruptedException {
        Thread.sleep(2000);
        Go.openUrl(url);
        Assert.assertTrue(true);
    }
}
