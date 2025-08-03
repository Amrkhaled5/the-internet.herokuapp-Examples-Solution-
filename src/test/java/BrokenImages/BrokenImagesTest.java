package BrokenImages;

import Pages.BrokenImagesPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenImagesTest extends BaseTest {
    @Test
    public void BrokenimagesTest() {
        BrokenImagesPage brokenImagesPage=homePage.brokenImagesPage();

        Assert.assertEquals(2,brokenImagesPage.getNumberOfBrokenImages());
    }
}
