package MultipleWindows;

import Pages.MultipleWindowsPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleWindowsTest extends BaseTest {
    @Test
    public void multipleWindowTest(){
        MultipleWindowsPage multipleWindowsPage =homePage.multipleWindowsPage();

        multipleWindowsPage.clickNewWindoLink();
        multipleWindowsPage.navigateToNewWindo();
        Assert.assertTrue(multipleWindowsPage.checkCurrentURL());

    }
}
