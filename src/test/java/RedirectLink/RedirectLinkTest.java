package RedirectLink;

import Pages.RedirectLinkPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedirectLinkTest extends BaseTest {
    @Test
    public void redirectLinkTest(){
        RedirectLinkPage redirectLinkPage=homePage.redirectLinkPage();

        redirectLinkPage.clickStatusCodePageLink();
        Assert.assertTrue(redirectLinkPage.checkURL());
    }
}
