package LargeAndDeepDOM;

import Pages.LargeAndDeepDOMPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LargeAndDeepDOMTest extends BaseTest {
    @Test
    public void largeAndDeepDomeTest() throws InterruptedException {
        LargeAndDeepDOMPage largeAndDeepDOMPage=homePage.largeAndDeepDOMPage();

        largeAndDeepDOMPage.scrollToTable();
        largeAndDeepDOMPage.scrollToTheEndOfTable();
        Thread.sleep(2000);
        Assert.assertEquals("50.50",largeAndDeepDOMPage.getLasrElementInTable());
    }
}
